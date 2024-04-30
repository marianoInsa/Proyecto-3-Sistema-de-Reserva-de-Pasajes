public class AgenciaViaje extends Vendedor {

    // Atributos
    private String cuit;
    private String nombre;

    // Constructor
    public AgenciaViaje(String cuit, String nombre) {
        this.cuit = cuit;
        this.nombre = nombre;
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


}
