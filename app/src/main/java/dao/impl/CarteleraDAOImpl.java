package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

import dao.CarteleraDAO;
import dto.Cartelera;


/**
 * Created by Adrián on 08/12/2015.
 */
public class CarteleraDAOImpl implements CarteleraDAO{
    @Override
    public Cartelera obtenerCartelera() {
        Cartelera c = new Cartelera();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Cartelera");
            list = query.find();
            if (list.size() == 0) {
                return null;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c;
    }
}
