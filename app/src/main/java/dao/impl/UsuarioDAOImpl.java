package dao.impl;

import android.content.Context;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

import dao.UsuarioDAO;
import dto.Usuario;

/**
 * Created by Adrián on 08/12/2015.
 */
public class UsuarioDAOImpl implements UsuarioDAO{
    @Override
    public void crearUsuario(Usuario u) {

        ParseUser usuario = new ParseUser();
        try {
            usuario.setUsername(u.getNombre());
            usuario.setPassword(u.getContraseña());
            usuario.setEmail(u.getCorreo());
            usuario.signUp();

        } catch (ParseException e) {
            e.printStackTrace();

        }

    }

    @Override
    public Usuario obtenerUsuario(String username) {
        Usuario u = new Usuario();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("_User");
            query.whereEqualTo("username", username);

            list = query.find();
            if (list.size() == 0) {
                return null;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public Usuario obtenerUsuarioPorCorreo(String correo) {
        Usuario u = new Usuario();
        ParseQuery<ParseObject> query;
        List<ParseObject> list;
        try {
            query = ParseQuery.getQuery("_User");
            query.whereEqualTo("email", correo);

            list = query.find();
            if (list.size() == 0) {
                return null;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return u;
    }

}
