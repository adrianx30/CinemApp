package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

import dao.EstrenoDAO;
import dto.Cartelera;
import dto.Estreno;

/**
 * Created by Adrián on 08/12/2015.
 */
public class EstrenoDAOImpl implements EstrenoDAO {
    @Override
    public Estreno obtenerEstreno() {
        Estreno c = new Estreno();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Estreno");
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
