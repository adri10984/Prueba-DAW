import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        double numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero positivo o negativo");
        numero = sc.nextDouble();
        if (numero <0 ){
            System.out.println("Numero negativo ");
        }else {
            System.out.println("Numero positivo ");
        }
    }
}
