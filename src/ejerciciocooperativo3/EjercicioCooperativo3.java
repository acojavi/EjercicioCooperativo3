package ejerciciocooperativo3;
import Servicios.ServiciosCliente;
import Servicios.ServiciosRutina;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCooperativo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiciosCliente serviciosCliente = new ServiciosCliente();
        ServiciosRutina serviciosRutina = new ServiciosRutina();

        // Llenar la lista de rutinas y clientes predefinidos
        serviciosCliente.listaLlena();
        serviciosRutina.llenarRutina();

        
        int opcion;
        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Obtener lista de clientes");
            System.out.println("3. Actualizar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Registrar rutina");
            System.out.println("6. Obtener lista de rutinas");
            System.out.println("7. Actualizar rutina");
            System.out.println("8. Eliminar rutina");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Consumir el carácter de nueva línea pendiente

                switch (opcion) {
                    case 1:
                        // Opción 1: Registrar cliente
                        boolean datosCorrectos = false;
                        while (!datosCorrectos) {
                            try {
                                System.out.print("Ingresa el Nombre: ");
                                String nombreCliente = sc.nextLine();
                                System.out.print("Ingresa la Edad: ");
                                int edadCliente = sc.nextInt();
                                sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                                System.out.print("Ingresa la Altura: ");
                                double alturaCliente = sc.nextDouble();
                                sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                                System.out.print("Ingresa el Peso: ");
                                double pesoCliente = sc.nextDouble();
                                sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                                System.out.print("Ingresa el Objetivo: ");
                                String objetivoCliente = sc.nextLine();

                                serviciosCliente.registrarCliente(nombreCliente, edadCliente, alturaCliente, pesoCliente, objetivoCliente);
                                datosCorrectos = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Valor inválido. Por favor, ingrese el dato nuevamente.");
                                sc.nextLine(); // Consumir la entrada incorrecta
                            }
                        }
                        System.out.println("Cliente registrado exitosamente.");
                        break;
                    case 2:
                        // Opción 2: Obtener lista de clientes
                        serviciosCliente.obtenerClientes();
                        break;
                    case 3:
                        // Opción 3: Actualizar cliente
                        System.out.print("Ingrese el ID del cliente a actualizar: ");
                        int idCliente = sc.nextInt();
                        sc.nextLine(); // Consumir el carácter de nueva línea pendiente

                        try {
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nombreCliente = sc.nextLine();
                            System.out.print("Ingrese la nueva edad: ");
                            int edadCliente = sc.nextInt();
                            sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                            System.out.print("Ingrese la nueva altura: ");
                            double alturaCliente = sc.nextDouble();
                            sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                            System.out.print("Ingrese el nuevo peso: ");
                            double pesoCliente = sc.nextDouble();
                            sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                            System.out.print("Ingrese el nuevo objetivo: ");
                            String objetivoCliente = sc.nextLine();
                            serviciosCliente.actualizarCliente(idCliente, nombreCliente, edadCliente, alturaCliente, pesoCliente, objetivoCliente);
                            System.out.println("Cliente actualizado exitosamente.");
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Valor inválido. No se pudo actualizar el cliente.");
                            sc.nextLine(); // Consumir la entrada incorrecta
                        }
                        break;
                    case 4:
                        // Opción 4: Eliminar cliente
                        System.out.print("Ingrese el ID del cliente a eliminar: ");
                        int idClienteEliminar = sc.nextInt();
                        sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                        serviciosCliente.eliminarCliente(idClienteEliminar);
                        System.out.println("Cliente eliminado exitosamente.");
                        break;
                    case 5:
                        // Opción 5: Registrar rutina
                        serviciosRutina.registrarRutina();
                        System.out.println("Rutina registrada exitosamente.");
                        break;
                    case 6:
                        // Opción 6: Obtener lista de rutinas
                        serviciosRutina.obtenerRutinas();
                        break;
                    case 7:
                        // Opción 7: Actualizar rutina
                        System.out.print("Ingrese el ID de la rutina a actualizar: ");
                        int idRutina = sc.nextInt();
                        sc.nextLine(); // Consumir el carácter de nueva línea pendiente

                        try {
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nombreRutina = sc.nextLine();
                            System.out.print("Ingrese la nueva duración: ");
                            int duracionRutina = sc.nextInt();
                            sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                            System.out.print("Ingrese el nuevo nivel de dificultad: ");
                            String nivelDificultadRutina = sc.nextLine();
                            System.out.print("Ingrese la nueva descripción: ");
                            String descripcionRutina = sc.nextLine();
                            serviciosRutina.actualizarRutina(idRutina, nombreRutina, duracionRutina, nivelDificultadRutina, descripcionRutina);
                            System.out.println("Rutina actualizada exitosamente.");
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Valor inválido. No se pudo actualizar la rutina.");
                            sc.nextLine(); // Consumir la entrada incorrecta
                        }
                        break;
                    case 8:
                        // Opción 8: Eliminar rutina
                        System.out.print("Ingrese el ID de la rutina a eliminar: ");
                        int idRutinaEliminar = sc.nextInt();
                        sc.nextLine(); // Consumir el carácter de nueva línea pendiente
                        serviciosRutina.eliminarRutina(idRutinaEliminar);
                        System.out.println("Rutina eliminada exitosamente.");
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                        break;
                }

                System.out.println(); // Línea en blanco para separar las iteraciones del menú
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un valor numérico para la opción.");
                sc.nextLine(); // Consumir la entrada incorrecta
                opcion = 0; // Asignar una opción inválida para que se repita el ciclo del menú
            }
        } while (opcion != 9);

        sc.close();
    }
}