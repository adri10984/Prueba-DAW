import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el primer numero: ");
        valor1 = sc.nextInt();
        System.out.println("Escribe un segundo numero");
        valor2 = sc.nextInt();

        if (valor1 > valor2){
            System.out.println(valor1 + " es mas grande que: " + valor2);
        }else{
            System.out.println(valor2 + " es mas grande que: " + valor1);
    }
}
}
