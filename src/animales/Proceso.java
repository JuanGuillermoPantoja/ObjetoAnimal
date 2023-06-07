package animales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import objetoPerro.Perro;

public class Proceso {
    private List<Perro> listaPerros;
    private Map<String, Perro> mapaPerros;

    public Proceso() {
        listaPerros = new ArrayList<>();
        mapaPerros = new HashMap<>();
    }

    public void crearPerro() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del perro:"));
        String raza = JOptionPane.showInputDialog("Ingrese la raza del perro:");

        Perro perro = new Perro(nombre, edad, raza);
        listaPerros.add(perro);
        mapaPerros.put(nombre, perro);

        JOptionPane.showMessageDialog(null, "Perro creado exitosamente.");
    }

    public void consultarPerro() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro a consultar:");

        Perro perro = mapaPerros.get(nombre);
        if (perro != null) {
            String mensaje = "Nombre: " + perro.getNombre() + "\n"
                    + "Edad: " + perro.getEdad() + "\n"
                    + "Raza: " + perro.getRaza();
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "El perro no existe.");
        }
    }

    public void mostrarListaPerros() {
        if (listaPerros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay perros registrados.");
        } else {
            String mensaje = "Lista de perros registrados:\n";
            for (Perro perro : listaPerros) {
                mensaje +="Nombre: "+perro.getNombre()+"\n"
                        +"Edad: "+perro.getEdad()+"\n"
                        +"Raza: "+perro.getRaza()+"\n"+
                        "-------------------------\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    
    public void ejecutarPrograma() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n"
                    + "1. Crear un perro\n"
                    + "2. Consultar un perro\n"
                    + "3. Mostrar lista de perros\n"
                    + "4. Salir");

            switch (opcion) {
                case "1":
                    crearPerro();
                    break;
                case "2":
                    consultarPerro();
                    break;
                case "3":
                    mostrarListaPerros();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
    

    