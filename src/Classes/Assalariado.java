package Classes;

public class Assalariado extends Funcionario{
    float salario;

    public Assalariado(float salario) {
        this.salario = salario;
    }

    public Assalariado(float salario, String nome, String endereco, String telefone, int cpf, char setor) {
        super(nome, endereco, telefone, cpf, setor);
        this.salario = salario;
    }

    public Assalariado() {
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
