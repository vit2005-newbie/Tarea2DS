public class SoporteLegal extends Usuario implements ManejoDeIncidentes {

    public SoporteLegal(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono); 
    }
    @Override
    public void revisarIncidente(Incidente incidente) {
        System.out.println("Soporte legal revisando el incidente: " + incidente.getDescripcion());
        
    }

    //@Override
    public void escalar(Incidente incidente, Usuario persona) {
        System.out.println("Soporte legal escala el incidente a: " + persona.getNombre());
        
    }

    @Override
    public void cerrarIncidente(Incidente incidente, String resolucion) {
        incidente.setResolucion(resolucion);
        System.out.println("Soporte legal cerró el incidente con resolución: " + resolucion);
        
    }

    @Override
    public void responderIncidente(Incidente incidente) {
        System.out.println("Soporte legal respondió al incidente: " + incidente.getId());
        
    }

    public void resolverLegalmente(Incidente incidente) {
        System.out.println("Resolviendo legalmente el incidente con ID: " + incidente.getId());
        
    }
}
