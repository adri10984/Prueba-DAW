import java.util.Scanner;

public class EjercicioA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kwh;
        double precio;

        System.out.println("Introduce tu consumo mensual: ");
        kwh = sc.nextDouble();

        if (kwh <= 100){
            precio = kwh * 0.10;
        } else if (kwh <= 300) {
            kwh = kwh -100;
            precio = kwh * 0.15 + 10;
        } else {
            kwh = kwh - 300;
            precio = kwh * 0.2 + 40;
        }

        System.out.println("Su importe a pagar son: " + precio);


    }
}
