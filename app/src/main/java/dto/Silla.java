package dto;

import java.io.Serializable;

/**
 * Created by Adrián on 08/12/2015.
 */
public class Silla implements Serializable{

    private Sala sala;
    private int fila;
    private int asiento;
    private String estado;

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
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
