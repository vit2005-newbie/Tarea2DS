import java.util.List;

public class Anfitrion extends Usuario {
    public Anfitrion(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
    }

    private List<Propiedad> propiedades;
    
    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }
    
    public void eliminarPropiedad(Propiedad propiedad) {
        propiedades.remove(propiedad);
    }
    
    // Otros métodos según diagrama de clases
    public void revisarIncidente(Incidente incidente) {
        // Lógica de revisión
    }
    
    public void responderIncidente(Incidente incidente) {
        // Lógica de respuesta
    }
}