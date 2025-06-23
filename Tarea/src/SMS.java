public class SMS {
    private String descripcion;
    
    public void enviarMensaje(String mensaje, Usuario destinatario) {
        // Lógica de envío de SMS
        System.out.println("Enviando SMS a " + destinatario.getTelefono() + ": " + mensaje);
    }
}