package ejercicioExtraCuatro;

public class Pais {

    private String nombre;

    private Integer codigo;

    public Pais() {
    }

    public Pais(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Localidad{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
