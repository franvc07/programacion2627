public class EJ1REL12 {
    static void main(String[] args) {
        for (int numeros = 1; numeros <=100; numeros++){
            if (numeros % 7==0){
                System.out.printf("el numero %d es multiplo de 7 %n", numeros);
            } if (numeros % 13==0){
                System.out.printf("el numero %d es multiplo de 13 %n", numeros);
            }
        }
    }
}
