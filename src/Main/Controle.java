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
        int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o endereco do funcionario:"));
        char setor = JOptionPane.showInputDialog("Digite o caractere do setor do funcionario:").charAt(0);

        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário do funcionário:"));

        try {
            empresa.add(new Assalariado(salario, nome, endereco, telefone, cpf, setor));
            System.out.println("Cadastro ok");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void InsereHorista(ArrayList empresa) {

        String nome = JOptionPane.showInputDialog("Digite o nome do funcionario:");
        String endereco = JOptionPane.showInputDialog("Digite o endereco do funcionario:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do funcionario:");
        int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o endereco do funcionario:"));
        char setor = JOptionPane.showInputDialog("Digite o caractere do setor do funcionario:").charAt(0);

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora do funcionário:"));

        try {
            empresa.add(new Horista(horas, valorHora, nome, endereco, telefone, cpf, setor));
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

                msg += "Tipo: assalariado"
                        + "\nNome: " + modelo.getNome()
                        + "\nEndereco: " + modelo.getEndereco()
                        + "\nTelefone: " + modelo.getTelefone()
                        + "\nCPF: " + modelo.getCpf()
                        + "\nSalário: " + modelo.getSalario()
                        + "\n_________________________________\n";

            } else {

                Horista modelo = new Horista();

                msg += "Tipo: horista"
                        + "\nNome: " + modelo.getNome()
                        + "\nEndereco: " + modelo.getEndereco()
                        + "\nTelefone: " + modelo.getTelefone()
                        + "\nCPF: " + modelo.getCpf()
                        + "\nHoras trabalhadas: " + modelo.getHoras()
                        + "\nValor da hora: " + modelo.getValorHora()
                        + "\n_________________________________\n";

            }
        }
    }

    public static void Altera(ArrayList empresa) {
        int cont;
        int id;

        id = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da lista a editar:"));

        if (empresa.get(id) instanceof Assalariado) {
        }
    }

    public static void Exclui(ArrayList empresa) {

    }

}
