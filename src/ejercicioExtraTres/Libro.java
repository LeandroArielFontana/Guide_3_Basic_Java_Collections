package ejercicioExtraTres;

public class Libro {

    private String nombre;

    private String autor;

    private Integer numeroEjemplares;

    private Integer numerosEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String nombre, String autor, Integer numeroEjemplares, Integer numerosEjemplaresPrestados) {
        this.nombre = nombre;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numerosEjemplaresPrestados = numerosEjemplaresPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public Integer getNumerosEjemplaresPrestados() {
        return numerosEjemplaresPrestados;
    }

    public void setNumerosEjemplaresPrestados(Integer numerosEjemplaresPrestados) {
        this.numerosEjemplaresPrestados = numerosEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro : " + " Nombre : " + nombre + "\t\nAutor : " + autor + "\t\nNumero de Ejemplares : " + numeroEjemplares + "\t\nNumero de Ejemplares Prestados : " + numerosEjemplaresPrestados + '}';
    }
}
