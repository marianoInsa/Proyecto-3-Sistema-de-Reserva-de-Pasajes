import java.util.LinkedList;

public class Empresa {

    // Atributos
    private String nombre;
    private int cuit;
    private String ubicacion;

    // Asociacion Empresa - Viaje
    private LinkedList<Viaje> viajes;

    // Asociacion Empresa - Parada
    private LinkedList<Parada> paradas;

    // Asociacion Empresa - Pasajero
    private LinkedList<Pasajero> pasajeros;

    // Asociacion Empresa - Vendedor
    private LinkedList<Vendedor> vendedores;

    // Contrucctor
    public Empresa(String nombre, int cuit, String ubicacion) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.ubicacion = ubicacion;
        this.viajes = new LinkedList<Viaje>();
        this.paradas = new LinkedList<Parada>();
        this.pasajeros = new LinkedList<Pasajero>();
        this.vendedores = new LinkedList<Vendedor>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Metodos
    public void addViaje(Viaje viaje) {
        viajes.add(viaje);
        System.out.println("Viaje añadido: ");
        System.out.println("Origen: " + viaje.getOrigen().getLocalidad() + " - Destino: " + viaje.getDestino().getLocalidad());
    }

    public void addPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
        System.out.println("Pasajero añadido");
    }

    public void addParada(Parada parada) {
        paradas.add(parada);
        System.out.println("Parada añadida: " + parada.getNombre());
    }

    public void addVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("Vendedor añadido");
    }
    
}  
