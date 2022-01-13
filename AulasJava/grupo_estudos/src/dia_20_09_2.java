//Leia um valor inteiro N.
// Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20]
// e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).


import java.util.Scanner;

public class dia_20_09_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leitura = 0;
        int contador1;
        int contador2 = 0;

        System.out.println("Insira o numero de leituras: ");
        leitura = sc.nextInt();
        sc.nextLine();

        for (contador1 = 0; contador1 < leitura; contador1++) {
            System.out.printf("Insira o numero %d: \n", contador1);
            int numero = sc.nextInt();
            if (numero >= 10 && numero <= 20){
                contador2++;
            }
        }
        System.out.printf("in: %d ", contador2, "\n");
        System.out.println("o número fora do intervalo é: " + (leitura - contador2));
    }
}

