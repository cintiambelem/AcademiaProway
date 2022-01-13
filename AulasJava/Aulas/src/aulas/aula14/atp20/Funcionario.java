package modulo1.aula14.atp20;

public class Funcionario extends Pessoa {
    private double salario;
    private String depto;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }
}
