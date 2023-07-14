package Servicios;
import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
public class ServiciosCliente {
  //private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int id = 0;
    private List<Cliente> listaClientes = new ArrayList<>();
    
    public void listaLlena() {
        // Crear 5 clientes predefinidos
        Cliente cliente1 = new Cliente(1, "Juan", 30, 170, 70, "Perder peso");
        Cliente cliente2 = new Cliente(2, "María", 25, 165, 60, "Mantener forma física");
        Cliente cliente3 = new Cliente(3, "Carlos", 40, 180, 80, "Ganar masa muscular");
        Cliente cliente4 = new Cliente(4, "Ana", 28, 160, 55, "Tonificar el cuerpo");
        Cliente cliente5 = new Cliente(5, "Luis", 35, 175, 75, "Mejorar resistencia");
        
        // Obtener el último ID utilizado
        id = Math.max(cliente1.getId(), Math.max(cliente2.getId(), Math.max(cliente3.getId(), Math.max(cliente4.getId(), cliente5.getId()))));
        
        // Agregar los clientes a la lista
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
    }
    
    public void registrarCliente(String nombre, int edad, double altura, double peso, String objetivo) {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        id++;
        cliente.setNombre(nombre);
        cliente.setEdad(edad);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setObjetivo(objetivo);

        listaClientes.add(cliente);
    }

    public void obtenerClientes() {
        //System.out.println(listaClientes);

        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        boolean encontrada = false;            
        for (Cliente clienteActual : listaClientes) {
            if (clienteActual.getId() == id) {
                clienteActual.setNombre(nombre);
                clienteActual.setEdad(edad);
                clienteActual.setAltura(altura);
                clienteActual.setPeso(peso);
                clienteActual.setObjetivo(objetivo);
                encontrada = true;
                break; // Terminar el bucle una vez encontrado el cliente
            }  
        }
        if (!encontrada) {
            System.out.println("No se encontró el id del cliente.");
        }
    }
    
    public void eliminarCliente(int id) {
        boolean eliminado = false;
        for (Cliente clienteActual : listaClientes) {
            if (clienteActual.getId() == id) {
                listaClientes.remove(clienteActual);
                eliminado = true;
                break; // Terminar el bucle una vez eliminado el cliente
            }
        }
        if (!eliminado) {
            System.out.println("No se encontró el id del cliente.");
        }
    }
}

