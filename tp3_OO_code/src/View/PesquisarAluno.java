package View;

import javax.swing.*;
import java.awt.*;

public class PesquisarAluno {

    public PesquisarAluno() {

        JFrame pesquisar_aluno = new JFrame("Pesquisar Aluno");
        pesquisar_aluno.setVisible(true);
        pesquisar_aluno.setSize(800, 600);
        pesquisar_aluno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pesquisar_aluno.setLocationRelativeTo(null);
        pesquisar_aluno.setLayout(null);

        JLabel nome = new JLabel("Nome do aluno:");
        nome.setVisible(true);
        nome.setBounds(0, 100, 200, 40);
        nome.setFont(new Font("Times New Roman", Font.BOLD, 25));
        pesquisar_aluno.add(nome);
        JTextField stringNome = new JTextField();
        stringNome.setBounds(170, 103, 300, 30);
        stringNome.setFont(new Font("Times New Roman", Font.BOLD, 18));
        pesquisar_aluno.add(stringNome);
    }

}
