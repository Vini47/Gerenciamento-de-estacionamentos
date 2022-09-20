package View;

import Controller.Main;
import Model.Aluno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastrarAluno {

        static int intMenu = 0;
        static JTextField stringNome;
        static JTextField stringCurso;
        static JTextField stringMatricula;
        static JTextField stringEmail;

        public CadastrarAluno() {

                JFrame cadastrar_aluno = new JFrame("Cadastrar Aluno");
                cadastrar_aluno.setVisible(true);
                cadastrar_aluno.setSize(800, 600);
                cadastrar_aluno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cadastrar_aluno.setLocationRelativeTo(null);
                cadastrar_aluno.setLayout(null);

                JLabel titulo = new JLabel("INSIRA OS DADOS DOS ALUNOS");
                titulo.setVisible(true);
                titulo.setBounds(200, 25, 500, 40);
                titulo.setFont(new Font("Times New Roman", Font.BOLD, 26));
                cadastrar_aluno.add(titulo);


                //Adicionar nome
                JLabel nome = new JLabel("Nome do aluno:");
                nome.setVisible(true);
                nome.setBounds(0, 100, 200, 40);
                nome.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(nome);
                stringNome = new JTextField();
                stringNome.setBounds(170, 103, 300, 30);
                stringNome.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringNome);

                //Adicionar Curso
                JLabel curso = new JLabel("Nome do curso:");
                curso.setVisible(true);
                curso.setBounds(0, 200, 200, 40);
                curso.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(curso);
                stringCurso = new JTextField();
                stringCurso.setBounds(170, 203, 300, 30);
                stringCurso.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringCurso);

                //Adicionar Matricula
                JLabel matricula = new JLabel("Matricula:");
                matricula.setVisible(true);
                matricula.setBounds(0, 300, 200, 40);
                matricula.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(matricula);
                stringMatricula = new JTextField();
                stringMatricula.setBounds(170, 303, 300, 30);
                stringMatricula.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringMatricula);

                //Adicionar email
                JLabel email = new JLabel("E-mail:");
                email.setVisible(true);
                email.setBounds(0, 400, 200, 40);
                email.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(email);
                stringEmail = new JTextField();
                stringEmail.setBounds(170, 403, 300, 30);
                stringEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringEmail);

                //Botoes para salvar ou descartar os dados
                JButton salvar = new JButton("SALVAR");
                salvar.setVisible(true);
                salvar.setBounds(200, 500,180,30);
                salvar.setFont(new Font("Times New Roman", Font.BOLD, 18));
                salvar.setForeground(new Color(10, 10, 10));
                salvar.setBackground(new Color(105, 231, 92));
                cadastrar_aluno.add(salvar);

                JButton sair = new JButton("SAIR");
                sair.setVisible(true);
                sair.setBounds(400, 500,180,30);
                sair.setFont(new Font("Times New Roman", Font.BOLD, 18));
                sair.setForeground(new Color(10, 10, 10));
                sair.setBackground(new Color(105, 231, 92));
                cadastrar_aluno.add(sair);


                salvar.addActionListener(this::ciarAluno);
                intMenu = 0;



        }

        public static int getIntMenu() {
                return intMenu;
        }

        public static JTextField getStringNome() {
                return stringNome;
        }

        public static JTextField getStringCurso() {
                return stringCurso;
        }

        public static JTextField getStringMatricula() {
                return stringMatricula;
        }

        public static JTextField getStringEmail() {
                return stringEmail;
        }


        public int ciarAluno(ActionEvent actionEvent) {

                String a = stringNome.getText();
                String b = stringCurso.getText();
                String c = stringMatricula.getText();
                String d = stringEmail.getText();

                intMenu = 1;

                JOptionPane.showMessageDialog(null, "Aluno Adicionado: \n" +
                        "Nome: " + stringNome.getText() + "\n"+
                        "Curso: " + stringCurso.getText() + "\n"+
                        "Matricula: " + stringMatricula.getText() + "\n"+
                        "E-mail: " + stringEmail.getText() + "\n"

                );
               return 1;

        }




}
