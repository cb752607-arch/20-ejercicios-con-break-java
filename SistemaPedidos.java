import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pedidosProcesados = 0;
        int numeroPedidoUrgente = 0;

        while (true) {
            System.out.print("Ingrese número de pedido: ");
            int numeroPedido = sc.nextInt();

            System.out.print("¿Es urgente? (S/N): ");
            String urgente = sc.next().trim().toUpperCase();

            pedidosProcesados++;

            if (urgente.equals("S")) {
                numeroPedidoUrgente = numeroPedido;
                break;
            }
        }

        System.out.println("Número del pedido urgente: " + numeroPedidoUrgente);
        System.out.println("Pedidos procesados: " + pedidosProcesados);
        sc.close();
    }
}
