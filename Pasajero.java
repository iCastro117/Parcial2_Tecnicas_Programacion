import java.util.List;
import java.util.Scanner;
public class Pasajero extends Vuelo{
    private String datosPersona;

    private String nombre;
    private int numeroPasaporte;
    private int edad;
    private String nombrealimento;

    public Pasajero(String nombre, int numeroPasaporte, int edad, String preferenciasAlimenticias) {
        super(nombre,  numeroPasaporte, edad, preferenciasAlimenticias);
        this.datosPersona = datosPersona;
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }
    public void edad(int edad) {
        this.edad= edad;
    }
    public void numeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }
    public void preferenciasAlimenticias(String preferenciasAlimenticias) {
        this.nombrealimento = preferenciasAlimenticias;
    }

    public String nombre() {
        return nombre;
    }
    public int numeroPasaporte() {
        return numeroPasaporte;
    }
    public int edad() {
        return edad;
    }
    public String preferenciasAlimenticias() {
        return nombrealimento;
    }

}
