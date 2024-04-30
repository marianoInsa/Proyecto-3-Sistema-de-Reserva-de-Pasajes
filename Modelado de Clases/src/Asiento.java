public class Asiento {
    
    // Atributos
    private int nro;

    // Asociacion Asiento - Reserva
    // No es necesario colocar la creacion de un objeto Reserva desde Asiento, ya que esa operacion jamas sera realizada. Es decir, siempre se intanciaran asientos desde Reserva, pero nunca viceversa.

    // Constructor
    public Asiento(int nro) {
        this.nro = nro;
    }

    // Getters y Setters
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    // Metodo
    public void getEstado() {
        System.out.println("Estado del asiento: ");
    }
    
}
