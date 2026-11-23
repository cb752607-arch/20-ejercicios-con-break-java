import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentosUsados = 0;

        while (true) {
            System.out.print("Adivina el número (entre 1 y 100): ");
            int intentoUsuario = sc.nextInt();
            intentosUsados++;

            if (intentoUsuario == numeroSecreto) {
                break;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }

        System.out.println("Número de intentos usados: " + intentosUsados);
        System.out.println("¡Felicitaciones! Adivinaste el número secreto (" + numeroSecreto + ").");
        sc.close();
    }
}
