public class Main {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta("123456", "Ahorro", 150000);
        System.out.println("Saldo minimo: " + miCuenta.getSaldoMinimo());
    }
}
