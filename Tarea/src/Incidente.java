import java.time.LocalDate;

public class Incidente implements ManejoDeIncidentes {
    private String id;
    private String descripcion;
    private LocalDate fechaReporte;
    private Huesped reportadoPor;
    private Propiedad propiedad;

    @Override
    public void revisarIncidente(Incidente incidente) {
    }

    @Override
    public void escalar(Incidente incidente, Usuario persona) {
    }

    @Override
    public void cerrarIncidente(Incidente incidente, String resolucion) {
    }

    @Override
    public void responderIncidente(Incidente incidente) {   
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Huesped getReportadoPor() {
        return reportadoPor;
    }

    public void setReportadoPor(Huesped reportadoPor) {
        this.reportadoPor = reportadoPor;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }
}