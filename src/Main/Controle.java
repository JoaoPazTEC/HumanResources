package Main;

import Classes.Assalariado;
import Classes.Horista;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controle {

    public static void InsereAssalariado(ArrayList empresa) {

        String nome = JOptionPane.showInputDialog("Digite o nome do funcionario:");
        String endereco = JOptionPane.showInputDialog("Digite o endereco do funcionario:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do funcionario:");
        int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do funcionario:"));
        char setor = JOptionPane.showInputDialog("Digite o caractere do setor do funcionario:").charAt(0);
        int aumento = Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem de aumento do funcionário:"));

        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário do funcionário:"));

        try {
            empresa.add(new Assalariado(salario, nome, endereco, telefone, cpf, setor, aumento));
            System.out.println("Cadastro ok");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void InsereHorista(ArrayList empresa) {

        String nome = JOptionPane.showInputDialog("Digite o nome do funcionario:");
        String endereco = JOptionPane.showInputDialog("Digite o endereco do funcionario:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do funcionario:");
        int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do funcionario:"));
        char setor = JOptionPane.showInputDialog("Digite o caractere do setor do funcionario:").charAt(0);
        int aumento = Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem de aumento do funcionário:"));

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora do funcionário:"));

        try {
            empresa.add(new Horista(horas, valorHora, nome, endereco, telefone, cpf, setor, aumento));
            System.out.println("Cadastro ok");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Lista(ArrayList empresa) {
        int cont;
        String msg = "Funcionários cadastrados:\n_________________________________\n";

        for (cont = 0; cont < empresa.size(); cont++) {

            if (empresa.get(cont) instanceof Assalariado) {
                Assalariado modelo = new Assalariado();
                modelo = (Assalariado) empresa.get(cont);

                float valorAumento = modelo.getAumento() / 100 * modelo.getSalario();
                float salarioReal = modelo.getSalario() + valorAumento;

                msg += "ID: " + cont
                        + "\nTipo: assalariado"
                        + "\nNome: " + modelo.getNome()
                        + "\nEndereco: " + modelo.getEndereco()
                        + "\nTelefone: " + modelo.getTelefone()
                        + "\nCPF: " + modelo.getCpf()
                        + "\nSalário estimado: R$" + modelo.getSalario()
                        + "\nAumento: " + modelo.getAumento() + "%"
                        + "\nSalário real: R$" + CalculaSalario(modelo.getSalario(), modelo.getAumento())
                        + "\n_________________________________\n";

            } else {

                Horista modelo = new Horista();
                modelo = (Horista) empresa.get(cont);

                float salarioEstimado = modelo.getHoras() * modelo.getValorHora();

                msg += "ID: " + cont
                        + "\nTipo: horista"
                        + "\nNome: " + modelo.getNome()
                        + "\nEndereco: " + modelo.getEndereco()
                        + "\nTelefone: " + modelo.getTelefone()
                        + "\nCPF: " + modelo.getCpf()
                        + "\nHoras trabalhadas: " + modelo.getHoras()
                        + "\nValor da hora: R$" + modelo.getValorHora()
                        + "\nAumento: " + modelo.getAumento() + "%"
                        + "\nSalário real: R$" + CalculaSalario(salarioEstimado, modelo.getAumento())
                        + "\n_________________________________\n";

            }
        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void Altera(ArrayList empresa) {
        int cont;
        int id;

        id = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da lista a editar:"));

        if (empresa.get(id) instanceof Assalariado) {

            Assalariado modelo = new Assalariado();
            modelo = (Assalariado) empresa.get(id);

            String nome = JOptionPane.showInputDialog("Digite o nome do funcionario:", modelo.getNome());
            String endereco = JOptionPane.showInputDialog("Digite o endereco do funcionario:", modelo.getEndereco());
            String telefone = JOptionPane.showInputDialog("Digite o telefone do funcionario:", modelo.getTelefone());
            int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do funcionario:", modelo.getCpf()));
            char setor = JOptionPane.showInputDialog("Digite o caractere do setor do funcionario:", modelo.getSetor()).charAt(0);
            int aumento = Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem de aumento do funcionário:", modelo.getAumento()));

            float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário do funcionário:", modelo.getSalario()));

            try {
                Assalariado atualizado = new Assalariado(salario, nome, endereco, telefone, cpf, setor, aumento);
                empresa.set(id, atualizado);
                System.out.println("Edicao ok");
            } catch (Exception e) {
                System.out.println(e);
            }

        } else {

            Horista modelo = new Horista();
            modelo = (Horista) empresa.get(id);

            String nome = JOptionPane.showInputDialog("Digite o nome do funcionario:", modelo.getNome());
            String endereco = JOptionPane.showInputDialog("Digite o endereco do funcionario:", modelo.getEndereco());
            String telefone = JOptionPane.showInputDialog("Digite o telefone do funcionario:", modelo.getTelefone());
            int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do funcionario:", modelo.getCpf()));
            char setor = JOptionPane.showInputDialog("Digite o caractere do setor do funcionario:", modelo.getSetor()).charAt(0);
            int aumento = Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem de aumento do funcionário:", modelo.getAumento()));

            int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:", modelo.getHoras()));
            float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora do funcionário:", modelo.getValorHora()));

            try {
                Horista atualizado = new Horista(horas, valorHora, nome, endereco, telefone, cpf, setor, aumento);
                empresa.set(id, atualizado);
                System.out.println("Edicao ok");
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void Exclui(ArrayList empresa) {
        int cont;
        int id;

        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id que deseja excluir: "));

        try {
            empresa.remove(id);
            System.out.println("Exclusão ok.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static float CalculaSalario(float salarioEstimado, float aumento) {
        float valorAumento = aumento / 100 * salarioEstimado;
        float salarioReal = salarioEstimado + valorAumento;

        return salarioReal;
    }

    public static void TestaTamanho(ArrayList empresa, int code){
        int tamanho = empresa.size();
        if(tamanho >= 10){
            JOptionPane.showMessageDialog(null, "Limite de 10 cadastros atingido!!!");
        }else{
            if(code == 1)InsereAssalariado(empresa);
            if(code == 2)InsereHorista(empresa);
        }
    }
}
