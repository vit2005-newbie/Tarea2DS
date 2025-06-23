public class SMSAdapter implements Notificador {
    private SMS adaptee;
    
    public SMSAdapter(SMS sms) {
        this.adaptee = sms;
    }
    
    @Override
    public void enviar(String mensaje, Usuario destinatario) {
        adaptee.enviarMensaje(mensaje, destinatario);
    }
}