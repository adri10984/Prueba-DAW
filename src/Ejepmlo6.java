import java.util.Scanner;

import static java.lang.Math.PI;

public class Ejepmlo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radio;

        System.out.println("Escribe el radio de la circunferencia: ");
        radio = sc.nextDouble();

        double largo = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("El largo es: " + largo);
        System.out.println("El area es: " + area);

    }
}
