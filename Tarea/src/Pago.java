import java.util.Date;

public class Pago {

    private String id;
    private Reserva reserva;
    private double monto;
    private Date fechaPago;
    private String metodo;

    public Pago(String id, Reserva reserva, double monto, Date fechaPago, String metodo) {
        this.id = id;
        this.reserva = reserva;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodo = metodo;
    }

    public double aplicarDescuento(double porcentaje) {
        return monto - (monto * porcentaje / 100);
    }


}
