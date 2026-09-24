package Refuerzo;

import java.util.Scanner;

public class Refuerzo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Escribe un numero entero");
        num = sc.nextInt();
        int doble = num*2;
        int triple = num*3;
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
    }
}
