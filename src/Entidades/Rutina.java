package Entidades;
public class Rutina {
    private int id;
    private String nombre;
    private int duracion;
    private String nivel;
    private String descripcion;

    public Rutina() {
    }

    public Rutina(int id, String nombre, int duracion, String nivel, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.descripcion = descripcion;
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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivel=" + nivel + ", descripcion=" + descripcion + '}';
    }
}
