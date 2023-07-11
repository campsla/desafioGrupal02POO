package Entity;

public class Rutina {
    private int id;
    private String nombre;
    private int duracion;
    private int nivDificultad;
    private String descripcion;

    public Rutina(int id, String nombre, int duracion, int nivDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivDificultad = nivDificultad;
        this.descripcion = descripcion;
    }

    public Rutina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNivDificultad() {
        return nivDificultad;
    }

    public void setNivDificultad(int nivDificultad) {
        this.nivDificultad = nivDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", nivDificultad=" + nivDificultad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
