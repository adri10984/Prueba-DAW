package Refuerzo;

import java.util.Scanner;

public class Refuerzo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el numero");
        num1 = sc.nextInt();
        if (num1 % 10 == 0) {
            System.out.println("El numero es multiplo de 10");
            System.out.println("Introduce otro numero");
            num2 = sc.nextInt();
            if (num2 % 10 ==0){
                System.out.println("El segundo numero tambien es multiplo de 10");
            } else {
                System.out.println("El segundo numero no multiplo de 10");
            }
        } else  {
            System.out.println("El numero no es multiplo de 10");
        }
    }
}
