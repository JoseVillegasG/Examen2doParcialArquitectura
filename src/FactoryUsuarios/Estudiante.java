package FactoryUsuarios;

public class Estudiante implements Usuario {

    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Estudiante";
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("prestamos");
    }
}