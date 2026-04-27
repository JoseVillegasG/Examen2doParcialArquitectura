package BuilderPrestamo;

public class UseRepositorioPrestamos {
    private RepositorioPrestamos repositorio;


    public UseRepositorioPrestamos(RepositorioPrestamos repositorio) {
        this.repositorio = repositorio;
    }

    public void ejecutar(SolicitudPrestamo solicitud) {


        if (solicitud == null) {
            throw new IllegalArgumentException("La solicitud no puede ser nula");
        }

        String isbn = solicitud.getLibro().toString(); // simplificado
        String estudianteId = solicitud.getEstudiante().toString();


        if (repositorio.existePrestamoActivo(isbn, estudianteId)) {
            throw new IllegalStateException("El estudiante ya tiene un préstamo activo para este libro");
        }


        repositorio.guardar(solicitud);


    }
}
