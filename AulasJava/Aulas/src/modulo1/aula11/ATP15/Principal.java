package modulo1.aula11.ATP15;

public class Principal {
    public static void main(String[] args) {
        Pessoa novaPessoa1 = new Pessoa();
        novaPessoa1.nome = "Cintia";
        novaPessoa1.sobrenome = "Belém";
        novaPessoa1.idade = 29;

        Pessoa novaPessoa2 = new Pessoa();
        novaPessoa2.nome = "Valter";
        novaPessoa2.sobrenome = "Hugo Mãe";
        novaPessoa2.idade = 35;

        novaPessoa1.imprimirPessoa();
        novaPessoa2.imprimirPessoa();

        // System.out.printf("nome: %s %s \nidade: %d", novaPessoa1.nome ,
        // novaPessoa1.sobrenome, novaPessoa1.idade);

        /*
         * System.out.println(novaPessoa1.idade + " anos");
         * System.out.println(novaPessoa2.nome);
         * System.out.println(novaPessoa2.sobrenome);
         * System.out.println(novaPessoa2.idade + " anos");
         */
    }

   

}
