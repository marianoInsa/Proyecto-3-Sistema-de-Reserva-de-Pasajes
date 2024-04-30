import java.util.ArrayList;

public class Pasajero {

    // Atributos
    private String apelNom;
    private int dni;

    // Asociacion Pasajero - Reserva
    private ArrayList<Reserva> reservas;

    // Constructor
    public Pasajero(String apelNom, int dni) {
        this.apelNom = apelNom;
        this.dni = dni;
        this.reservas = new ArrayList<Reserva>();
    }
    
    // Getters y Setters
    public String getApelNom() {
        return apelNom;
    }
    
    public void setApelNom(String apelNom) {
        this.apelNom = apelNom;
    }
    
    public int getDni() {
        return dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    // Metodos
    public void getTodasReservas() {
        System.out.println("Reservas de " + getApelNom() + ": ");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void reservar(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Viaje reservado con exito");
    }

    public void limpiarReservas() {
        reservas.clear();
    }
    
}
