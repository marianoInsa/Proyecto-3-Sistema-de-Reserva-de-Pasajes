import java.util.ArrayList;
import java.util.LinkedList;

public class Viaje {
    
    // Atributos
    private int fechaHoraSalida;
    private int fechaHoraLlegada;
    private float precioBase;

    // Asociacion Viajes - Paradas
    private Parada origen;
    private Parada destino;

    // Composicion Viaje - Asiento
    private ArrayList<Asiento> asientos;
    private int cantAsientosDisp;

    // Asociacion Viaje - Reserva
    private LinkedList<Reserva> reservas;

    // Constructor
    public Viaje(int fechaHoraSalida, int fechaHoraLlegada, float precioBase, Parada origen, Parada destino, int cantAsientosDisp) {
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.precioBase = precioBase;
        this.origen = origen;
        this.destino = destino;
        this.asientos = new ArrayList<Asiento>();
        this.cantAsientosDisp = cantAsientosDisp;
        this.reservas = new LinkedList<Reserva>();
    }

    // Getters y Setters
    public int getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(int fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public int getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(int fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    public ArrayList<Asiento> getAsiento() {
        return asientos;
    }

    // Metodos
    public float getDuracionHs() {
        return fechaHoraLlegada - fechaHoraSalida;
    }

    public Parada getOrigen() {
        return origen;
    }

    public void setOrigen(Parada origen) {
        this.origen = origen;
    }

    public Parada getDestino() {
        return destino;
    }

    public void setDestino(Parada destino) {
        this.destino = destino;
    }

    public int getCantAsientosDisp() {
        return cantAsientosDisp;
    }

    public void agregarReserva(Reserva reserva, Asiento asiento) {
        if (cantAsientosDisp > 0) {
            reservas.add(reserva);
            asientos.add(asiento);
            cantAsientosDisp--;
            System.out.println("Asiento reservado con exito.");
        } else {
            System.out.println("No hay asientos disponibles");
        }
    }

    public void liberarAientos() {
        asientos.clear();
        reservas.clear();
        cantAsientosDisp = 0;
        System.out.println("Asientos liberados con exito");
    }

}
