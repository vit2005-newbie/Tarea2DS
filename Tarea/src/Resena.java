import java.time.LocalDate;

public class Resena {
    private int puntuacion;    
    private String comentario;
    private LocalDate fecha;    
    private Huesped huesped;    
    private Propiedad propiedad; 


    public Resena(int puntuacion, String comentario, Huesped huesped, Propiedad propiedad) {
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fecha = LocalDate.now();
        this.huesped = huesped;
        this.propiedad = propiedad;
    }

    public int getPuntuacion() { 
        return puntuacion; }
    public String getComentario() {
        return comentario; }
    public LocalDate getFecha() { 
        return fecha; }
    public Huesped getHuesped() { 
        return huesped; }
    public Propiedad getPropiedad() { 
        return propiedad; }

    }