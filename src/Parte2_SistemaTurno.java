public class Parte2_SistemaTurno {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};

        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};

        int inventarioBrownie = 10;

        int pedidosProcesados = 0;
        double totalRecaudado = 0;
        double mayorValor = 0;
        int numeroPedidoMayor = -1;

        // Tarea 4 — Apertura de turno
        double monto;
        boolean primerIntento = true;

        do {
            if (primerIntento) {
                monto = -50;
                primerIntento = false;
            } else {
                monto = 10000;
            }

            System.out.println("Monto ingresado: " + monto);
        } while (monto <= 0);

        System.out.println("Apertura de caja exitosa con monto: " + monto);
        System.out.println();

        // Tarea 1 — Procesamiento de pedidos
        for (int i = 0; i < pedidoProducto.length; i++) {
            int indexProducto = pedidoProducto[i];

            // Tarea 3 — Validación de inventario
            if (nombres[indexProducto].equals("Brownie")) {
                if (pedidoCantidad[i] > inventarioBrownie) {
                    System.out.println("Producto Agotado");
                    continue;
                }

                inventarioBrownie -= pedidoCantidad[i];
            }

            System.out.println("========= PEDIDO " + i + " =========");
            System.out.println("Número de Pedido: " + i);
            System.out.println("Nombre del Producto: " + nombres[indexProducto]);
            System.out.println("Cantidad del Producto: " + pedidoCantidad[i]);

            switch (categorias[indexProducto]) {
                case 'B' -> System.out.println("Categoria B - Producto: Bebida caliente");
                case 'F' -> System.out.println("Categoria F - Producto: Bebida fria");
                case 'C' -> System.out.println("Categoria C - Producto: Comida");
                case 'P' -> System.out.println("Categoria P - Producto: Postre");
                default -> System.out.println("Categoria no encontrada");
            }

            System.out.println();
            double subtotal = precios[indexProducto] * pedidoCantidad[i];
            System.out.println("Subtotal: " + subtotal);
            System.out.println();

            // Tarea 2 — Descuento por pedido
            double valorFinal = subtotal;

            if (subtotal > 12000) {
                valorFinal = subtotal - (subtotal * 0.1);
                System.out.println("Descuento: 10% aplicado");
                System.out.println("Total con Descuento: " + valorFinal);
            } else {
                System.out.println("Descuento: No aplica");
                System.out.println("Valor final: " + valorFinal);
            }

            System.out.println();

            // Tarea 5 — Reporte de cierre (acumulación)
            pedidosProcesados++;
            totalRecaudado += valorFinal;

            if (valorFinal > mayorValor) {
                mayorValor = valorFinal;
                numeroPedidoMayor = i;
            }
        }

        System.out.println("========= REPORTE DE CIERRE =========");
        System.out.println("Total de pedidos procesados: " + pedidosProcesados);
        System.out.println("Total recaudado: " + totalRecaudado);
        System.out.println("Pedido con mayor valor: Pedido " + numeroPedidoMayor + " $" + mayorValor);
    }
}