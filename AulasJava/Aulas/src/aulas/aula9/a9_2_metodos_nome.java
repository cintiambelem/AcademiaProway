package modulo1.aula9;

public class a9_2_metodos_nome {
    public static void main(String[] args) {
        //chamando o método imprimir_nome e passando 2 argumentos do tipo string
        imprimir_nome("Cintia", "Belem");

    }//metodo imprimir nome = recebe 2 metodos string e tem retorno void
    static void imprimir_nome(String nome, String sobrenome){
        System.out.printf("%s %s", nome, sobrenome);
    }
}
