//Prcedimentos, funções e métodos
//metodo = nome_do_metodo(){}
//void método = metodo não retorna nada
// principio dos metodos = deve fazer apenas 1 unica ação

package modulo1.aula9;

public class a9_1_metodos {

    public static void main(String[] args) {
        cabecalho();
        int r = soma(4,7); //a variável r está recebendo o valor da variável "resultado" produzido na função soma
        System.out.print(r);
    }

    static void cabecalho(){
        System.out.println("\n===========Calculadora===========\n");
    }
    static int soma(int num1 , int num2){ // o INT na função significa que irá retornar um valor inteiro.
        int resultado = num1 + num2;
        return resultado; // a variável resultado nao será utilizada fora da função. caso queira o conteúdo dela, terá que criar uma nova variavel fora para receber o valor
    }
}
