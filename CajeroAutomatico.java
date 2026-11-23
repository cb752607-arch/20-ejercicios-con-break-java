import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 500.0;
        int operacionesRealizadas = 0;

        while (true) {
            System.out.println("\n=== MENÚ CAJERO AUTOMÁTICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 4) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + saldo);
                    operacionesRealizadas++;
                    break;
                case 2:
                    System.out.print("Ingrese monto a depositar: ");
                    double montoDeposito = sc.nextDouble();
                    if (montoDeposito > 0) {
                        saldo += montoDeposito;
                        operacionesRealizadas++;
                        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    if (montoRetiro > 0 && montoRetiro <= saldo) {
                        saldo -= montoRetiro;
                        operacionesRealizadas++;
                        System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente o monto inválido.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        System.out.println("Operaciones realizadas: " + operacionesRealizadas);
        System.out.println("Cierre de sesión exitoso. ¡Hasta luego!");
        sc.close();
    }
}
