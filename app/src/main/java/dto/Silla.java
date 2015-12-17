package dto;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.io.Serializable;

/**
 * Created by Adrián on 08/12/2015.
 */
@ParseClassName("Silla")
public class Silla extends ParseObject implements Serializable{

    private int funcionId;
    private int fila;
    private int asiento;
    private String estado;

    public int getFuncion() {
        return getInt("funcion");
    }

    public void setFuncion(int funcion) {
        put("funcion",funcion);
    }

    public int getFila() {
        return getInt("fila");
    }

    public void setFila(int fila) {
        put("fila",fila);
    }

    public int getAsiento() {
        return getInt("asiento");
    }

    public void setAsiento(int asiento) {
        put("asiento",asiento);
    }

    public String getEstado() {
        return getString("estado");
    }

    public void setEstado(String estado) {
        put("estado",estado);
    }
}
