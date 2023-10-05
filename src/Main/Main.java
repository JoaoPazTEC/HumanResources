package Main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int code;
        ArrayList empresa = new ArrayList();

        do {
            code = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n0 - Sair \n1 - Registrar assalariado"
                    + "\n2 - Registrar horista \n3 - Listar \n4 - Alterar \n5 - Excluir"));

            switch (code) {

                case 1 -> {
                    Controle.InsereAssalariado(empresa);
                }

                case 2 -> {
                    Controle.InsereHorista(empresa);
                }

                case 3 -> {
                    Controle.Lista(empresa);
                }

                case 4 -> {
                    Controle.Altera(empresa);
                }

                case 5 -> {
                    Controle.Exclui(empresa);
                }
            }
        } while (code != 0);
    }

}
