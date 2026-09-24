import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas;
        int minutos;
        int segundos;

        System.out.println("Introduce las horas:");
        horas = sc.nextInt();
        System.out.println("Introduce los minutos:");
        minutos = sc.nextInt();
        System.out.println("Introduce los segundos:");
        segundos = sc.nextInt();

        segundos++;

        if (segundos == 60){
            segundos = 0;
            minutos++;
            if (minutos == 60){
                minutos = 0;
                horas++;
            }

            System.out.println(horas + " H " + minutos + " M " + segundos + " S ");
        }




    }
}
