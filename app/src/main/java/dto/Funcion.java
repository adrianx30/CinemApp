package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Adrián on 13/12/2015.
 */
public class Funcion implements Serializable {

    private int funcionId;
    private Teatro teatro;
    private Pelicula Pelicula;
    private Date horario;

    private List<Silla> sillas;

    public int getFuncionId() {
        return funcionId;
    }

    public void setFuncionId(int funcionId) {
        this.funcionId = funcionId;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }

    public Pelicula getPelicula() {
        return Pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        Pelicula = pelicula;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }
}
