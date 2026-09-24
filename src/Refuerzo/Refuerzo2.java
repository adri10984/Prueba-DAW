package Refuerzo;

import java.util.Scanner;

public class Refuerzo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("El numero es par");
        }  else {
            System.out.println("El numero es impar");
        }
    }
}
