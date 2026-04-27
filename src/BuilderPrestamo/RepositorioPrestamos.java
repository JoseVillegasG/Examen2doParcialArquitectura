package BuilderPrestamo;

public interface RepositorioPrestamos {

    void guardar(SolicitudPrestamo solicitud);


    boolean existePrestamoActivo(String isbn, String estudianteId);
}