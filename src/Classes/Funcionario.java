package Classes;

public abstract class Funcionario {
    String nome;
    String endereco;
    String telefone;
    int cpf;
    char setor;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String telefone, int cpf, char setor) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public char getSetor() {
        return setor;
    }

    public void setSetor(char setor) {
        this.setor = setor;
    }
    
    
}
