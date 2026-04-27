package BuilderPrestamo;

import AdapterCatalogo.Libro;
import FactoryUsuarios.Estudiante;

import java.util.Date;

public class SolicitudPrestamo {

    private Estudiante estudiante;
    private Libro libro;
    private Date fechaDevolucion;
    private String notasEspeciales;
    private boolean renovacionAutomatica;
    private int numRenovaciones;


    private SolicitudPrestamo(SolicitudPrestamoBuilder builder) {
        this.estudiante = builder.estudiante;
        this.libro = builder.libro;
        this.fechaDevolucion = builder.fechaDevolucion;
        this.notasEspeciales = builder.notasEspeciales;
        this.renovacionAutomatica = builder.renovacionAutomatica;
        this.numRenovaciones = builder.numRenovaciones;
    }

    @Override
    public String toString() {
        return "SolicitudPrestamo{" +
                "estudiante=" + estudiante +
                ", libro=" + libro +
                ", fechaDevolucion=" + fechaDevolucion +
                ", notasEspeciales='" + notasEspeciales + '\'' +
                ", renovacionAutomatica=" + renovacionAutomatica +
                ", numRenovaciones=" + numRenovaciones +
                '}';
    }

    public Object getLibro() {

        return null;
    }

    public Object getEstudiante() {
        return null;
    }


    public static class SolicitudPrestamoBuilder {


        private Estudiante estudiante;
        private Libro libro;
        private Date fechaDevolucion;


        private String notasEspeciales = null;
        private boolean renovacionAutomatica = false;
        private int numRenovaciones = 1;



        public SolicitudPrestamoBuilder conEstudiante(Estudiante estudiante) {
            this.estudiante = estudiante;
            return this;
        }

        public SolicitudPrestamoBuilder conLibro(Libro libro) {
            this.libro = libro;
            return this;
        }

        public SolicitudPrestamoBuilder conFechaDevolucion(Date fechaDevolucion) {
            this.fechaDevolucion = fechaDevolucion;
            return this;
        }

        public SolicitudPrestamoBuilder conNotasEspeciales(String notas) {
            this.notasEspeciales = notas;
            return this;
        }

        public SolicitudPrestamoBuilder conRenovacionAutomatica(boolean valor) {
            this.renovacionAutomatica = valor;
            return this;
        }

        public SolicitudPrestamoBuilder conNumRenovaciones(int num) {
            this.numRenovaciones = num;
            return this;
        }

        public SolicitudPrestamo construir() {

            if (estudiante == null) {
                throw new IllegalStateException("estudiante es obligatorio");
            }
            if (libro == null) {
                throw new IllegalStateException("libro es obligatorio");
            }
            if (fechaDevolucion == null) {
                throw new IllegalStateException("fecha de devolución es obligatoria");
            }

            return new SolicitudPrestamo(this);
        }
    }
}