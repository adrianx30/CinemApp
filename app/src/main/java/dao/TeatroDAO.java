package dao;

import java.util.List;

import dto.Teatro;

/**
 * Created by Adrián on 13/12/2015.
 */
public interface TeatroDAO {

    void crearTeatro(Teatro teatro);
    Teatro obtenerTeatro(String nombre);
    List<Teatro> obtenerTeatroPorCiudad(String ciudad);
}
