package FactoryUsuarios;

public class Admin implements Usuario {

    private String nombre;

    public Admin(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "Admin";
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("admninistrador");
    }
}