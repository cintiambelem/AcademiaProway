package ATP26.models;

public class Aluno extends Pessoa {
    public int matricula;
    public String turma, curso;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno);

        Aluno aluno1 = (Aluno) obj;

        if (this.curso.equals(aluno1.curso) && this.matricula == (aluno1.matricula)
                && this.turma.equals(aluno1.turma) && super.equals(aluno1)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String mensagem = "Matrícula: " + this.matricula + "\n" + "Turma: " + turma + "\n" + "Curso: " + curso + "\n";
        return super.toString() + "\n" + mensagem;
    }

}
