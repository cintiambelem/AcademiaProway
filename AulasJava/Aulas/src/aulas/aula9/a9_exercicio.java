package modulo1.aula9;

import java.util.Scanner;

public class a9_exercicio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double r;

       /* System.out.print("Insira o numero 1: ");
        double numero1 = sc.nextDouble();

        System.out.print("Insira o numero 2: ");
        double numero2 = sc.nextDouble();*/

        //====== usando a função pedirNumero ======
        double numero1 = pedirNumero();
        double numero2 = pedirNumero();

        r = soma(numero1, numero2);
        System.out.printf("%.2f + %.2f = %.2f \n", numero1, numero2, r);

        r = subt(numero1, numero2);
        System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, r);

        r = multiplicacao(numero1, numero2);
        System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, r);

        r = divisao(numero1, numero2);
        System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, r);

    }

    // ==== função soma =====
    static double soma(double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }

    // ==== função subtração ====
    static double subt (double num1, double num2){
        double resultado = num1 - num2;
        return resultado;
    }

    // ==== função multiplicação ====
    static double multiplicacao (double num1, double num2){
        double resultado = num1*num2;
        return resultado;
    }
    // ==== função divisão ====
    static double divisao (double num1, double num2){
        double resultado = num1/num2;
        return resultado;
    }

    // ==== função pedir número ====
    static double pedirNumero() {
        System.out.print("Insira o numero : ");
        double numero = sc.nextDouble();
        return numero;
    }
}

