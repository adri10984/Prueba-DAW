package Refuerzo;

import java.util.Scanner;

public class Refuerzo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduce un numero emtero");
        num1 = sc.nextInt();
        if (num1 == 0){
            System.out.println("El producto de 0 por cualquier otro número es 0");
        } else{
            System.out.println("Escribe otro numero");
            num2 = sc.nextInt();
            int resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        }
    }
}
