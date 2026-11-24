import java.util.Scanner;

public class CompetenciaDeportiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ganador = "";
        int puntajeFinal = 0;

        while (true) {
            System.out.print("Ingrese nombre del participante: ");
            String participante = sc.next();

            System.out.print("Ingrese puntaje acumulado: ");
            int puntaje = sc.nextInt();

            if (puntaje >= 100) {
                ganador = participante;
                puntajeFinal = puntaje;
                break;
            }
        }

        System.out.println("Ganador: " + ganador);
        System.out.println("Puntaje final: " + puntajeFinal);
        sc.close();
    }
}