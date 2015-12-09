package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

import dao.PeliculaDAO;
import dto.Cartelera;
import dto.Pelicula;

/**
 * Created by Adrián on 08/12/2015.
 */
public class PeliculaDAOImpl implements PeliculaDAO {
    @Override
    public Pelicula obtenerPelicula() {
        Pelicula p = new Pelicula();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Pelicula");
            list = query.find();
            if (list.size() == 0) {
                return null;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return p;
    }
}
