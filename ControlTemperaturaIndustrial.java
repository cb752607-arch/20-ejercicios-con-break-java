import java.util.Scanner;

public class ControlTemperaturaIndustrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lecturasRealizadas = 0;
        boolean temperaturaCriticaDetectada = false;
        double temperaturaCritica = 0;

        while (true) {
            System.out.print("Ingrese temperatura de la máquina (°C): ");
            double temperatura = sc.nextDouble();
            lecturasRealizadas++;

            if (temperatura > 95) {
                temperaturaCriticaDetectada = true;
                temperaturaCritica = temperatura;
                break;
            }
        }

        if (temperaturaCriticaDetectada) {
            System.out.println("Temperatura crítica encontrada: " + temperaturaCritica + " °C");
        } else {
            System.out.println("No se encontró temperatura crítica.");
        }
        System.out.println("Número de lecturas realizadas: " + lecturasRealizadas);

        sc.close();
    }
}
