package AdapterCatalogo;

public class ResultadoSOAP {
    private String titulo;
    private String autor;

    public ResultadoSOAP(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
}