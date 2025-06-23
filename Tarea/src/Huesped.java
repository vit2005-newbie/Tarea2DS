import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Huesped extends Usuario{
    private String id;
    private List<Reserva> reservas;
    private List<Resena> resenas;
    private List<Incidente> incidentesReportados;
    
    public Huesped(String nombre, String correo, String telefono, String id) {
        super(nombre, correo, telefono);
        this.id = id;
        this.reservas = new ArrayList<>();
        this.resenas = new ArrayList<>();
        this.incidentesReportados = new ArrayList<>();
    }
    
    public Incidente reportarIncidente(String descripcion, Propiedad propiedad) {
        Incidente incidente = new Incidente(descripcion, this, propiedad);
        incidentesReportados.add(incidente);
        return incidente;
    }
    
    public List<Incidente> getIncidentesReportados() {
        return new ArrayList<>(incidentesReportados);
    }
    
    public Resena dejarResena(Propiedad propiedad, int puntuacion, String comentario) {
        if (!haEstadoEnPropiedad(propiedad)) {
            throw new IllegalStateException("No puedes dejar reseña de una propiedad donde no te has hospedado");
        }
        
        Resena resena = new Resena(puntuacion, comentario, this, propiedad);
        resenas.add(resena);
        propiedad.agregarResena(resena);
        return resena;
    }
    
    private boolean haEstadoEnPropiedad(Propiedad propiedad) {
        return reservas.stream()
                .anyMatch(r -> r.getUnidad().getPropiedad().equals(propiedad) && 
                r.getFechaFin().isBefore(LocalDate.now()));
    }
    
    public List<Resena> getResenas() {
        return new ArrayList<>(resenas);
    }
    
    public String getId() { return id; }
}


