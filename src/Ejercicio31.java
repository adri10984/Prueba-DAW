import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int numero = sc.nextInt();
        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores = divisores + i + " ";
            }
        }
        System.out.println("Los numeros divisores son: " + divisores);






    }
}
