package view;

import java.text.NumberFormat;
import java.util.Scanner;

import models.Calculadora;

public class Main extends Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("======Calculadora======");

        menu();
        lerNumero();
        operacao();

    }

    // métodos

    public static void operacao() {
        int n1 = 0;
        int n2 = 0;
        Calculadora calc = new Calculadora();
        int op = 0;

        switch (op) {
        case 1:

            System.out.println("insira o primeiro número:");
            n1 = Integer.parseInt(sc.nextLine());
            System.out.println("insira o segundo número:");
            n2 = Integer.parseInt(sc.nextLine());

            int resultado = calc.soma(n1, n2);

            System.out.printf("Resultado: %d \n", resultado);

            break;

        case 2:
            System.out.println("insira o primeiro número:");
            n1 = Integer.parseInt(sc.nextLine());
            System.out.println("insira o segundo número:");
            n2 = Integer.parseInt(sc.nextLine());

            int sub = calc.sub(n1, n2);
            System.out.printf("Resultado: %d \n", sub);
            break;

        case 3:

            System.out.println("insira o primeiro número:");
            n1 = Integer.parseInt(sc.nextLine());
            System.out.println("insira o segundo número:");
            n2 = Integer.parseInt(sc.nextLine());
            if (n2 == 0) {
                throw new IllegalArgumentException("não pode ser 0");
            }
            int div = calc.div(n1, n2);
            System.out.printf("Resultado: %d \n", div);
            break;

        case 4:
            System.out.println("insira o primeiro número:");
            n1 = Integer.parseInt(sc.nextLine());
            System.out.println("insira o segundo número:");
            n2 = Integer.parseInt(sc.nextLine());

            int mult = calc.mult(n1, n2);
            System.out.printf("Resultado: %d \n", mult);
            break;

        default:
            break;

        }

    }

    public static int menu() {

        System.out.println("1 - Soma\n2 - Subtração\n3 - Divisão \n4 - Multiplicação\nEscolha uma opção:");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    static int lerNumero() {
        boolean valido = true;
        int numero = 0;
        do {
           
            try {
                valido = true;

                if (numero > 4 || numero < 0) {
                    valido = false;
                    t   
                }
            } catch (NumberFormatException exception) {
                System.out.println("Opção invalida");
            }
        } while (!valido);
        return numero;

    }
}
