import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el numero por el cual multiplicar");
        int num2 = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= num2; i++) {
            total = total + num1 ;
        }
        System.out.println(num1 + " sumado " + num2 + " veces, es: " + total);
    }
}
