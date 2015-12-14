package dao;

import android.content.Context;
import java.util.List;

import dto.Pelicula;
import dto.Usuario;

/**
 * Created by Adrián on 08/12/2015.
 */
public interface PeliculaDAO {

    Pelicula obtenerPelicula(String nombre);


}
