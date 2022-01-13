//_ Construa os metodos de soma, subtração, multiplicação e divisão. Todos os métodos devem receber dois parâmetros double realizar a operação e retornar o valor do cálculo.

public class at14 {
    public static void main(String[] args) {

    }

    static double somar(double n1, double n2) {
        double resultado_soma = n1 + n2;
        return resultado_soma;
    }

    static double subtrair(double n1, double n2) {
        double resultado_subt = n1 - n2;
        return resultado_subt;
    }

    static double multiplicar(double n1, double n2) {
        double resultado_mult = n1 * n2;
        return resultado_mult;
    }

    static double dividir(double n1, double n2) {
        double resultado_div = n1 / n2;
        return resultado_div;
    }

    static boolean valida_opcao(int opcao) {
        if (opcao > 4 || opcao < 1){
            System.out.println("Opção inválida. Selecione uma opção valida: ");
        return false;
    }else{
        return true;
    }

}
}
