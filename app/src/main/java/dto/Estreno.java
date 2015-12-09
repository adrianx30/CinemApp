package dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Adrián on 08/12/2015.
 */
public class Estreno implements Serializable {

    private List<Pelicula> peliculas;

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}

