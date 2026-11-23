import java.util.Scanner;

public class MonitoreoServidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int registrosProcesados = 0;
        double tiempoCritico = 0;

        while (true) {
            System.out.print("Ingrese tiempo de respuesta del servidor (ms): ");
            double tiempo = sc.nextDouble();
            registrosProcesados++;

            if (tiempo > 5000) {
                tiempoCritico = tiempo;
                break;
            }
        }

        System.out.println("Tiempo crítico: " + tiempoCritico + " ms");
        System.out.println("Registros procesados: " + registrosProcesados);

        sc.close();
    }
}