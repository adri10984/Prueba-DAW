import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Indica un valor: ");
        valor1 = sc.nextInt();
        System.out.println("Indica otro valor: ");
        valor2 = sc.nextInt();

        if (valor1 > valor2){
            System.out.println(valor1 + " es un valor mas alto");
        }else {
            System.out.println(valor2 + " es un valor mas alto");
        }
        }

    }

