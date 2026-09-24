import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        double num1, num2;
        double sum;
        double sub;
        double mult;
        double div;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        num1 = sc.nextDouble();
        System.out.println("Escribe otro número: ");
        num2 = sc.nextDouble();

        sum = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("la suma de ambos es: " + sum);
        System.out.println("la resta de ambos es: " + sub);
        System.out.println("la multiplcación de ambos es: " + mult);
        System.out.println("la divisón de ambos es: " + div);

    }
}
