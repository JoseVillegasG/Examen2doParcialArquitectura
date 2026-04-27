package FactoryUsuarios;

public class Bibliotecario implements Usuario {

    private String nombre;

    public Bibliotecario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Bibliotecario";
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("gestionar prestamos");
    }
}