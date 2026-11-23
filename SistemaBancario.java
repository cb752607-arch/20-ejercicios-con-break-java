import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int registrosProcesados = 0;
        boolean transferenciaSuperada = false;
        double transferenciaDetectada = 0;

        while (true) {
            System.out.print("Ingrese monto de transferencia bancaria (S/): ");
            double monto = sc.nextDouble();
            registrosProcesados++;

            if (monto > 100000) {
                transferenciaSuperada = true;
                transferenciaDetectada = monto;
                break;
            }
        }

        if (transferenciaSuperada) {
            System.out.println("Transferencia detectada: S/ " + transferenciaDetectada);
        } else {
            System.out.println("No se detectaron transferencias superiores a S/100000.");
        }
        System.out.println("Cantidad de registros procesados: " + registrosProcesados);

        sc.close();
    }
}
