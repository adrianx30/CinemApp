package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Adrián on 08/12/2015.
 */
public class Sala implements Serializable {

    private String teatro;
    private int idSala;


    public String getCinema() {
        return teatro;
    }

    public void setCinema(String cinema) {
        this.teatro = cinema;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

}
