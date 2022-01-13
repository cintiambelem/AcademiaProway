import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class exercicio1 {

    public static boolean Primo(int numero){
        boolean ePrimo = true;
        for(int n =2 ;n<numero ; n++){
            if(numero % n == 0){
                ePrimo = false;
            }
        }
        return ePrimo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;


        do{
            System.out.println("Escolha uma opção:\n 1 - Números pares \n 2 - Números ìmpares \n 3 - Números Primos \n 4 - Investimento \n 5 - Sair");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Cálculo de números pares");
                    int numero = 0;
                    do {
                        System.out.print("Informe um número: ");
                        numero = scanner.nextInt();
                        if (numero < 0){
                            System.out.println("Número informado é inválido.");
                        }
                    }while (numero < 0);
                    System.out.println("Números pares de 0 à " + numero);
                    for (int i = 0; i <= numero; i++){
                        if (i % 2 == 0){
                            System.out.println(i);
                        }
                    }
                    break;
                case 2:
                   int numero1;
                    do{
                        System.out.println("Informe o número: ");
                        numero1 = scanner.nextInt();
                        if(numero1 <= 0){
                            System.out.println("Erro! Número inválido! Tente novamente.");
                        }else
                        {
                            for (int i = 0; i <= numero1; i++){
                                if(i % 2 == 1){
                                    System.out.print(i + "\t\n" );
                                }
                            }

                        }
                    }while (numero1 <=0);

                    break;
                case 3:
                    //numeros primos
                    boolean   validaNumero  = false;
                    do{

                        System.out.println("Digite um numero: ");
                        numero = scanner.nextInt();
                        if(numero < 0){
                            System.out.println("O número não pode ser negativo tente novamente");

                        }else{
                            validaNumero = true;
                            for(int n=2; n<=numero; n++){
                                if(Primo(n)){
                                    System.out.printf("%d ",n);


                                }

                            }
                        }

                    }while (!validaNumero);
                    break;
                case 4:
                    System.out.println("Juros compostos");
                    System.out.println("Digite o valor do investimento: ");
                    double investimento = scanner.nextDouble();
                    System.out.println("Digite o período do investimento: ");
                    int periodo = scanner.nextInt();
                    System.out.println("Digite a taxa de juros mensal (%): ");
                    double juros = scanner.nextDouble();

                    for (int i = 1; i <= periodo; i++) {
                        investimento += investimento * (juros/100);
                        System.out.printf("mês %d: valor do montante  %.2f \n", i, investimento);
                    }
                    break;
                case 5:
                    System.out.println("Aplicação finalizada com sucesso! :)");
                    break;

                default:
                    System.out.println("______Opção inválida______");
                    System.out.println("Digite novamente");

            }
        }while (opcao <=0 || opcao > 5);
    }
}
