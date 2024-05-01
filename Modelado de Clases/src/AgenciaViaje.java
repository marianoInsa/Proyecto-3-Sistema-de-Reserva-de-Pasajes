import java.util.LinkedList;

public class AgenciaViaje implements Vendedor {

    // Atributos
    private String cuit;
    private String nombre;

    // Asociacion Vendedor - Reserva
    private LinkedList<Reserva> reservas;

    // Constructor
    public AgenciaViaje(String cuit, String nombre) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.reservas = new LinkedList<Reserva>();
    }
    
    // Getters y Setters
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodos
    @Override
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    @Override
    public void getReservasRealizadas() {
        System.out.println("Reservas realizadas: ");
        System.out.println("ApelNom | Nro Asiento");
        for (Reserva reserva : reservas) {
            System.out.println("Fecha: " + reserva.getFechaHoraReserva());
            System.out.println("Nro Pasaje: " + reserva.getNroPasaje());
            System.out.println("Monto Abonado: " + reserva.getMontoAbon());
        }
    }

    public void limpiarReservas() {
        reservas.clear();
    }

}