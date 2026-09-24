import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Escribe un numero para saber su tabla de multiplicación");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) { //hago que empiece desde 1 i=1 y acabe en 10
            if (num >= 0){
                resultado = num * i;
                System.out.println(num + "x" + (i) + "=" + resultado);

            }

        }

    }
}
