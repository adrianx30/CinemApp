package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Adrián on 08/12/2015.
 */
public class Sala implements Serializable {

    private String cinema;
    private int idSala;
    private List<Silla> sillas;
    private Date horario;


    public Date getHorarios() {
        return horario;
    }

    public void setHorarios(Date horarios) {
        this.horario = horarios;
    }



    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }
}
