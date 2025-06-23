public interface ManejoDeIncidentes {
    void revisarIncidente(Incidente incidente);
    void escalar(Incidente incidente, Usuario persona);
    void cerrarIncidente(Incidente incidente, String resolucion);
    void responderIncidente(Incidente incidente);
}