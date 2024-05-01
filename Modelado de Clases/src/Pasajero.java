import java.util.ArrayList;

public class Pasajero extends Persona{

    // Atributos
    private int idPasajero;
    private int nroPasaporte;

    
    // Asociacion Pasajero - Reserva
    private ArrayList<Reserva> reservas;
    
    // Constructor
    public Pasajero(String apelNom, int dni, String direccion, int telefono, int idPasajero, int nroPasaporte) {
        super(apelNom, dni, direccion, telefono);
        this.idPasajero = idPasajero;
        this.nroPasaporte = nroPasaporte;
        this.reservas = new ArrayList<Reserva>();
    }
    
    // Getters y Setters
    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public int getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(int nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }
    
    // Metodos
    public void getTodasReservas() {
        System.out.println("Reservas de " + getApelNom() + ": ");
        for (Reserva reserva : reservas) {
            System.out.println("Fecha: " + reserva.getFechaHoraReserva());
            System.out.println("Nro Pasaje: " + reserva.getNroPasaje());
            System.out.println("Monto Abonado: " + reserva.getMontoAbon());
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
