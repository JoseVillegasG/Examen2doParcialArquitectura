import AdapterCatalogo.CatalogoBiblioteca;
import AdapterCatalogo.CatalogoCetys;
import AdapterCatalogo.CatalogoCetysAdapter;
import AdapterCatalogo.Libro;
import AuditoriaSingleton.AuditoriaLogger;
import BuilderPrestamo.SolicitudPrestamo;
import FactoryUsuarios.Estudiante;
import FactoryUsuarios.FabricaUsuarios;
import FactoryUsuarios.Usuario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AuditoriaLogger logger1 = AuditoriaLogger.getInstancia();
        AuditoriaLogger logger2 = AuditoriaLogger.getInstancia();

        logger1.registrar("Préstamo creado", "juan123");
        logger2.registrar("Pago realizado", "ana456");


        System.out.println(logger1 == logger2);

//2b
        Usuario u1 = FabricaUsuarios.crearUsuario("estudiante", "Juan");
        Usuario u2 = FabricaUsuarios.crearUsuario("bibliotecario", "Ana");
        Usuario u3 = FabricaUsuarios.crearUsuario("admin", "Carlos");

        u1.mostrarPermisos();
        u2.mostrarPermisos();
        u3.mostrarPermisos();

//2c
        CatalogoCetys externo = new CatalogoCetys();

        CatalogoBiblioteca catalogo = new CatalogoCetysAdapter(externo);

        Libro libro = catalogo.buscarLibro("111111132350884");

        System.out.println(libro);

        //2d
        SolicitudPrestamo s1 = new SolicitudPrestamo.SolicitudPrestamoBuilder()
                .conEstudiante(new Estudiante("Juan"))
                .conLibro(new Libro("libro1"))
                .conFechaDevolucion(new Date())
                .construir();

        SolicitudPrestamo s2 = new SolicitudPrestamo.SolicitudPrestamoBuilder()
                .conEstudiante(new Estudiante("Ana"))
                .conLibro(new Libro("mi lucha"))
                .conFechaDevolucion(new Date())
                .conNotasEspeciales("Entregar en mostrador principal")
                .construir();
        SolicitudPrestamo s3 = new SolicitudPrestamo.SolicitudPrestamoBuilder()
                .conEstudiante(new Estudiante("Carlos"))
                    //ejemplo no valido
                .conFechaDevolucion(new Date())
                .conRenovacionAutomatica(true)
                .conNumRenovaciones(3)
                .construir();

    }
}