package dao.impl;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

import dao.SalaDAO;

import dto.Sala;

/**
 * Created by Adrián on 08/12/2015.
 */
public class SalaDAOImpl implements SalaDAO {
    @Override
    public Sala obtenerSala() {
        Sala s = new Sala();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("Sala");
            list = query.find();
            if (list.size() == 0) {
                return null;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return s;
    }
}
