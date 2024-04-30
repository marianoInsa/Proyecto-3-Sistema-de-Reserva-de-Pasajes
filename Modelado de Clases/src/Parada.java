import java.util.LinkedList;
import java.util.ArrayList;

public class Parada {
    
    // Atributos
    private String nombre;
    private String direccion;
    private String localidad;
    private String provincia;

    // Asociacion Parada - Viaje
    private LinkedList<Viaje> viajesDeOrigen;
    private LinkedList<Viaje> viajesDeDestino;

    // Asociacion Parada - VendedorTerminal
    private ArrayList<VendedorTerminal> vendedorTerminal;

    // Constructor
    public Parada(String nombre, String direccion, String localidad, String provincia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.viajesDeOrigen = new LinkedList<Viaje>();
        this.viajesDeDestino = new LinkedList<Viaje>();
        this.vendedorTerminal = new ArrayList<VendedorTerminal>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public ArrayList<VendedorTerminal> getVendedorTerminal() {
        return vendedorTerminal;
    }

    public void setVendedorTerminal(ArrayList<VendedorTerminal> vendedorTerminal) {
        this.vendedorTerminal = vendedorTerminal;
    }

    // Metodos
    public String getNombreYDirComp() {
        return getNombre() + ", " + getDireccion();
    }

    // Asociacion Parada - Viaje
    public void agregarViajeDeOrigen(Viaje viaje) {
        viajesDeOrigen.add(viaje);
    }

    public void agregarViajeDeDestino(Viaje viaje) {
        viajesDeDestino.add(viaje);
    }
    
    public void eliminarViajeDeOrigen(Viaje viaje) {
        viajesDeOrigen.remove(viaje);
    }

    public void eliminarViajeDeDestino(Viaje viaje) {
        viajesDeDestino.remove(viaje);
    }
}
