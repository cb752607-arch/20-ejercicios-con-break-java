import java.util.Scanner;

public class RegistroProduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalProducido = 0;
        int horasRegistradas = 0;

        while (true) {
            System.out.print("Ingrese producción de la hora (0 para finalizar): ");
            int produccionHora = sc.nextInt();

            if (produccionHora == 0) {
                break;
            }

            totalProducido += produccionHora;
            horasRegistradas++;
        }

        System.out.println("Total producido: " + totalProducido);
        System.out.println("Cantidad de horas registradas: " + horasRegistradas);
        sc.close();
    }
}
