package modulo1.aula1;

import java.util.Scanner;

public class exercício_cintia_10_09 {
    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite a sua idade: ");
        int idade = sc.nextInt();

        int hoje = 2021;
        int resultado = hoje - idade;

        System.out.print("voce nasceu no ano: " + resultado);
    }
}
