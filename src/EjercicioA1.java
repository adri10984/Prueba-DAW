import java.util.Scanner;

public class EjercicioA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println(" Cuanto pesas?");
        peso = sc.nextDouble();

        System.out.println("Cuanto mides?");
        altura = sc.nextDouble();

        imc = peso / (altura*altura);

        if (imc <18.5){
            System.out.println("Bajo peso");
        } else if (imc <24.9) {
            System.out.println("Normal");
        } else if (imc <29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }


    }
}
