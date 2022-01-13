package modulo1.aula14.atp20;

public class Universidade {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();

        func.setNome("Katia");
        func.setSobrenome("Souza");
        func.setMatricula(5685);
        func.setSalario(3500);
        func.setDepto("Design");

        Coordenador coord = new Coordenador();
        coord.setNome("Bianca");
        coord.setSobrenome("Vieira");
        coord.setDepto("Comunicação Social");
        coord.setSalario(5000);
        coord.setCurso_coordenado("Publicidade e Propaganda");
        coord.setMatricula(8596);
        coord.setBonus(600);

        Aluno alu = new Aluno();
        alu.setCurso("Design");
        alu.setMatricula(1152487);
        alu.setSobrenome("Santos");
        alu.setNome("Fatima");
        alu.setTurma("16D");

        /// impressões ////

        System.out.printf("Nome completo do aluno: %s %s\n", alu.getNome(), alu.getSobrenome());
        System.out.printf("Matrícula do aluno: %d\n", alu.getMatricula());
        System.out.printf("Turma do aluno: %s\n", alu.getTurma());
        System.out.printf("Curso do aluno: %s\n=======\n", alu.getCurso());

        System.out.printf(
                "Nome completo do coordenador: %s %s \nCurso do coordenador: %s\nSalario: %.2f\nBonus: %.2f \nMatricula: %d \n=======\n",
                coord.getNome(), coord.getSobrenome(), coord.getCurso_coordenado(), coord.getSalario(),
                coord.getBonus(), coord.getMatricula());

        System.out.printf("Nome completo do funcionário: %s %s\n", func.getNome(), func.getSobrenome());
        System.out.printf("Matrícula do funcionário: %d\n", func.getMatricula());
        System.out.printf("Salário do funcionário: %.2f\n", func.getSalario());
        System.out.printf("Dpto do funcionário: %s\n ======= \n", func.getDepto());

    }

}
