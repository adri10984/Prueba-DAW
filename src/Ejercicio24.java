import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hay10 = false;
        double nota;
        double contador = 0;
        double totalNota = 0;

        System.out.println("Introduce tus notas para sacar la media, escribe -1 para parar");

        do {
            nota = sc.nextInt();
            System.out.println("Escribe la siguiente nota:");
            if (nota != -1) { // Si la nota es distinta a -1 ejecuta el bucle
                totalNota = totalNota + nota;
                contador++;
            }
            if (nota == 10) {
                hay10 = true;
            }
        } while (nota != -1); //Repite hasta que sea -1

        double media = totalNota / contador;

        System.out.println("Tu media es: " + media);
        System.out.println("Hay algun 10? " + hay10);


    }
}
