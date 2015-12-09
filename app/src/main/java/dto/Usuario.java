package dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Adrián on 08/12/2015.
 */
public class Usuario implements Serializable {

    private String nombre;
    private String correo;
    private String contraseña;
    private Boolean logueado;
    private int puntos;


    private List<Reserva> reservas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getLogueado() {
        return logueado;
    }

    public void setLogueado(Boolean logueado) {
        this.logueado = logueado;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
