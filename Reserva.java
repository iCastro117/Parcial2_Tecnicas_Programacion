import java.util.LinkedList;
import java.util.List;

public class Reserva extends Vuelo{
    private List<Vuelo> reservas;


    public Reserva(String nombre, int numeroPasaporte, int edad, String preferenciasAlimenticias) {
        super(nombre, numeroPasaporte, edad, preferenciasAlimenticias);
    }

    public Reserva() {
        super();
    }

    public void registrarReserva (Pasajero scanner) {
        scanner.nextLine();
    }
}
