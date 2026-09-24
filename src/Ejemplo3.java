import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el área: ");
        area = sc.nextDouble();

        double areaTotal = area * area;

        System.out.println("El área total es: " + areaTotal);
    }
}
