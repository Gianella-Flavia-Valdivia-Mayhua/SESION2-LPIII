package codigo4;
public class Cuenta {
    private int numero;
    private double saldo;

    // Constructor completo
    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // Constructor con saldo por defecto (0.0)
    public Cuenta(int numero) {
        this(numero, 0.0);
    }

    public int getNumCuenta() {
        return numero;
    }

    public void setNumCuenta(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta [Número: " + numero + ", Saldo: S/. " + saldo + "]";
    }
}
