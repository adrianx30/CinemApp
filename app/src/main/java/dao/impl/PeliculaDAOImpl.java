package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

import dao.PeliculaDAO;
import dto.Cartelera;
import dto.Pelicula;
import util.Utility;

/**
 * Created by Adrián on 08/12/2015.
 */
public class PeliculaDAOImpl implements PeliculaDAO {
    @Override
    public Pelicula obtenerPelicula(String nombre) {
        Pelicula pel = new Pelicula();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Pelicula");
            query.whereEqualTo("nombre",nombre);
            list = query.find();
            if (list.size() == 0) {
                return null;
            }else {
                pel.setNombre(list.get(0).getString("nombre"));
                pel.setAño(list.get(0).getInt("year"));
                pel.setIdioma(list.get(0).getString("idioma"));
                pel.setDirector(list.get(0).getString("director"));
                pel.setTrailer(list.get(0).getString("trailer"));
                pel.setFormato(list.get(0).getString("formato"));
                pel.setCensura(list.get(0).getString("censura"));
                pel.setDuracion(list.get(0).getInt("duracion"));
                pel.setGenero(list.get(0).getString("genero"));
                pel.setSipnosis(list.get(0).getString("sipnosis"));
                pel.setReparto(list.get(0).getString("reparto"));
                if (list.get(0).getBytes("foto") != null) {
                    pel.setImagen(Utility.descompressByteArray(list.get(0).getBytes("foto")));
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return pel;
    }
}
