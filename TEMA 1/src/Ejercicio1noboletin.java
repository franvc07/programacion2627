import java.util.Scanner;

public class Ejercicio1noboletin {
    static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner teclado1 = new Scanner(System.in);
        int numero1 = teclado1.nextInt();
        System.out.println("Introduce un numero");
        int numero2 = teclado1.nextInt();

        System.out.println("la suma es "+ (numero1+numero2));
        System.out.println("la resta es " + (numero1-numero2));
        System.out.println("la multiplicación es " + (numero1*numero2));
        System.out.println("la division es " + (numero1/numero2));
    }
}
