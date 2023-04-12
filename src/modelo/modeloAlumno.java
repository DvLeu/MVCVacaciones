package modelo;

public class modeloAlumno {


    private int numControl;
    private String nombre;
    private modeloEspecialidad especialidad;

    public modeloAlumno(){

    }

    public modeloAlumno(int numControl, String nombre, modeloEspecialidad especialidad) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public modeloEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(modeloEspecialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "modeloAlumno{" +
                "numControl=" + numControl +
                ", nombre='" + nombre + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }


}
