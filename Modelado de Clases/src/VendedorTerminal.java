public class VendedorTerminal extends Vendedor {

    // Atributos
    private int nroVentanilla;
    private String apelNom;

    // Asociacion VendedorTerminal - Parada
    private Parada parada;

    // Constructor
    public VendedorTerminal(int nroVentanilla, String apelNom, Parada parada) {
        this.nroVentanilla = nroVentanilla;
        this.apelNom = apelNom;
        this.parada = parada;
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

}
