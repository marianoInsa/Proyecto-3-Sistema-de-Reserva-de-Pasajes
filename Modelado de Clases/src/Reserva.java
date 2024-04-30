public class Reserva {

    // Atributos
    private int fechaHoraReserva;
    private int fechaHoraConfirm;
    
    private int fechaHoraCancel;
    private int nroPasaje;
    private double montoAbon;
    
    // Asociacion Reserva - Pasajero
    private Pasajero pasajero;

    // Asociacion Reserva - Viaje
    private Viaje viaje;

    // Asociacion Reserva - Asiento
    private Asiento asiento;

    // Asociacion Reserva - Vendedor
    private Vendedor vendedor;
    
    // Constructor
    public Reserva(int fechaHoraReserva, int fechaHoraConfirm, int fechaHoraCancel, int nroPasaje, double montoAbon, Pasajero pasajero, Viaje viaje, Asiento asiento, Vendedor vendedor) {
        this.fechaHoraReserva = fechaHoraReserva;
        this.fechaHoraConfirm = fechaHoraConfirm;
        this.fechaHoraCancel = fechaHoraCancel;
        this.nroPasaje = nroPasaje;
        this.montoAbon = montoAbon;
        this.pasajero = pasajero;
        this.viaje = viaje;
        this.asiento = asiento;
        this.vendedor = vendedor;
    }
    
    // Getters y Setters
    public int getFechaHoraReserva() {
        return fechaHoraReserva;
    }
    
    public void setFechaHoraReserva(int fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }
    
    public int getFechaHoraConfirm() {
        return fechaHoraConfirm;
    }
    
    public void setFechaHoraConfirm(int fechaHoraConfirm) {
        this.fechaHoraConfirm = fechaHoraConfirm;
    }
    
    public int getFechaHoraCancel() {
        return fechaHoraCancel;
    }
    
    public void setFechaHoraCancel(int fechaHoraCancel) {
        this.fechaHoraCancel = fechaHoraCancel;
    }
    
    public int getNroPasaje() {
        return nroPasaje;
    }
    
    public void setNroPasaje(int nroPasaje) {
        this.nroPasaje = nroPasaje;
    }
    
    public double getMontoAbon() {
        return montoAbon;
    }
    
    public void setMontoAbon(double montoAbon) {
        this.montoAbon = montoAbon;
    }
    
    public Pasajero getPasajero() {
        return pasajero;
    }
    
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    // Metodos
    public void getEstado() {
        System.out.println("Estado de la reserva: ");
        System.out.println("Pasajero: " + pasajero.getApelNom() + " - DNI: " + pasajero.getDni());
        System.out.println("Origen: " + viaje.getOrigen() + " - Destino: " + viaje.getDestino());
    }

}
