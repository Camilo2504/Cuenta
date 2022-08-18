public class Cuenta {
    //Creo las variables
    private String numero;
    private String tipo;
    private double saldoActual;
    private double saldoMinimo;

    public Cuenta(String numero, String tipo, double valorInicial) {
        this.numero = numero;
        if(tipo.equalsIgnoreCase("ahorro") || tipo.equalsIgnoreCase("corriente")){
            this.tipo = tipo;
            this.saldoMinimo = valorInicial * 0.1;
        }

    }

    //Creo getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public void consignar(double monto){
        this.saldoActual += monto;
    }

    public void retirar(double monto){
        if(this.saldoActual - monto < this.saldoMinimo){
            System.out.println("Saldo insuficiente");
            System.out.println("El valor retirado es: " + (this.saldoActual - this.saldoMinimo));
        }
        else {
            System.out.println("El valor retirado es: " + monto);
            this.saldoActual -= monto;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldoActual=" + saldoActual +
                ", saldoMinimo=" + saldoMinimo +
                '}';
    }
}
