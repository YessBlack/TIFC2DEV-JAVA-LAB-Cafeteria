public class CajaRegistradora {
    public static void main(String[] args) {
        // Ejercicio 7 — Debugging
        System.out.println("======================= Ejercicio 7 =======================");

        int cantidadVendida = 5;
        double precioUnitario = 4500;
        double total = cantidadVendida *  precioUnitario;
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento == true) {
            total = total - (total * 0.10);
        }

        System.out.println("Total: " + total);
    }
}