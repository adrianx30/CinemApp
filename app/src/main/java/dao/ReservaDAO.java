package dao;

import java.util.List;

import dto.Reserva;
import dto.Usuario;

/**
 * Created by Adrián on 08/12/2015.
 */
public interface ReservaDAO {

    void crearReserva(Reserva reserva);

    Reserva obtenerReserva();

    void modificarReserva(Reserva reserva);

    void eliminarReserva(Reserva reserva);

    List<Reserva> obtenerTodasReservas(Usuario user);
}
