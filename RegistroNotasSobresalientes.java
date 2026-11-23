import java.util.Scanner;

public class RegistroNotasSobresalientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNotas = 0;
        double sumaNotas = 0;
        double notaMaxima = Double.NEGATIVE_INFINITY;
        double notaMinima = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese una nota (20 para terminar): ");
            double nota = sc.nextDouble();

            if (nota == 20) {
                break;
            }

            cantidadNotas++;
            sumaNotas += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        if (cantidadNotas > 0) {
            double promedio = sumaNotas / cantidadNotas;
            System.out.println("Cantidad de notas registradas: " + cantidadNotas);
            System.out.println("Promedio de notas: " + promedio);
            System.out.println("Nota máxima: " + notaMaxima);
            System.out.println("Nota mínima: " + notaMinima);
        } else {
            System.out.println("No se registraron notas antes del 20.");
        }

        sc.close();
    }
}
