public class BusquedaCodigoProducto {
    public static void main(String[] args) {
        String[] codigos = {"COD01", "PROD99", "ABC123", "ITEM04", "XYZ88"};
        int codigosRevisados = 0;
        int posicionEncontrada = -1;

        for (int i = 0; i < codigos.length; i++) {
            codigosRevisados++;
            if (codigos[i].equals("ABC123")) {
                posicionEncontrada = i;
                break;
            }
        }

        if (posicionEncontrada != -1) {
            System.out.println("Posición del código encontrado (índice): " + posicionEncontrada + " (posición #" + (posicionEncontrada + 1) + ")");
        } else {
            System.out.println("Código ABC123 no encontrado.");
        }
        System.out.println("Cantidad de códigos revisados: " + codigosRevisados);
    }
}
