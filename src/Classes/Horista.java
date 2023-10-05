package Classes;

public class Horista extends Funcionario{
    int horas;
    float valorHora;

    public Horista(int horas, float valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public Horista(int horas, float valorHora, String nome, String endereco, String telefone, int cpf, char setor, float aumento) {
        super(nome, endereco, telefone, cpf, setor, aumento);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public Horista() {
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}
