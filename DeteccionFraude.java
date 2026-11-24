import java.util.Scanner;

public class DeteccionFraude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double limiteSospechoso = 50000.0;
        double montoSospechoso = 0;

        while (true) {
            System.out.print("Ingrese monto del movimiento financiero (S/): ");
            double monto = sc.nextDouble();

            if (monto > limiteSospechoso) {
                montoSospechoso = monto;
                break;
            }
        }

        System.out.println("Monto sospechoso: S/ " + montoSospechoso);
        sc.close();
    }
}