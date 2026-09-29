import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String cadena = "";
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            cadena = cadena + " " + i;
            System.out.println(cadena);
            }
//Usamos string como acumulador para que cada valor de i que se va incrementando lo transforme en una cadena

    }
}
