package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Adrián on 08/12/2015.
 */
public class Reserva implements Serializable {

    private Funcion funcion;
    private Usuario usuario;
    private List<Silla> sillas;
    private double precio;

    public Funcion getFuncion() {
        return funcion;
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
