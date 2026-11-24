import java.util.Scanner;

public class SimulacionRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paquetesValidosProcesados = 0;
        int numeroPaqueteCorrupto = 0;

        while (true) {
            System.out.print("Ingrese número de paquete: ");
            int numeroPaquete = sc.nextInt();

            System.out.print("¿El paquete está corrupto? (S/N): ");
            String corrupto = sc.next().trim().toUpperCase();

            if (corrupto.equals("S")) {
                numeroPaqueteCorrupto = numeroPaquete;
                break;
            }

            paquetesValidosProcesados++;
        }

        System.out.println("Número del paquete: " + numeroPaqueteCorrupto);
        System.out.println("Paquetes válidos procesados: " + paquetesValidosProcesados);
        sc.close();
    }
}
