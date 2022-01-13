package modulo1.aula5;

import java.util.Scanner;

public class a5_1_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        if(nome.length()<5){ //.lenght conta o numero de caracteres da variável
            System.out.println("O nome deve ter mais de 5 caracteres");

        }

    }
}
