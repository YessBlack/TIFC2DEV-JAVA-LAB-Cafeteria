
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1 — Variables y tipos de dato
        System.out.println("======================= Ejercicio 1 =======================");

        String nombreProducto = "MacBook Pro M4";
        double precioUnitario = 12000;
        int cantidadInventario = 10;
        boolean estaDisponible = true;
        char codigoProducto = 'A';

        System.out.println("-------- Detalles del Producto --------");
        String message = "Nombre del Producto: %s \nPrecio Producto %.2f%n \nCantidad en Inventario: %d \nEsta Disponible: %b \nCodigo de Producto: %s";
        String result = String.format(message, nombreProducto, precioUnitario, cantidadInventario, estaDisponible, codigoProducto);
        System.out.println(result);
        System.out.println();

        // Ejercicio 2 — Operadores
        System.out.println("======================= Ejercicio 2 =======================");

        double subtotal = 42.500;
        double valorDescuento = subtotal * 0.15;
        double totalPagar = subtotal - valorDescuento;
        boolean tieneDescuento = subtotal > 30000;

        System.out.printf("Valor del descuento: $%.2f%n", valorDescuento);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
        System.out.printf("Tiene Descuento: %b", tieneDescuento);
        System.out.println();

        //Ejercicio 3 — switch
        System.out.println("======================= Ejercicio 3 =======================");

        char categoria = 'B';

        switch (categoria) {
            case 'B' -> System.out.println("Categoria: B \nProducto: Bebida caliente \nIVA: 0%");
            case 'F' -> System.out.println("Categoria: F \nProducto: Bebida fria \nIVA: 5%");
            case 'C' -> System.out.println("Categoria: C \nProducto: Comida \nIVA: 8%");
            case 'P' -> System.out.println("Categoria: P \nProducto: Postre \nIVA: 8%");
            default -> System.out.println("Categoria no encontrada");
        }

        //Ejercicio 4 — while
        System.out.println("======================= Ejercicio 4 =======================");

        int inventarioCafe = 50;
        int unidades = 5;

        while(inventarioCafe >= 10) {
            System.out.println("Inventario Disponible " + inventarioCafe);
            inventarioCafe -= unidades;
        }
        System.out.println();

        //Ejercicio 5 — do-while
        System.out.println("======================= Ejercicio 5 =======================");

        double monto;
        boolean primerIntento = true;

        do {
            if (primerIntento) {
                monto = -20;
                primerIntento = false;
                System.out.println("Monto ingresado: " + monto + " -> El monto no es válido");
            } else {
                monto = 15000;
                System.out.println("Monto ingresado: " + monto);
            }
        } while (monto <= 0);

        System.out.println("Apertura de caja exitosa con monto: " + monto);

        System.out.println("Monto ingresado $ " + monto);
        System.out.println();

        // Ejercicio 6 — for y arrays
        System.out.println("======================= Ejercicio 6 =======================");

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        for (int i = 0; i < productos.length; i++) {
            System.out.println(i + " " + productos[i] + " $ " + precios[i]);
        }

        double sum = 0;

        for (int i = 0; i < precios.length; i++) {
            sum += precios[i];
        }

        double promedio = sum / precios.length;
        System.out.println("Promedio de Precios $ " + promedio);
        System.out.println();
    }
}