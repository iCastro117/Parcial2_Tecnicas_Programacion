
import java.util.List;
import java.util.Scanner;
public class Vuelo {
    private String numeroVuelo;
    private String origen;
    private String destino;
    private String fecha;
    private String horaSalida;
    private String capacidadMaximaPasajeros;






    public Vuelo(String nombre, int numeroPasaporte, int edad, String preferenciasAlimenticias) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;;
        this.destino = destino;
        this.fecha = fecha;;
        this.horaSalida = horaSalida;
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
    }

    public Vuelo(List<Reserva> reservas) {

    }

    public Vuelo() {
        
    }

    protected void nextLine() {
    }
}
