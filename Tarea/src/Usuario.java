public class Usuario {
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String correo;
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Usuario(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void actualizarPerfil(String nombre, String correo, String telefono, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        
    }
}