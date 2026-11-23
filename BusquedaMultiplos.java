public class BusquedaMultiplos {
    public static void main(String[] args) {
        int numero = 1;
        int numeroEncontrado = 0;

        while (true) {
            if (numero % 17 == 0 && numero % 23 == 0) {
                numeroEncontrado = numero;
                break;
            }
            numero++;
        }

        System.out.println("Número encontrado: " + numeroEncontrado);
    }
}