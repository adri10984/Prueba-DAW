package Refuerzo;

import java.util.Scanner;

public class Refuerzo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Escribe un numero entero");
        num1 = sc.nextInt();
        System.out.println("Escribe otro numero entero");
        num2 = sc.nextInt();

        if (num2 == 0){
            System.out.println("Error: No se puede dividir entre cero");
        } else {
            int resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        }
    }
}
