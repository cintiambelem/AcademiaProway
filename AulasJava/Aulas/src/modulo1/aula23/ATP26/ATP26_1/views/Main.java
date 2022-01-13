package ATP26.views;

import ATP26.controllers.PessoaController;
import ATP26.models.Aluno;
import ATP26.models.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno alu1 = new Aluno();
        PessoaController dado = new PessoaController();

        p1.idade = 35;
        p1.nome = "Clarice";
        p1.sobrenome = "Linspector";
        dado.add(p1);

        alu1.nome = "Mario";
        alu1.sobrenome = "Quintana";
        alu1.idade = 96;
        alu1.curso = "Letras";
        alu1.matricula = 1152487;
        alu1.turma = "5D";
        dado.add(alu1);
        // System.out.println(alu1);

        Pessoa p2 = new Pessoa();
        p2.idade = 35;
        p2.nome = "Clarice";
        p2.sobrenome = "Linspector";
        dado.add(p2);

        Pessoa p3 = new Pessoa();
        p3.idade = 58;
        p3.nome = "Gabriel";
        p3.sobrenome = "Marquez";
        dado.add(p3);

        //System.out.println(p1.equals(p2));

        System.out.println("numero de registros: " + dado.size());

         dado.remove(p1);

         System.out.println("numero de registros: " + dado.size());

    }

}
