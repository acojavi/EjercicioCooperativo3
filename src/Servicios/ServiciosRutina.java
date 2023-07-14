package Servicios;
import Entidades.Rutina;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ServiciosRutina {
 private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int id = 0;
    private List<Rutina> listaRutinas = new ArrayList<>();

    public void llenarRutina() {
        // Crear todas las rutinas predefinidas
        Rutina rutina1 = new Rutina(1, "Rutina de cardio", 60, "Intermedio", "Ejercicios de cardio para quemar grasa");
        Rutina rutina2 = new Rutina(2, "Rutina de fuerza", 45, "Avanzado", "Ejercicios de fuerza para ganar masa muscular");
        Rutina rutina3 = new Rutina(3, "Rutina de yoga", 30, "Principiante", "Secuencia de posturas de yoga para relajación");
        Rutina rutina4 = new Rutina(4, "Rutina de pilates", 60, "Intermedio", "Ejercicios de pilates para fortalecer el core");
        Rutina rutina5 = new Rutina(5, "Rutina de estiramientos", 20, "Todos los niveles", "Estiramientos para mejorar la flexibilidad");

        // Agregar las rutinas a la lista
        listaRutinas.add(rutina1);
        listaRutinas.add(rutina2);
        listaRutinas.add(rutina3);
        listaRutinas.add(rutina4);
        listaRutinas.add(rutina5);

        // Establecer el último id utilizado
        id = 5;
    }

    public void registrarRutina() {
        Rutina rutina = new Rutina();
        rutina.setId(++id);
        System.out.println("Ingresa el nombre de la rutina: ");
        rutina.setNombre(sc.next());
        System.out.println("Ingresa la duración de la rutina: ");
        rutina.setDuracion(sc.nextInt());
        System.out.println("Ingresa el nivel de la rutina: ");
        sc.nextLine(); // Consumir el salto de línea anterior
        rutina.setNivel(sc.nextLine());
        System.out.println("Ingresa una descripción de la rutina: ");
        rutina.setDescripcion(sc.nextLine());

        listaRutinas.add(rutina);
    }

    public void obtenerRutinas() {
    for (Rutina rutina : listaRutinas) {
        System.out.println(rutina);
    }
}

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        boolean encontrada = false;
        for (Rutina rutinaActual : listaRutinas) {
            if (rutinaActual.getId() == id) {
                rutinaActual.setNombre(nombre);
                rutinaActual.setDuracion(duracion);
                rutinaActual.setNivel(nivelDificultad);
                rutinaActual.setDescripcion(descripcion);
                encontrada = true;
                break; // Terminar el bucle una vez encontrada la rutina
            }
        }
        if (!encontrada) {
            System.out.println("No se encontró el id de la rutina.");
        }
    }

    public void eliminarRutina(int id) {
        boolean eliminada = false;
        for (Rutina rutinaActual : listaRutinas) {
            if (rutinaActual.getId() == id) {
                listaRutinas.remove(rutinaActual);
                eliminada = true;
                break; // Terminar el bucle una vez eliminada la rutina
            }
        }
        if (!eliminada) {
            System.out.println("No se encontró el id de la rutina.");
        }
    }
}