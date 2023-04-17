package modelo;

public class modeloGrupo {
    private String clave;
    private modeloMateria materia;
    private modeloCatedratico catedratico;
    private int hora, salon;
    public modeloAlumno alumno;

    public modeloGrupo() {
    }

    public modeloGrupo(String clave, modeloMateria materia, modeloCatedratico catedratico, int hora, int salon, modeloAlumno alumno) {
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

    public modeloMateria getMateria() {
        return materia;
    }

    public void setMateria(modeloMateria materia) {
        this.materia = materia;
    }

    public modeloCatedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(modeloCatedratico catedratico) {
        this.catedratico = catedratico;
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

    public modeloAlumno getAlumno() {
        return alumno;
    }

    public void setAlumno(modeloAlumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "modeloGrupo{" +
                "clave='" + clave + '\'' +
                ", materia=" + materia +
                ", catedratico=" + catedratico +
                ", hora=" + hora +
                ", salon=" + salon +
                ", alumno=" + alumno +
                '}';
    }
}