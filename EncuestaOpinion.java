import java.util.Scanner;

public class EncuestaOpinion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRespuestas = 0;
        int sumaSatisfaccion = 0;

        while (true) {
            System.out.print("Ingrese respuesta del 1 al 5 (0 para finalizar): ");
            int respuesta = sc.nextInt();

            if (respuesta == 0) {
                break;
            }

            if (respuesta >= 1 && respuesta <= 5) {
                totalRespuestas++;
                sumaSatisfaccion += respuesta;
            } else {
                System.out.println("Respuesta inválida. Debe estar entre 1 y 5.");
            }
        }

        System.out.println("Total de respuestas: " + totalRespuestas);
        if (totalRespuestas > 0) {
            double promedio = (double) sumaSatisfaccion / totalRespuestas;
            System.out.println("Promedio de satisfacción: " + promedio);
        } else {
            System.out.println("Promedio de satisfacción: 0.0");
        }

        sc.close();
    }
}
