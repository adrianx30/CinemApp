package dto;

import java.io.Serializable;

/**
 * Created by Adrián on 08/12/2015.
 */
public class Silla implements Serializable{

    private Funcion funcion;
    private int fila;
    private int asiento;
    private String estado;

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
