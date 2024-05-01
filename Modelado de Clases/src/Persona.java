public class Persona {

    // Atributos
    protected String apelNom;
    protected int dni;
    protected String direccion;
    protected int telefono;
    
    // Constructor
    public Persona(String apelNom, int dni, String direccion, int telefono) {
        this.apelNom = apelNom;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    // Metodos

}
