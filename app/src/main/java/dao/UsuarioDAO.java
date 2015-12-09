package dao;

import android.content.Context;

import java.util.List;

import dto.Usuario;

/**
 * Created by Adrián on 08/12/2015.
 */
public interface UsuarioDAO {

    void crearUsuario(Usuario usuario);

    Usuario obtenerUsuario(String username);

    Usuario obtenerUsuarioPorCorreo(String correo);
}
