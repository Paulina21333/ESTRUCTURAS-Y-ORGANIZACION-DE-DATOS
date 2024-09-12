package ListaContactos;

import javax.swing.JOptionPane;

public class Agenda {

    private Contacto[] contactos;

    public Agenda() {
        this.contactos = new Contacto[10];
    }

    public Agenda(int tamaño) {
        this.contactos = new Contacto[tamaño];
    }

    public void añadircontacto(Contacto c) {
        if (this.existeContacto(c)) {
            JOptionPane.showMessageDialog(null, "El contacto con ese nombre ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (agendaLlena()) {
            JOptionPane.showMessageDialog(null, "La agenda se encuentra llena, no hay espacio para más contactos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Contacto añadido con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido añadir el contacto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        StringBuilder lista = new StringBuilder();
        for (Contacto contacto : contactos) {
            if (contacto != null) {
                lista.append(contacto).append("\n");
            }
        }
        if (lista.length() > 0) {
            JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Contactos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay contactos en la agenda", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void buscaPorNombre(String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "El teléfono de " + nombre + " es: " + contacto.getTelefono(), "Resultado de la Búsqueda", JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el contacto", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean agendaLlena() {
        for (Contacto contacto : contactos) {
            if (contacto == null) {
                return false;
            }
        }
        return true;
    }

    public void eliminarContacto(Contacto c) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null;
                encontrado = true;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Contacto eliminado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el contacto para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int espaciosLibres() {
        int contadorVacío = 0;
        for (Contacto contacto : contactos) {
            if (contacto == null) {
                contadorVacío++;
            }
        }
        return contadorVacío;
    }
}
