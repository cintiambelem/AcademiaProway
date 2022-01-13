package modulo1.aula11;

public class Principal {
    public static void main(String[] args) {
        int numero = -10;

        //criando instância de classe produto (objeto)
        Produto produto1 = new Produto();
        produto1.nome = "TV";
        produto1.descricao = "Tv da xuxa";
        produto1.valor = 99.98;

        Produto produto2 = new Produto();
        produto2.nome = "Smartphone";
        produto2.descricao = "telefone caro";
        produto2.valor = 12000;

        System.out.println(numero);
        System.out.println(produto1.nome);
        System.out.println(produto2.nome);



        
    }
    
}
