import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dividendo");
        int num1 = sc.nextInt();
        System.out.println("Introduce el divisor");
        int num2 = sc.nextInt();
        int resto= 0;
        while (num1 >= num2){
         num1 = num1 - num2;
         resto++;
        }

    }
}