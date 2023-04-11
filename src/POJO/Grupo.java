package POJO;

import POJO.Alumno;
import POJO.Catedratico;

public class Grupo {
    private String clave;
    private Materia materia;
    private Catedratico catedratico;
    private int hora, salon;
    public Alumno alumno;

    public Grupo() {
    }

    public Grupo(String clave, Materia materia, Catedratico catedratico, int hora, int salon, Alumno alumno) {
        this.clave = clave;
        this.materia = materia;
        this.catedratico = catedratico;
        this.hora = hora;
        this.salon = salon;
        this.alumno = alumno;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "POJO.Grupo{" + "clave='" + clave + '\'' + ", materia=" + materia + ", catedratico=" + catedratico + ", hora=" + hora + ", salon=" + salon + ", alumno=" + alumno + '}';
    }

    public void imprimir(){
        System.out.println(toString());
    }
}
