import java.util.Scanner;

public class MiEntradaSalida {

    //LEER TEXTO CADENA
    public static String leerCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf(mensaje + ": ");
        String cadenaIntroducida = teclado.nextLine();
        return cadenaIntroducida;
    }

    //LEER NUMERO ENTERO
    public static int leerEntero(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        int numeroLeido = Integer.parseInt(teclado.nextLine());
        return numeroLeido;
    }


    //LEER ENTERO POSITIVO
    public static int leerEnteroPositivo(String mensaje){
     Scanner teclado = new Scanner(System.in);
     System.out.printf("%s ", mensaje);
     int numeroLeidoPositivo;
        do {
            numeroLeidoPositivo= Integer.parseInt(teclado.nextLine());
            if (numeroLeidoPositivo <= 0){
                System.out.println("Introduce un numero positivo");
            }
        }while (numeroLeidoPositivo <= 0);
        return numeroLeidoPositivo;
    }



    static void main(String[] args) {
        /*String nombre = leercadena("¿como te llamas?");*/
        /*System.out.println("Hola " + nombre);*/
        int numero = leerEntero("¿Que numero?");
        System.out.println(numero + " Es un numero es entero");
    }



}
