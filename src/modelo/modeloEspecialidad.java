package modelo;

public class modeloEspecialidad {


    private int id;
    private String nombre;

    public modeloEspecialidad(){

    }

    public modeloEspecialidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "modeloEspecialidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
