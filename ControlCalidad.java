import java.util.Scanner;

public class ControlCalidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minPermitido = 10.0;
        double maxPermitido = 20.0;
        int piezasRevisadas = 0;
        double medidaIncorrecta = 0;

        while (true) {
            System.out.print("Ingrese medida de la pieza (rango permitido 10.0 a 20.0): ");
            double medida = sc.nextDouble();

            if (medida < minPermitido || medida > maxPermitido) {
                medidaIncorrecta = medida;
                break;
            }

            piezasRevisadas++;
        }

        System.out.println("Medida incorrecta: " + medidaIncorrecta);
        System.out.println("Cantidad de piezas revisadas: " + piezasRevisadas);
        sc.close();
    }
}