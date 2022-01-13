package modulo1.aula7;
/* _ Calcule o retorno total de um investimento de R$ 5.000,00
// durante 24 meses a uma taxa de juros de 2% ao mês.
 Utilize o laço FOR para imprimir o valor do retorno mês a mês. */

public class a7_exercício_investimento {
    public static void main(String[] args) {
        int investimento = 5000;
        double juros = 0.02, resultadoMes;
        int prazo = 24;

        for (int i = 1; i <= prazo; i++) {
           // resultadoMes = investimento * juros;
            investimento += investimento * juros;

            System.out.printf("mês: %d === valor: %d \n", i, investimento);
        }
    }
}
