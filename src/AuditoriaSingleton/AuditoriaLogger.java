package AuditoriaSingleton;

public class AuditoriaLogger {

    private static final AuditoriaLogger instancia = new AuditoriaLogger();

    private AuditoriaLogger() {

    }

    public static AuditoriaLogger getInstancia() {
        return instancia;
    }

    public void registrar(String evento, String usuario) {
        String log = String.format(
                usuario,
                evento,
                System.currentTimeMillis()
        );
        System.out.println(log);
    }
}