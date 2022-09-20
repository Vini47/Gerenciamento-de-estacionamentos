package View;

import Controller.Main;
import Model.Aluno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class TelaPrincipal {

    public TelaPrincipal() {
        JFrame jFrame = new JFrame("Controle de Alunos");
        jFrame.setVisible(true);
        jFrame.setSize(800, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);

        JButton button1 = new JButton("Cadastrar Aluno");
        button1.setBounds(300, 100, 200, 40);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        button1.setForeground(new Color(10, 10, 10));
        button1.setBackground(new Color(105, 231, 92));
        jFrame.add(button1);

        JButton button2 = new JButton("Listar Alunos");
        button2.setBounds(300, 150, 200, 40);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        button2.setForeground(new Color(10, 10, 10));
        button2.setBackground(new Color(105, 231, 92));
        jFrame.add(button2);

        JButton button3 = new JButton("Pesquisar Aluno");
        button3.setBounds(300, 200, 200, 40);
        button3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        button3.setForeground(new Color(10, 10, 10));
        button3.setBackground(new Color(105, 231, 92));
        jFrame.add(button3);

        JButton button4 = new JButton("Editar Aluno");
        button4.setBounds(300, 250, 200, 40);
        button4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        button4.setForeground(new Color(10, 10, 10));
        button4.setBackground(new Color(105, 231, 92));
        jFrame.add(button4);

        JButton button5 = new JButton("Sair");
        button5.setBounds(300, 300, 200, 40);
        button5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        button5.setForeground(new Color(10, 10, 10));
        button5.setBackground(new Color(105, 231, 92));
        jFrame.add(button5);

//        JPanel menu = new JPanel();
//        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
//        menu.setBounds(0,800, 200, 200 );
//        jFrame.add(menu);

        button1.addActionListener(this::cadastrarAluno);
        button2.addActionListener(this::listarAlunos);
        button3.addActionListener(this::pesquisaAluno);
        button4.addActionListener(this::editarAluno);

    }

    private void cadastrarAluno(ActionEvent actionEvent) {
        new CadastrarAluno();
    }

    private void listarAlunos(ActionEvent actionEvent) {
        new ListarAlunos();
    }

    private void pesquisaAluno(ActionEvent actionEvent) {
        new PesquisarAluno();
    }

    private void editarAluno(ActionEvent actionEvent) {
        new EditarAluno();
    }


}
