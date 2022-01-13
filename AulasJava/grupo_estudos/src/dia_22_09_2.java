import java.util.Scanner;

// Faça um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, se for ‘P’,
// calcula e escreve a sua média ponderada (pesos: 5, 3 e 2).
// Faça um programa que leia 3 notas de N alunos e acione o procedimento para cada aluno. 
//(N deve ser lido do teclado)

public class dia_22_09_2 {
    static Scanner sc = new Scanner(System.in);
    static double nota1, nota2, nota3;

    public static void main(String[] args) {

        boolean valido;
        double nota = 0;
        do {
            nota1 = pedeNotas("Nota 1 (0 - 10): ");
            valido = validaNota(nota);
            nota2 = pedeNotas("Nota 2 (0 - 10): ");
            valido = validaNota(nota);
            nota3 = pedeNotas("Nota 3 (0 - 10): ");
            valido = validaNota(nota);
            if (!valido) {
                System.out.println("invalido");
            }
        } while (!valido);

        letraNota();

        sc.close();

    }

    // procedimento de nota

    static String pedeLetraNota() {
        System.out.printf("\nA para Aritmética\nP para Ponderada. \nEscolha a média das notas: ");
        String letra = sc.nextLine().toUpperCase();
        return letra;
    }

    static void letraNota() {
        String letraDaNota = pedeLetraNota();
        double resultado;

        switch (letraDaNota) {
            case "A":
                resultado = imprimeMediaA(nota1, nota2, nota3);
                break;

            case "P":
                resultado = imprimeMediaP(nota1, nota2, nota3);
                break;

            default:
                System.out.println("Invalido.");
                break;
        }
    }

    // metodo de pedir nota

    static double pedeNotas(String mensagem) {
        double nota;
        System.out.printf(mensagem);
        do {
            nota = Double.parseDouble(sc.nextLine());
        } while (!validaNota(nota));
        return nota;
    }

    // medodo valida nota

    static boolean validaNota(double nota) {
        if (nota > 10 || nota < 0) {
            System.out.print("Nota invalida. Insira uma nota válida: ");
            return false;
        } else {
            return true;
        }
    }

    // calculo de médias

    static double calculaMediaA(double n1, double n2, double n3) {
        double resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }

    static double calculaMediaP(double n1, double n2, double n3) {
        double resultado = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 3;
        return resultado;
    }

    static double imprimeMediaA(double n1, double n2, double n3) {
        double resultado = calculaMediaA(nota1, nota2, nota3);
        System.out.printf("A média aritmética é: %.2f", resultado);
        return resultado;
    }

    static double imprimeMediaP(double n1, double n2, double n3) {
        double resultado = calculaMediaP(nota1, nota2, nota3);
        System.out.printf("A média ponderada é: %.2f", resultado);
        return resultado;
    }

}
