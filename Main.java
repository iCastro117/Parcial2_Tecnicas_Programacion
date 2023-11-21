
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Primer método que se ejecuta al correr el programa.
 *
 * @param args
 *
 * Complejidad temporal: O(1) Tiempo constante.
 */

public class Main {
    private Scanner scanner;
    public static void main(String[] args) {

        Reserva reservaVuelo = new Reserva();
        Scanner scanner = new Scanner(System.in);
        List<Pasajero> reserves = new ArrayList<>();

        Pasajero Isabella= new Pasajero("Isabella", 25244, 19, "vegetariano");
        Pasajero Camila= new Pasajero("Camila", 85644, 21, "Vegano");
        Pasajero Diego= new Pasajero("Diego", 62170, 87, "Omnivoro");

        reservaVuelo.registrarReserva(Isabella);
        reservaVuelo.registrarReserva(Camila);
        reservaVuelo.registrarReserva(Diego);



    }

    System.out.println("¿Con que pasajero se identifica el usuario?");
    System.out.println("(1) " );
    System.out.println("(2) Nombre:Camila" + "Pasaporte: 85644" + "Edad: 21" + "Preferencia alimentaria: Vegano");
    System.out.println("(3) Nombre:Diego" + "Pasaporte: 62170" + "Edad: 87" + "Preferencia alimentaria: Omnivoro");
    int opcion = scanner.nextInt();


    switch (opcion) {

        case 1:
            System.out.println("Nombre:Isabella" + "Pasaporte: 25244" + "Edad: 19" + "Preferencia alimentaria: vegetariano");
            System.out.println("Digite el origen del vuelo");
            int origen = scanner.nextInt();

            System.out.println("Digite el destino del vuelo");
            int destino = scanner.nextInt();

            System.out.println("Digite la fecha del vuelo");
            int fecha = scanner.nextInt();

            System.out.println("Digite la hora del vuelo");
            int hora = scanner.nextInt();

            System.out.println("Digite la capacidad maxima de pasajeros del vuelo");
            int capacidadMaximaPasajeros = scanner.nextInt();
            if capacidadMaximaPasajeros {

        }

            break;
        case 2:
            System.out.println("Nombre:Camila" + "Pasaporte: 85644" + "Edad: 21" + "Preferencia alimentaria: Vegano");
            System.out.println("Digite el origen del vuelo");
            origen = scanner.nextInt();

            System.out.println("Digite el destino del vuelo");
            destino = scanner.nextInt();

            System.out.println("Digite la fecha del vuelo");
            fecha = scanner.nextInt();

            System.out.println("Digite la hora del vuelo");
            hora = scanner.nextInt();

            System.out.println("Digite la capacidad maxima de pasajeros del vuelo");
            capacidadMaximaPasajeros = scanner.nextInt();
            break;
        case 3:
            System.out.println("(3) Nombre:Diego" + "Pasaporte: 62170" + "Edad: 87" + "Preferencia alimentaria: Omnivoro");
            System.out.println("Digite el origen del vuelo");
            origen = scanner.nextInt();

            System.out.println("Digite el destino del vuelo");
            destino = scanner.nextInt();

            System.out.println("Digite la fecha del vuelo");
            fecha = scanner.nextInt();

            System.out.println("Digite la hora del vuelo");
            hora = scanner.nextInt();

            System.out.println("Digite la capacidad maxima de pasajeros del vuelo");
            capacidadMaximaPasajeros = scanner.nextInt();

            break;

        default:
            System.out.println("Opción no válida.");
    }


}