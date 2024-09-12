import ListaContactos.Agenda;
import ListaContactos.Contacto;
import javax.swing.JOptionPane;

public class LibretaContactos {

    public static void main(String[] args) {
        boolean salir = false;
        int option;

        Agenda agendatel = new Agenda(5);
        String nombre;
        String telefono;
        Contacto c;

        while (!salir) {
            String menu = "1. Añadir contacto\n"
                        + "2. Listar contactos\n"
                        + "3. Buscar contacto\n"
                        + "4. Existe contacto\n"
                        + "5. Eliminar contacto\n"
                        + "6. Contactos disponibles\n"
                        + "7. Agenda llena\n"
                        + "8. Salir\n"
                        + "Escriba la opción que desee:";

            try {
                String input = JOptionPane.showInputDialog(menu);
                option = Integer.parseInt(input);

                switch (option) {
                    case 1:
                        nombre = JOptionPane.showInputDialog("Escribe el nombre:");
                        telefono = JOptionPane.showInputDialog("Escribe un número de teléfono:");

                        c = new Contacto(nombre, telefono);
                        agendatel.añadircontacto(c);
                        break;

                    case 2:
                        agendatel.listarContactos();
                        break;

                    case 3:
                        nombre = JOptionPane.showInputDialog("Escribe el nombre para buscar:");
                        agendatel.buscaPorNombre(nombre);
                        break;

                    case 4:
                        nombre = JOptionPane.showInputDialog("Escribe el nombre:");
                        c = new Contacto(nombre, "");
                        if (agendatel.existeContacto(c)) {
                            JOptionPane.showMessageDialog(null, "Existe el contacto.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe el contacto.");
                        }
                        break;

                    case 5:
                        nombre = JOptionPane.showInputDialog("Escribe el nombre:");
                        c = new Contacto(nombre, "");
                        agendatel.eliminarContacto(c);
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Hay " + agendatel.espaciosLibres() + " espacios libres.");
                        break;

                    case 7:
                        if (agendatel.agendaLlena()) {
                            JOptionPane.showMessageDialog(null, "La agenda está llena.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Aún hay espacio para contactos.");
                        }
                        break;

                    case 8:
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en la entrada. Intente de nuevo.");
            }
        }
    }
}
