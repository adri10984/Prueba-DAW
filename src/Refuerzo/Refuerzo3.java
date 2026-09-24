package Refuerzo;

import java.util.Scanner;

public class Refuerzo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Escribe un numero entero");
        num1 = sc.nextInt();
        System.out.println("Escribe otro numero entero");
        num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " Es multiplo de: " +  num2);
        } else  {
            System.out.println(num1 + " No es multiplo de: " +  num2);
        }

    }
}
