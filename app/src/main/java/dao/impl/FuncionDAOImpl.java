package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import dao.FuncionDAO;
import dto.Funcion;
import dto.Pelicula;
import dto.Teatro;

/**
 * Created by Adrián on 13/12/2015.
 */
public class FuncionDAOImpl implements FuncionDAO {
    @Override
    public void crearFuncion(Funcion funcion) {
        final ParseObject fun;

        try {
            fun = new ParseObject("Funcion");
            fun.put("funcionId", funcion.getFuncionId());
            fun.put("teatro", funcion.getTeatro().getNombre());
            fun.put("pelicula", funcion.getPelicula().getNombre());
            fun.put("horario", funcion.getHorario());
            fun.saveInBackground();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Funcion> obtenerFunciones(Pelicula pelicula) {
        List<Funcion> funciones = new ArrayList<Funcion>();
        Funcion fun = new Funcion();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        TeatroDAOImpl aux = new TeatroDAOImpl();
        try {
            query = ParseQuery.getQuery("Funcion");
            query.whereEqualTo("pelicula", pelicula.getNombre());
            list = query.find();
            if (list.size() == 0) {
                return null;
            } else {
                for (int x = 0; x < list.size(); x++) {
                    fun.setPelicula(pelicula);
                    fun.setFuncionId(list.get(x).getInt("funcionId"));
                    fun.setHorario(list.get(x).getDate("horario"));
                    fun.setTeatro(aux.obtenerTeatro(list.get(x).getString("teatro")));
                    funciones.add(fun);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return funciones;
    }

    @Override
    public List<Funcion> obtenerFunciones(Teatro teatro) {
        List<Funcion> funciones = new ArrayList<Funcion>();
        Funcion fun = new Funcion();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        PeliculaDAOImpl aux = new PeliculaDAOImpl();
        try {
            query = ParseQuery.getQuery("Funcion");
            query.whereEqualTo("teatro", teatro.getNombre());
            list = query.find();
            if (list.size() == 0) {
                return null;
            } else {
                for (int x = 0; x < list.size(); x++) {
                    fun.setPelicula(aux.obtenerPelicula(list.get(x).getString("pelicula")));
                    fun.setFuncionId(list.get(x).getInt("funcionId"));
                    fun.setHorario(list.get(x).getDate("horario"));
                    fun.setTeatro(teatro);
                    funciones.add(fun);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return funciones;
    }

    @Override
    public Funcion obtenerFuncion(int id) {
        Funcion fun = new Funcion();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        PeliculaDAOImpl auxPel = new PeliculaDAOImpl();
        TeatroDAOImpl auxTea = new TeatroDAOImpl();
        try {
            query = ParseQuery.getQuery("Funcion");
            query.whereEqualTo("funcionId", id);
            list = query.find();
            if (list.size() == 0) {
                return null;
            } else {
                fun.setFuncionId(id);
                fun.setPelicula(auxPel.obtenerPelicula(list.get(0).getString("pelicula")));
                fun.setHorario(list.get(0).getDate("horario"));
                fun.setTeatro(auxTea.obtenerTeatro(list.get(0).getString("teatro")));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return fun;
    }
}
