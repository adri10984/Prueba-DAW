import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;


        String operacion;
        System.out.println("Indica un numero");
        num1 = sc.nextInt();
        System.out.println("Indica otro numero");
        num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("Indica la operación a realizar");
        operacion = sc.next();
        switch (operacion) {
            case "+":
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case "-":
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case "*":
                System.out.println("El resultado de la multiplicación es: " + mult);
                break;
            case "/":
                System.out.println("El resultado de la división es: " + div);
                break;
        }
    }
}
