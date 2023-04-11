import POJO.*;

import java.util.Scanner;
import java.util.Vector;

public class main {
    public static Scanner read = new Scanner(System.in);
    public static Scanner readline = new Scanner(System.in);
    public static String nombre;
    public static Vector<Especialidad> especialidades = new Vector<Especialidad>();
    public static Vector<Alumno> alumnos = new Vector<Alumno>();
    public static Vector<Catedratico> catedraticos = new Vector<Catedratico>();
    public static Vector<Materia> materias = new Vector<Materia>();
    public static Vector<Grupo> grupos = new Vector<Grupo>();

    public static void main(String[] args) {
        int opc = 0;
        do{
            opc = menu();
            switch (opc){
                case 1:
                    altaEspecialidad();
                    break;
                case 2:
                    altaAlumno();
                    break;
                case 3:
                    altaCatedratico();
                    break;
                case 4:
                    altaMateria();
                    break;
                case 5:
                    altaGrupo();
                    break;
                case 6:
                    imprimirReporteBD();
                    break;
                case 7:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("... Opcion no valida!");
                    break;
            }
        }while (opc!=7);
    }

    public static int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.- Alta POJO.Especialidad");
        System.out.println("2.- Alta POJO.Alumno");
        System.out.println("3.- Alta POJO.Catedratico");
        System.out.println("4.- Alta POJO.Materia ");
        System.out.println("5.- Alta POJO.Grupo");
        System.out.println("6.- Imprimir BD");
        System.out.println("7.- Salir");
        return read.nextInt();
    }

    public static void altaEspecialidad(){
        int id;
        System.out.println("Ingrese nombre de la POJO.Especialidad");
        nombre = readline.nextLine();
        System.out.println("Ingresa la ID");
        id = read.nextInt();
        especialidades.addElement(new Especialidad(id, nombre));
    }

    public static void altaAlumno(){
        int numControl;
        Especialidad especialidad = null;
        System.out.println("Ingrese el número de Control");
        numControl = read.nextInt();
        System.out.println("Ingrese el nombre del POJO.Alumno");
        nombre = readline.nextLine();
        for (int i = 0; i< especialidades.size(); i++){
            especialidad = especialidades.elementAt(i);
        }
        alumnos.addElement(new Alumno(numControl, nombre, especialidad));
    }

    public static void altaCatedratico(){
        String RFC;
        System.out.println("Ingrese su RFC");
        RFC = readline.nextLine();
        System.out.println("Ingrese su Nombre");
        nombre = readline.nextLine();
        catedraticos.addElement(new Catedratico(RFC, nombre));
    }

    public static void altaMateria(){
        int id;
        System.out.println("Ingrese ID de la materia");
        id = read.nextInt();
        System.out.println("Ingrese el nombre de la materia");
        nombre = readline.nextLine();
        materias.addElement(new Materia(id, nombre));
    }

    public static void altaGrupo(){
        String clave;
        Materia materia = new Materia();
        Catedratico catedratico = new Catedratico();
        int hora, salon;
        Alumno alumno = new Alumno();
        System.out.println("Ingrese la clave del grupo");
        clave = readline.nextLine();
        System.out.println("Ingrese la hora");
        hora = read.nextInt();
        System.out.println("Ingrese el numero de salon");
        salon = read.nextInt();
        for (int i = 0; i < materias.size(); i++) {
            materia = materias.elementAt(i);
            for (int j = 0; j < catedraticos.size(); j++) {
                catedratico = catedraticos.elementAt(j);
                for (int k = 0; k < alumnos.size(); k++) {
                    alumno = alumnos.elementAt(k);
                }
            }
        }
        grupos.addElement(new Grupo(clave, materia, catedratico, hora, salon, alumno));
    }

    public static void imprimirReporteBD(){
        System.out.println("\n=== Reporte de POJO.Especialidad ===");
        for (int i = 0; i < especialidades.size(); i++) {
            especialidades.elementAt(i).imprimir();
        }
        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.elementAt(i).imprimir();
        }
        for (int i = 0; i < catedraticos.size(); i++) {
            catedraticos.elementAt(i).imprimir();
        }
        for (int i = 0; i < materias.size(); i++) {
            materias.elementAt(i).imprimir();
        }
        for (int i = 0; i < grupos.size(); i++) {
            grupos.elementAt(i).imprimir();
        }
    }
}
