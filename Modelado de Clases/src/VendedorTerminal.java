import java.util.LinkedList;

public class VendedorTerminal extends Persona implements Vendedor {

    // Atributos
    private int nroVentanilla;

    // Asociacion VendedorTerminal - Parada
    private Parada parada;

    // Asociacion Vendedor - Reserva
    private LinkedList<Reserva> reservas;

    // Constructor
    public VendedorTerminal(int nroVentanilla, String apelNom, int dni, String direccion, int telefono, Parada parada) {
        super(apelNom, dni, direccion, telefono);
        this.nroVentanilla = nroVentanilla;
        this.apelNom = apelNom;
        this.parada = parada;
        this.reservas = new LinkedList<Reserva>();
    }

    // Getters y Setters
    public int getNroVentanilla() {
        return nroVentanilla;
    }

    public void setNroVentanilla(int nroVentanilla) {
        this.nroVentanilla = nroVentanilla;
    }

    public String getApelNom() {
        return apelNom;
    }

    public void setApelNom(String apelNom) {
        this.apelNom = apelNom;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    // Metodos

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

    @Override
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void limpiarReservas() {
        reservas.clear();
    }
}