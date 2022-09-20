package View;

import Model.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class ListarAlunos {

    static int intMenu = 0;
    public ListarAlunos() {

        JFrame listar_aluno = new JFrame("Listar Aluno");
        listar_aluno.setVisible(true);
        listar_aluno.setSize(800, 600);
        listar_aluno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listar_aluno.setLocationRelativeTo(null);
        listar_aluno.setLayout(null);
        intMenu = 2;


    }

    public static int getIntMenu() {
        return intMenu;
    }
}
