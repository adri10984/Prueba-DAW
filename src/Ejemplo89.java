import java.util.Scanner;

public class Ejemplo89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Escribe tu edad: ");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Mayor de edad ");
        } else{
            System.out.println("Menor de edad");
        }


    }
}
