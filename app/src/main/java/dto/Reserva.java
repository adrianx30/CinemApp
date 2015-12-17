package dto;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import dao.impl.FuncionDAOImpl;

/**
 * Created by Adrián on 08/12/2015.
 */
@ParseClassName("Reserva")
public class Reserva extends ParseObject implements Serializable {

    private Funcion funcion;
    private Usuario usuario;
    private double precio;

    private List<Silla> sillas;


    public Funcion getFuncion() {
        FuncionDAOImpl f = new FuncionDAOImpl();
        return f.obtenerFuncion(funcion.getFuncionId());
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
