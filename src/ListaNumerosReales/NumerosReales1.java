package NumerosReales;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NumerosReales1 {

    private ArrayList<Double> numerosReales;

    public NumerosReales1() {
        this.numerosReales = new ArrayList<>();
    }

    public void agregarNumero(double numero) {
        numerosReales.add(numero);
        JOptionPane.showMessageDialog(null, "El número se agregó con éxito.");
    }

    public void buscarNumero(double numero) {
        if (numerosReales.contains(numero)) {
            JOptionPane.showMessageDialog(null, "El número existe en la lista.");
        } else {
            JOptionPane.showMessageDialog(null, "El número no existe.");
        }
    }

    public void modificarNumero(double numero) {
        if (numerosReales.contains(numero)) {
            int index = numerosReales.indexOf(numero);
            double numeroNuevo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el nuevo número:"));
            numerosReales.set(index, numeroNuevo);
            JOptionPane.showMessageDialog(null, "Se modificó el número correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El número no está en la lista.");
        }
    }

    public void eliminarNumero(double numero) {
        if (numerosReales.remove(Double.valueOf(numero))) {
            JOptionPane.showMessageDialog(null, "El número se eliminó exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El número no está en la lista.");
        }
    }

    public void insertarNumero(double numero, int posicion) {
        if (posicion >= 0 && posicion <= numerosReales.size()) {
            numerosReales.add(posicion, numero);
            JOptionPane.showMessageDialog(null, "Número colocado en la posición " + posicion + ".");
        } else {
            JOptionPane.showMessageDialog(null, "La posición se encuentra fuera del rango.");
        }
    }

    public void mostrarNumeros() {
        if (numerosReales.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            StringBuilder lista = new StringBuilder("Lista de números:\n");
            for (int i = 0; i < numerosReales.size(); i++) {
                lista.append(i).append(": ").append(numerosReales.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }
}
