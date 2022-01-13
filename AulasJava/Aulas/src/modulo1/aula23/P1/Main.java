package P1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[10]; // array de 10 posições

        ArrayList<Double> numeros3 = new ArrayList<Double>(); // array sem numero limite de posições4
        Object[] dados = new Object[10]; // criando uma lista de objetos da classe objeto - essa classe aceita qualquer objeto de qualquer classe

        Pessoa p1 = new Pessoa();
        p1.nome = "Jojo";
        p1.sobrenome = "Toddynho";

        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Kombi";

        Dados dado = new Dados();

        /*
         * dado.add(p1); dado.add(c1); dado.add(p1); dado.add(c1); dado.add(p1);
         * dado.add(c1); dado.add(p1);
         */

        dados[0] = p1; // salvando os atributos de pessoa na lista objeto na posiçao 0
        dados[1] = c1; // salvando os atributos de carro na lista objeto na posicao 1
        dados[2] = p1;
        dados[3] = c1;
        // dados[4] = p1;
        // dados[5] = c1;

        System.out.println(dados[0]);
        System.out.println(dado.add(c1));
        System.out.println(dado.add(p1));
        System.out.println(dado.add(c1));
        System.out.println(dado.add(p1));
        System.out.println(p1);
        // System.out.println(dado.add(c1));
        // System.out.println(dado.add(p1));

    }
}
