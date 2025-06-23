import java.util.Date;

public class Reserva {

    private Huesped huesped;
    private Unidad unidad;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva(Huesped huesped, Unidad unidad, Date fechaInicio, Date fechaFin) {
        this.huesped = huesped;
        this.unidad = unidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void confirmar() {
        unidad.agregarReserva(this);
        unidad.cambiarEstado(EstadoUnidad.RESERVADO);
    }

    public void cancelar() {
        // lógica de cancelación (ej. eliminar de la lista de reservas)
    }

    public double calcularTotal() {
        long diff = fechaFin.getTime() - fechaInicio.getTime();
        long dias = (diff / (1000 * 60 * 60 * 24));
        return dias * unidad.getPrecioPorNoche();
    }

    public Date getFechaInicio() {
        return fechaInicio; }
    public Date getFechaFin() { 
        return fechaFin; }
}
