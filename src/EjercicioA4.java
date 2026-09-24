import java.util.Scanner;

public class EjercicioA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe;
        double descuento;
        double precioFinal;

        System.out.println("Indica tu importe: ");
        importe = sc.nextDouble();

        System.out.println("Eres socio? si/no");
        String socio = sc.next();
        if (socio.equals("si")){
            if (importe >100){
                descuento = importe * 0.15;
                precioFinal = importe - descuento;
            } else if (importe >50) {
                descuento = importe * 0.1;
                precioFinal = importe-descuento;
            } else {
                precioFinal = importe;
            }
        } else {
            if (importe > 50){
                descuento = importe * 0.05;
                precioFinal = importe - descuento;
            } else {
                precioFinal = importe;
            }
        }
        System.out.println("El precio final será: " + precioFinal);



    }
}
