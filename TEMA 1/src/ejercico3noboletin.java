import java.util.Scanner;

public class ejercico3noboletin {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        String c = teclado.nextLine();
        double numero1 = Double.parseDouble(c);
        double numero2 = Double.parseDouble(teclado.nextLine());

        System.out.printf("la suma es %,2f, la resta vale %,2f, la multiplicacion vale %,2f, la division es %,2f/n",numero1 + numero2,numero1 - numero2,numero1 * numero2,numero1 / numero2);
        System.out.println("la suma es " + (numero1 + numero2));
        System.out.println("la resta es " + (numero1 - numero2));
        System.out.println("la multiplicación es " + (numero1 * numero2));
        System.out.println("la division es " + (numero1 / numero2));
    }
}