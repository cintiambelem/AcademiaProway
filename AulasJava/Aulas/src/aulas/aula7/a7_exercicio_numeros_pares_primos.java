package modulo1.aula7;

public class a7_exercicio_numeros_pares_primos {
    public static void main(String[] args) {

        int numPrimo;

//numeros pares de 0 a 100:
        System.out.println("Numeros pares de 0-100:");

        for (int iPar = 1; iPar <= 100; iPar++) {
            if (iPar % 2 == 0) {
                System.out.printf("os numeros pares são: %d \n \n", iPar);
            }
        }
//numeros primos de 0 a 150:

        System.out.println("Numeros primos 1-150: ");
   //     boolean isPrimo = true;

        for (int i = 0; i <= 150; i++) {
            boolean isPrimo = true; // booleano: numero primo é verdadeiro

            if(i == 1 || i == 0){
                isPrimo = false; // se o numero é 1 ou 0,  primo é falso
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimo = false; // se o resto da divisão do numero j por i por = 0, ele nao é primo, então é false
                }
            }
            if (isPrimo) { // imprimir os numeros primos após a verificação
                System.out.println(i);
            }
        }
    }
}
