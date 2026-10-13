import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class EJ2REL12 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        do {
            System.out.println("Escribe el numero de de la tabla que quieres del 0 al 10");
            num1 = teclado.nextInt();
        } while (num1<0 && num1>10);
        for (int i = 0; i < 11; i++){
            System.out.println(num1 + "x" + i + "=" + num1*i);
        }


    }
}
