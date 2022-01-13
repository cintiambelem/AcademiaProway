package modulo1.aula12.atp18;

public class TelaPrincipalLoja {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        // atribuindo valor ao atributo codigo e imprimindo
        p1.setCodigo(548);
        System.out.println(p1.getCodigo());

        // atribuindo valor ao atributo nome e imprimindo
        p1.setNome("Geladeira");
        System.out.println(p1.getNome());

        // atribuindo valor ao atributo valor e imprimindo
        p1.setValor(1099.99);
        System.out.println(p1.getValor());

        // atribuindo valor ao atributo descricao e imprimindo
        p1.setDescricao("Inox 260 litros");
        System.out.println(p1.getDescricao());

    }

}
