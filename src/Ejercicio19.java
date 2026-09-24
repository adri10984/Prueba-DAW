import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A cuanto se paga la hora? ");
        double precioHora = sc.nextDouble();

        System.out.println("Cuantas horas has trabajado? ");
        double numHoras = sc.nextInt();

        double pagoBruto;

        // Calculo salario bruto
        if (numHoras <= 35) {
            pagoBruto = numHoras*precioHora;
        } else {
            pagoBruto = 35 * precioHora + (numHoras - 35) * precioHora * 1.5;
        }

        // Calcular impuestos
        double impuestos;

        if (pagoBruto <= 500) {
            impuestos = 0;
        } else if (pagoBruto <= 900) {
            impuestos = (pagoBruto - 500) * 0.25;
        } else {
            impuestos = 400 * 0.25 + (pagoBruto - 900) * 0.45;
        }

        // Salida de los datos
        double salarioNeto = pagoBruto - impuestos;
        System.out.println(" Tu salario en bruto es: " + pagoBruto + "€");
        System.out.println(" Tu salario en neto es: " + salarioNeto + "€");
        System.out.println(" Se te quitan de impuestos: " + impuestos + "€");


    }
}
