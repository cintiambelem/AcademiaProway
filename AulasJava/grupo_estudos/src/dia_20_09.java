//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
// um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;

public class dia_20_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Insira um número: ");
        numero = sc.nextInt();

        while (numero > 1000 || numero < 0) {
            System.out.print("Numero invalido. Insira um numero: ");
            numero = sc.nextInt();
        }
        for (int i = 0; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}