package dao;

import java.util.List;

import dto.Funcion;
import dto.Pelicula;
import dto.Teatro;

/**
 * Created by Adrián on 13/12/2015.
 */
public interface FuncionDAO {

    void crearFuncion(Funcion funcion);
    List<Funcion> obtenerFunciones(Pelicula pelicula);
    List<Funcion> obtenerFunciones(Teatro teatro);
    Funcion obtenerFuncion(int id);



}
