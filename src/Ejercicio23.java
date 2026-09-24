import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int positivos = 0;
            int num;

            System.out.println("Escribre tantos numeros como quieras, para parar deberás pulsar 0");

            do {
                num = sc.nextInt();
                System.out.println("Escribe otro");
                if (num > 0){
                    positivos++;
            }
                } while (num != 0);

            System.out.println("Son positivos: " + positivos);

        }
}
