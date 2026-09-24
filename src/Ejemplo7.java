import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double precioRebajado;
        double descuento;

        System.out.println("Introduce el precio real: ");
        precio = sc.nextDouble();
        System.out.println("Introduce el precio rebajado: ");
        precioRebajado = sc.nextDouble();

        descuento = (precio - precioRebajado)/precio * 100;
        System.out.println("El descuento es del: " + descuento + "%");

    }
}
