import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Datos
        double precioProducto;
        double descuento;
        double precioFinal;

        System.out.println("Cuanto cuesta su producto? ");
        precioProducto = sc.nextDouble();


        // Calculo del precio con y sin descuento
        if (precioProducto <6){
            descuento = 0;
            precioFinal = precioProducto;
        } else if (precioProducto <60) {
            descuento = 0.05;
            precioFinal = precioProducto - (precioProducto*descuento);
        } else {
            descuento = 0.1;
            precioFinal = precioProducto - (precioProducto*descuento);
        }

        System.out.println("El precio final de su producto será: " + precioFinal + "€");


    }
}
