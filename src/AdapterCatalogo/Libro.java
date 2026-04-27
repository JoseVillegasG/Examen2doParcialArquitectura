package AdapterCatalogo;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (ISBN: " + isbn + ")";
    }
}

