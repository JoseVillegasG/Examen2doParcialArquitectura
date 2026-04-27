package FactoryUsuarios;

public class FabricaUsuarios {

    public static Usuario crearUsuario(String tipo, String nombre) {

        switch (tipo.toLowerCase()) {
            case "estudiante":
                return new Estudiante(nombre);

            case "bibliotecario":
                return new Bibliotecario(nombre);

            case "admin":
                return new Admin(nombre);

            default:
                throw new IllegalArgumentException(" usuario no válido: " + tipo);
        }
    }
}