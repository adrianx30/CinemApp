package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import dao.TeatroDAO;
import dto.Pelicula;
import dto.Teatro;
import util.Utility;

/**
 * Created by Adrián on 13/12/2015.
 */
public class TeatroDAOImpl implements TeatroDAO{
    @Override
    public void crearTeatro(Teatro teatro) {
        final ParseObject tea;

        try {
            tea = new ParseObject("Teatro");
            tea.put("nombre", teatro.getNombre());
            tea.put("ciudad", teatro.getCiudad());
            tea.put("direccion", teatro.getDireccion());
            tea.saveInBackground();
        }catch (Exception  e){
            e.printStackTrace();
        }
    }

    @Override
    public Teatro obtenerTeatro(String nombre) {
        Teatro tea = new Teatro();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Teatro");
            query.whereEqualTo("nombre",nombre);
            list = query.find();
            if (list.size() == 0) {
                return null;
            }else {
                tea.setNombre(nombre);
                tea.setCiudad(list.get(0).getString("ciudad"));
                tea.setDireccion(list.get(0).getString("direccion"));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return tea;
    }

    @Override
    public List<Teatro> obtenerTeatroPorCiudad(String ciudad) {
        List<Teatro> teatros = new ArrayList<Teatro>();
        Teatro tea = new Teatro();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Teatro");
            query.whereEqualTo("ciudad",ciudad);
            list = query.find();
            if (list.size() == 0) {
                return null;
            }else {
                for (int x=0;x<list.size();x++) {
                    tea.setNombre(list.get(x).getString("nombre"));
                    tea.setCiudad(ciudad);
                    tea.setDireccion(list.get(x).getString("direccion"));
                    teatros.add(tea);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return teatros;
    }
}
