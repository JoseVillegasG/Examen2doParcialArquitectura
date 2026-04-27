package AdapterCatalogo;

public class CatalogoCetysAdapter implements CatalogoBiblioteca {

    private CatalogoCetys catalogoExterno;

    public CatalogoCetysAdapter(CatalogoCetys catalogoExterno) {
        this.catalogoExterno = catalogoExterno;
    }

    @Override
    public Libro buscarLibro(String isbn) {


        String codigoCETYS = convertirISBNaCodigo(isbn);
        String formato = "COMPLETO";


        ResultadoSOAP resultado = catalogoExterno.consultarObra(codigoCETYS, formato);


        return new Libro(
                resultado.getTitulo()
        );
    }


    private String convertirISBNaCodigo(String isbn) {
        return "CETYS-" + isbn;
    }
}