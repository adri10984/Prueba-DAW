import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplicador = 1;
        int resultado = 0;

        System.out.println("Escribe un numero para saber su tabla de multiplicación");
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (num >= 0){
                resultado = num * multiplicador;
                multiplicador++;
                System.out.println(num + "x" + (multiplicador-1) + "=" + resultado);

            }

        }

    }
}
