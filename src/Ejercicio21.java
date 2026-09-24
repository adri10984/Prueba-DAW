import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        boolean bisiesto;

        System.out.println("Escribe un año:");
        año = sc.nextInt();

        if (400 % 4 == 0){
            bisiesto = true;
        } else {
            bisiesto = false;
        }



        if (bisiesto = true){
            System.out.println("Tu año es bisiesto");
        } else {
            System.out.println("Tu año no es bisiesto");
        }

    }
}
