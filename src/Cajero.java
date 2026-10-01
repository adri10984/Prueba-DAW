import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu saldo");
        int saldo = sc.nextInt();
        System.out.println("Saldo: " + saldo + " €");
        System.out.println("1. Ingresar " + "2. Retirar " + "0. Salir");
        String opcion = sc.next();
        switch (opcion) {

        }

            System.out.println("Ingrese una cantidad");
            int cantidad = sc.nextInt();
            saldo = saldo + cantidad;
            System.out.println("Saldo: " + saldo + " €");
        }
    }
}
