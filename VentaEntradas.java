import java.util.Scanner;

public class VentaEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int metaEntradas = 500;
        int totalVendido = 0;
        int ventasRealizadas = 0;

        while (true) {
            System.out.print("Ingrese cantidad de entradas vendidas: ");
            int cantidad = sc.nextInt();

            if (cantidad > 0) {
                totalVendido += cantidad;
                ventasRealizadas++;
            } else {
                System.out.println("Ingrese una cantidad mayor a 0.");
            }

            if (totalVendido >= metaEntradas) {
                break;
            }
        }

        System.out.println("Total vendido: " + totalVendido);
        System.out.println("Número de ventas realizadas: " + ventasRealizadas);
        sc.close();
    }
}