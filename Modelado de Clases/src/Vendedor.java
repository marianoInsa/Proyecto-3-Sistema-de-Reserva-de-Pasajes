import java.util.LinkedList;

public class Vendedor {

    // Atributos

    // Asociacion Vendedor - Reserva
    private LinkedList<Reserva> reservas;

    // Constructor
    public Vendedor() {
        this.reservas = new LinkedList<Reserva>();
    }
    // Getters y Setters

    // Metodos
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void getReservasRealizadas() {
        System.out.println("Reservas realizadas: ");
        System.out.println("ApelNom | Nro Asiento");
        for (Reserva reserva : reservas) {
            System.out.println(reserva.getPasajero().getApelNom() + " | " + reserva.getAsiento().getNro());
        }
    }
}
