import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    
    private String id;
    private String titulo;
    private String ubicacion;
    private TipoPropiedad tipo;
    private String descripcion;
    private double precioBase;
    private List<String> servicios;
    private List<Unidad> unidades;
    private Anfitrion anfitrion;

    public Propiedad(String id, String titulo, String ubicacion, TipoPropiedad tipo, String descripcion, double precioBase, Anfitrion anfitrion) {
        this.id = id;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.anfitrion = anfitrion;
        this.servicios = new ArrayList<>();
        this.unidades = new ArrayList<>();
    }

    public void agregarUnidad(Unidad unidad) {
        unidades.add(unidad);
    }

    public void eliminarUnidad(Unidad unidad) {
        unidades.remove(unidad);
    }

    public List<Unidad> consultarUnidadesDisponibles(Date fechaInicio, Date fechaFin) {
        List<Unidad> disponibles = new ArrayList<>();
        for (Unidad unidad : unidades) {
            if (unidad.estaDisponible(fechaInicio, fechaFin)) {
                disponibles.add(unidad);
            }
        }
        return disponibles;
    }

}
