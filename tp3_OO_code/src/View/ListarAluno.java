package View;

import Controller.Main;
import Model.Aluno;

import javax.swing.*;

public class ListarAluno {

    public ListarAluno() {

        JOptionPane.showMessageDialog(null, Main.imprimirAluno(Aluno.getAlunos()));
    }


}
