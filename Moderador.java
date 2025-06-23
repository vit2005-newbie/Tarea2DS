public class Moderador extends Usuario implements ManejoDeIncidentes {
    
    public Moderador(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono); // Llama al constructor de Usuario
    }
    @Override
    public void revisarIncidente(Incidente incidente) {
        System.out.println("Moderador revisando el incidente: " + incidente.getDescripcion());
        // Aquí podrías actualizar el estado del incidente a 'en revisión'
    }

    @Override
    public void escalar(Incidente incidente, Usuario persona) {
        System.out.println("Moderador escala el incidente a: " + persona.getNombre());
        // Podrías asignar el incidente al soporte legal o a otro moderador
    }

    @Override
    public void cerrarIncidente(Incidente incidente, String resolucion) {
        incidente.setResolucion(resolucion);
        System.out.println("Moderador cerró el incidente con resolución: " + resolucion);
        // Posible notificación al huésped o anfitrión
    }

    @Override
    public void responderIncidente(Incidente incidente) {
        System.out.println("Moderador respondió el incidente con ID: " + incidente.getId());
        // Registrar la respuesta del moderador
    }
}
