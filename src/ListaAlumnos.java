
import java.util.ArrayList;

public class ListaAlumnos {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Isaac Ortiz", 23110372));
        alumnos.add(new Alumno("Jualian Raya", 23110341));
        alumnos.add(new Alumno("Jesus Molina", 23110179));
        alumnos.add(new Alumno("Giovanni Rosas", 23110220));
        alumnos.add(new Alumno("Antonio Flores", 23110243));

        System.out.println("Lista de Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre() + ", Nocontrol: " + alumno.getNocontrol());
        }
    }
}

class Alumno {

    private String nombre;
    private int Nocontrol;

    public Alumno(String nombre, int Nocontrol) {
        this.nombre = nombre;
        this.Nocontrol = Nocontrol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNocontrol() {
        return Nocontrol;
    }
}
