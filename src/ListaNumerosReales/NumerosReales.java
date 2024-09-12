package NumerosReales;

import javax.swing.JOptionPane;

public class NumerosReales {

    public static void main(String[] args) {
        NumerosReales1 manager = new NumerosReales1();
        boolean salir = false;

        while (!salir) {
            String menu = "1. Agregar número\n"
                        + "2. Buscar número\n"
                        + "3. Modificar número\n"
                        + "4. Eliminar número\n"
                        + "5. Insertar número en posición\n"
                        + "6. Mostrar números\n"
                        + "7. Salir\n"
                        + "Escriba la opción que desee:";
            
            String input = JOptionPane.showInputDialog(menu);
            int option;

            try {
                option = Integer.parseInt(input);

                switch (option) {
                    case 1:
                        double numAgregar = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número a agregar:"));
                        manager.agregarNumero(numAgregar);
                        break;

                    case 2:
                        double numBuscar = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número a buscar:"));
                        manager.buscarNumero(numBuscar);
                        break;

                    case 3:
                        double numModificar = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número a modificar:"));
                        manager.modificarNumero(numModificar);
                        break;

                    case 4:
                        double numEliminar = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número a eliminar:"));
                        manager.eliminarNumero(numEliminar);
                        break;

                    case 5:
                        double numInsertar = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número a insertar:"));
                        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Escribe la posición en la que insertar el número:"));
                        manager.insertarNumero(numInsertar, posicion);
                        break;

                    case 6:
                        manager.mostrarNumeros();
                        break;

                    case 7:
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
