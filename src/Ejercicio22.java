import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;

        System.out.println("Escribre 10 numeros");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            System.out.println("Escribe otro");

            if (num > 0){
                //Es positivo
                positivos++;
            }
        }
        System.out.println("Son positivos: " + positivos);



    }
}
