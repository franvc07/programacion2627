import java.util.Scanner;

public class ejercico3noboletin {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        String c = teclado.nextLine();
        double numero1 = Double.parseDouble(c);
        double numero2 = Double.parseDouble(teclado.nextLine());
        System.out.printf("la suma es %,2d, la resta vale %,2d, la multiplicacion vale %,2d, la division es %,2d/n", numero1 + numero2,numero1 - numero2,numero1 * numero2,numero1 / numero2);
        System.out.printf("la suma es " + (numero1 + numero2));
        System.out.printf("la resta es " + (numero1 - numero2));
        System.out.printf("la multiplicación es " + (numero1 * numero2));
        System.out.printf("la division es " + (numero1 / numero2));
    }
}