import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;
        int asc;
        System.out.println("Indica un valor");
        valor1 = sc.nextInt();
        System.out.println("Indica otro valor");
        valor2 = sc.nextInt();
        System.out.println("Indica el orden de los valores, escribe 1 para ascendente o 2 para descendente:");
        asc = sc.nextInt();
        if (asc == 1) {
            if (valor1 < valor2) {
                System.out.println(valor1 + " es menor que " + valor2);
            } else {
                System.out.println(valor2 + " es menor que " + valor1);
            }
        } else {
            if (valor1 > valor2) {
                System.out.println(valor1 + " es mayor que " + valor2);
            } else {
                System.out.println(valor2 + " es mayor que " + valor1);
            }
        }

    }
}
