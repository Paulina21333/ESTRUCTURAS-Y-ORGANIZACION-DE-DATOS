
import java.util.ArrayList;
import java.util.List;

class Familiar {

    private String nombre;
    private String parentesco;

    public Familiar(String nombre, String parentesco) {
        this.nombre = nombre;
        this.parentesco = parentesco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getParentesco() {
        return parentesco;
    }

    @Override
    public String toString() {
        return "Familiar{"
                + "nombre='" + nombre + '\''
                + ", parentesco='" + parentesco + '\''
                + '}';
    }
}

public class ListaFamiliar {

    public static void main(String[] args) {
        List<Familiar> familiares = new ArrayList<>();

        familiares.add(new Familiar("Juan Valencia", "Padre"));
        familiares.add(new Familiar("Cecilia Lara", "Madre"));
        familiares.add(new Familiar("Pedro Valencia", "Abuelo"));
        familiares.add(new Familiar("Irma Pérez", "Abuela"));
        familiares.add(new Familiar("Victoria Flores", "Prima"));

        for (Familiar familiar : familiares) {
            System.out.println(familiar);
        }
    }
}
