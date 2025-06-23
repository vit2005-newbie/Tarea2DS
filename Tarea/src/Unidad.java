import java.util.ArrayList;
import java.util.List;

public class Unidad {
    private String id;
    private String nombre;
    private EstadoUnidad estado;
    private double precioPorNoche;
    private PoliticaDeCancelacion politicaCancelacion;
    private List<Reserva> reservas;

    public Unidad(String id, String nombre, double precioPorNoche, PoliticaDeCancelacion politicaCancelacion) {
        this.id = id;
        this.nombre = nombre;
        this.precioPorNoche = precioPorNoche;
        this.politicaCancelacion = politicaCancelacion;
        this.estado = EstadoUnidad.DISPONIBLE;
        this.reservas = new ArrayList<>();
    }

    public void cambiarEstado(EstadoUnidad nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public boolean estaDisponible(Date inicio, Date fin) {
        for (Reserva reserva : reservas) {
            if (!(fin.before(reserva.getFechaInicio()) || inicio.after(reserva.getFechaFin()))) {
                return false;
            }
        }
        return estado == EstadoUnidad.DISPONIBLE;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
}
