package codigo5;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;
    private double minSaldo;

    public CuentaAhorro(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
        minSaldo = saldo;
    }

    public void retirar(double monto) {
        super.retirar(monto);
        double saldo = getSaldo();

        if (saldo < minSaldo) {
            minSaldo = saldo;
        }
    }

    public void consultar() {
        double interes = minSaldo * tasaInteres / 100;
        depositar(interes);
        minSaldo = getSaldo();
    }
}
