package src.ATP_R03;

public class Main {

    public static void main(String[] args) {

        Livro l = new Livro();

        l.autor = "Garcia Marquez";
        l.codigo = 6429;
        l.numPaginas = 445;
        l.titulo = "Cem anos de solidão";

        System.out.println(l.autor);
        System.out.println(l.codigo);
        System.out.println(l.numPaginas);
        System.out.println(l.titulo);

        
    }

}
