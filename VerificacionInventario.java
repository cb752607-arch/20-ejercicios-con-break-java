import java.util.Scanner;

public class VerificacionInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int registrosValidos = 0;
        int productoConError = 0;

        while (true) {
            System.out.print("Ingrese stock del producto (negativo para detener): ");
            int stock = sc.nextInt();

            if (stock < 0) {
                productoConError = stock;
                break;
            }

            registrosValidos++;
        }

        System.out.println("Producto con error: " + productoConError);
        System.out.println("Cantidad de registros válidos: " + registrosValidos);
        sc.close();
    }
}