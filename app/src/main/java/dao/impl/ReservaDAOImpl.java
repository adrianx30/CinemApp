package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import dao.ReservaDAO;
import dto.Funcion;
import dto.Pelicula;
import dto.Reserva;
import dto.Silla;
import dto.Usuario;

/**
 * Created by Adrián on 08/12/2015.
 */

public class ReservaDAOImpl implements ReservaDAO{
    @Override
    public void crearReserva(Reserva reserva) {

        final ParseObject res;

        try {
            res = new ParseObject("Reserva");
            res.put("funcion", reserva.getFuncion().getFuncionId());
            res.put("precio", reserva.getPrecio());
            res.put("usuario", reserva.getUsuario().getNombre());
            res.put("sillas", reserva.getSillas());
            res.saveInBackground();
        }catch (Exception  e){
            e.printStackTrace();
        }

    }

    @Override
    public Reserva obtenerReserva() {
        return null;
    }

    @Override
    public void modificarReserva(Reserva reserva) {

    }

    @Override
    public void eliminarReserva(Reserva reserva) {

    }

    @Override
    public List<Reserva> obtenerTodasReservas(Usuario user) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva res;
        ParseQuery<ParseObject> queryRes;
        List<ParseObject> listRes;
        FuncionDAOImpl auxFun = new FuncionDAOImpl();

        try {
            queryRes = ParseQuery.getQuery("Reserva");
            queryRes.whereEqualTo("usuario", user.getNombre());

            listRes = queryRes.find();
            if (listRes.size() == 0) {
                return null;
            }else {
                res = new Reserva();
                for (int x=0;x<listRes.size();x++){
                    res.setUsuario(user);
                    res.setPrecio(listRes.get(x).getInt("precio"));

                    res.setSillas((List<Silla>) listRes.get(x).getJSONArray("sillas")); //VERIFICAR!!!!!!!!!!!!!!

                    res.setFuncion(auxFun.obtenerFuncion(listRes.get(x).getInt("funcionId")));
                    reservas.add(res);

                }
                return reservas;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
