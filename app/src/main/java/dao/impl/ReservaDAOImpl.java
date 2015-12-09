package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import dao.ReservaDAO;
import dto.Reserva;
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
            res.put("pelicula", reserva.getPelicula());
            res.put("sala", reserva.getSala());
            res.put("horario", reserva.getHorario());
            res.put("precio", reserva.getPrecio());
            res.put("usuario", reserva.getUsuario());
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
        List<Reserva> r = new ArrayList<Reserva>();
        Reserva res;
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Reserva");
            query.whereEqualTo("usuario", user);

            list = query.find();
            if (list.size() == 0) {
                return null;
            }else {
                res = new Reserva();
                for (int x=0;x<list.size();x++){
                    //res.setPelicula(list.get(x).getParseObject("pelicula"));
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return r;
    }
}
