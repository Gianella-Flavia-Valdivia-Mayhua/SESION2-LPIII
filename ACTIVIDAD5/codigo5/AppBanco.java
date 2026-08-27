package codigo5;
import java.util.Scanner;
public class AppBanco {

	public static void main(String[] args) {
		Cuenta[] cuentas = new Cuenta[4];

        cuentas[0] = new CuentaAhorro(1000, 1.0);
        cuentas[1] = new CuentaAhorro(2000, 5.0);
        cuentas[2] = new CuentaCorriente(1500);
        cuentas[3] = new CuentaCorriente(2500);

        Scanner in = new Scanner(System.in);

        boolean done = false;

        while (!done) {
            System.out.print("D)epositar R)etirar C)onsultar S)alir: ");
            String op = in.next();

            if (op.equals("D") || op.equals("R")) {

                System.out.print("Ingrese un numero de cuenta y un monto: ");
                int num = in.nextInt();
                while (num < 0 || num >= cuentas.length) {
                    System.out.print("Numero de cuenta invalido. Ingrese un numero entre 0 y " + (cuentas.length - 1) + ": ");
                    num = in.nextInt();
                }
                
                double monto = in.nextDouble();

                if (op.equals("D")) {
                    cuentas[num].depositar(monto);
                } else {
                    cuentas[num].retirar(monto);
                }

                System.out.println("Saldo: " + cuentas[num].getSaldo());

            } else if (op.equals("C")) {

                for (int n = 0; n < cuentas.length; n++) {
                    cuentas[n].consultar();
                    System.out.println(n + " " + cuentas[n].getSaldo());
                }

            } else if (op.equals("S")) {
                done = true;
            }
        }
	}

}
