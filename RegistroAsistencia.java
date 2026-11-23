import java.util.Scanner;

public class RegistroAsistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAsistentes = 0;

        while (true) {
            System.out.print("Ingrese nombre del estudiante (escriba FIN para finalizar): ");
            String nombre = sc.nextLine();

            if (nombre.equals("FIN")) {
                break;
            }

            totalAsistentes++;
        }

        System.out.println("Total de asistentes registrados: " + totalAsistentes);
        sc.close();
    }
}