package codigo5;

public class CuentaCorriente extends Cuenta {
    private int retiros;

    public CuentaCorriente(double saldo) {
        super(saldo);
        retiros = 0;
    }

    public void retirar(double monto) {
        final int LIBRE_RETIROS = 3;
        final double TARIFA_TRANSACCION = 3.5;

        super.retirar(monto);
        retiros++;

        if (retiros > LIBRE_RETIROS) {
            super.retirar(TARIFA_TRANSACCION);
        }
    }

    public void consultar() {
        retiros = 0;
    }
}