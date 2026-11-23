import java.util.Scanner;

public class SistemaAccesoSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "1234";
        int maxIntentos = 5;
        boolean accesoConcedido = false;
        int intentoAcceso = 0;

        for (int intento = 1; intento <= maxIntentos; intento++) {
            System.out.print("Intento " + intento + " de " + maxIntentos + " - Ingrese la contraseña: ");
            String claveIngresada = sc.nextLine();

            if (claveIngresada.equals(claveCorrecta)) {
                accesoConcedido = true;
                intentoAcceso = intento;
                break;
            }
        }

        if (accesoConcedido) {
            System.out.println("Intento en el que accedió: " + intentoAcceso);
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        sc.close();
    }
}
