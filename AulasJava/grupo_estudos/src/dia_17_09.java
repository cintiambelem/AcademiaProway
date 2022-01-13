import java.util.Scanner;

public class dia_17_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        boolean invalido = true;
        double salario = 0.0;
        double aumentoSalario = 0.0;
        String cargo = "";
        String percAumento = "";

        System.out.print(" \n 1 - Serviços gerais \n 2 - Vigia \n 3 - Recepcionista \n 4 - Vendedor " +
                "\nDigite o código do seu cargo: ");
        opcao = sc.nextInt();

        while (opcao > 4 || opcao ==0 ){
            System.out.print("Opcao incorreta. \n Digite novamente: ");
            opcao = sc.nextInt();
        }

      /*  do{
            invalido = true;
            if(opcao > 4 || opcao == 0){
                System.out.print("Opcao incorreta. \n Digite novamente: ");
                opcao = sc.nextInt();
            }else{
                invalido = false;
            }
        }while (invalido);
        invalido = false;*/
        switch (opcao) {
            case 1:
                percAumento = "50%";
                cargo = "Profissional de serviços gerais";
                System.out.print("Insira seu salário: ");
                salario = sc.nextDouble();

                while (salario <= 0) {
                    System.out.print("Salário inválido. \nInsira um salário maior que zero: ");
                    salario = sc.nextDouble();
                }
                aumentoSalario = salario * 0.5;
                salario *= 1.5;
                break;
            case 2:
                percAumento = "30%";
                cargo = "Vigia";
                System.out.print("Insira seu salário: ");
                salario = sc.nextDouble();
                while (salario <= 0) {
                    System.out.print("Salário inválido. \nInsira um salário maior que zero: ");
                    salario = sc.nextDouble();
                }
                aumentoSalario = salario * 0.3;
                salario *= 1.30;
                break;

            case 3:
                percAumento = "25%";
                cargo = "Recepcionista";
                System.out.print("Insira seu salário: ");
                salario = sc.nextDouble();
                while (salario <= 0) {
                    System.out.print("Salário inválido. \nInsira um salário maior que zero: ");
                    salario = sc.nextDouble();
                }
                aumentoSalario = salario * 0.25;
                salario *= 1.15;
                break;

            case 4:
                percAumento = "25%";
                cargo = "Vendedor";
                System.out.print("Insira seu salário: ");
                salario = sc.nextDouble();
                while (salario <= 0) {
                    System.out.print("Salário inválido. \nInsira um salário maior que zero: ");
                    salario = sc.nextDouble();
                }
                aumentoSalario = salario * 0.25;
                salario *= 1.15;
                break;
        }
        System.out.println("\n");
        System.out.printf("Cargo                 ==   %s \n", cargo);
        System.out.printf("Percentual de aumento ==   %s \n", percAumento);
        System.out.printf("Aumento               ==   %.2f \n", aumentoSalario);
        System.out.printf("Novo salário          ==   %.2f \n", salario);
    }

}
