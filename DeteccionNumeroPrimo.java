import java.util.Scanner;

public class DeteccionNumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El número " + numero + " NO es primo.");
            System.out.println("Primer divisor encontrado: No aplica.");
        } else {
            boolean esPrimo = true;
            int primerDivisor = -1;

            for (int divisor = 2; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    primerDivisor = divisor;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número " + numero + " ES primo.");
                System.out.println("Primer divisor encontrado: Ninguno (solo divisible por 1 y por sí mismo).");
            } else {
                System.out.println("El número " + numero + " NO es primo.");
                System.out.println("Primer divisor encontrado: " + primerDivisor);
            }
        }

        sc.close();
    }
}
