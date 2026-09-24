import java.util.Scanner;

public class EjercicioA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Indica tu nota: ");
        nota = sc.nextDouble();
        System.out.println("Has entregado todas las prácticas? si/no");
        String practicas = sc.next();

        if (practicas.equals("si")){
            if (nota <5){
                System.out.println("Suspenso");
            } else if (nota < 6.9) {
                System.out.println("Aprobado");
            } else if (nota < 8.9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            if (nota <5){
                System.out.println("Suspenso doble");
            } else {
                System.out.println("Suspenso por prácticas pendientes");
            }
        }

    }
}
