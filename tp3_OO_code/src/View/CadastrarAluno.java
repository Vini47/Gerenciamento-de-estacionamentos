package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarAluno extends Component {

        private JTextField stringNome;
        private JTextField stringCurso;
        private JTextField stringMatricula;
        private JTextField stringEmail;
        private JTextField alunoCadastrado;

        private Controller chamar;
        JFrame cadastrar_aluno;
        JLabel nome;
        JLabel curso;
        JLabel matricula;
        JLabel email;
        JButton salvar;
        JButton listar;
        public CadastrarAluno() {

                cadastrar_aluno = new JFrame("Cadastrar Aluno");
                cadastrar_aluno.setVisible(true);
                cadastrar_aluno.setSize(800, 600);
                cadastrar_aluno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cadastrar_aluno.setLocationRelativeTo(null);
                cadastrar_aluno.setLayout(null);
                cadastrar_aluno.setResizable(false);

                JLabel titulo = new JLabel("INSIRA OS DADOS DOS ALUNOS");
                titulo.setVisible(true);
                titulo.setBounds(200, 25, 500, 40);
                titulo.setFont(new Font("Times New Roman", Font.BOLD, 26));
                cadastrar_aluno.add(titulo);

                //Adicionar nome
                nome = new JLabel("Nome do aluno:");
                nome.setVisible(true);
                nome.setBounds(0, 100, 200, 40);
                nome.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(nome);
                stringNome = new JTextField();
                stringNome.setBounds(170, 103, 300, 30);
                stringNome.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringNome);

                //Adicionar Curso
                curso = new JLabel("Nome do curso:");
                curso.setVisible(true);
                curso.setBounds(0, 200, 200, 40);
                curso.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(curso);
                stringCurso = new JTextField();
                stringCurso.setBounds(170, 203, 300, 30);
                stringCurso.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringCurso);

                //Adicionar Matricula
                matricula = new JLabel("Matricula:");
                matricula.setVisible(true);
                matricula.setBounds(0, 300, 200, 40);
                matricula.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(matricula);
                stringMatricula = new JTextField();
                stringMatricula.setBounds(170, 303, 300, 30);
                stringMatricula.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringMatricula);

                //Adicionar email
                email = new JLabel("E-mail:");
                email.setVisible(true);
                email.setBounds(0, 400, 200, 40);
                email.setFont(new Font("Times New Roman", Font.BOLD, 25));
                cadastrar_aluno.add(email);
                stringEmail = new JTextField();
                stringEmail.setBounds(170, 403, 300, 30);
                stringEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(stringEmail);

                //TextField pra mostrar o aluno cadastrado
                alunoCadastrado = new JTextField();
                alunoCadastrado.setBounds(480, 100, 300, 350);
                alunoCadastrado.setFont(new Font("Times New Roman", Font.BOLD, 18));
                cadastrar_aluno.add(alunoCadastrado);

                //Botoes para salvar ou descartar os dados
                salvar = new JButton("SALVAR");
                salvar.setVisible(true);
                salvar.setBounds(100, 500, 180, 30);
                salvar.setFont(new Font("Times New Roman", Font.BOLD, 18));
                salvar.setForeground(new Color(10, 10, 10));
                salvar.setBackground(new Color(105, 231, 92));
                cadastrar_aluno.add(salvar);

                listar = new JButton("LISTAR");
                listar.setBounds(300, 500, 180, 30);
                listar.setFont(new Font("Times New Roman", Font.BOLD, 18));
                listar.setForeground(new Color(10, 10, 10));
                listar.setBackground(new Color(105, 231, 92));
                cadastrar_aluno.add(listar);

                JButton sair = new JButton("SAIR");
                sair.setVisible(true);
                sair.setBounds(500, 500, 180, 30);
                sair.setFont(new Font("Times New Roman", Font.BOLD, 18));
                sair.setForeground(new Color(10, 10, 10));
                sair.setBackground(new Color(105, 231, 92));
                cadastrar_aluno.add(sair);

                salvar.addActionListener(this::ciarAluno);

                sair.addActionListener(e -> {
                        cadastrar_aluno.dispose();
                });
        }
        public String getStringNome() {
                return stringNome.getText();
        }
        public String getStringCurso() {
                return stringCurso.getText();
        }
        public String getStringMatricula() {
                return stringMatricula.getText();
        }
        public String getStringEmail() {
                return stringEmail.getText();
        }
        public void ciarAluno(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(null, "Aluno Adicionado: \n" +
                        "Nome: " + stringNome.getText() + "\n" +
                        "Curso: " + stringCurso.getText() + "\n" +
                        "Matricula: " + stringMatricula.getText() + "\n" +
                        "E-mail: " + stringEmail.getText() + "\n");
        }

       public void mensagemErro(String erroMsg) {
                JOptionPane.showMessageDialog(this, erroMsg);
       }
        public void setListar(String alunoFinal){

                listar.setText(Integer.toString(Integer.parseInt(alunoFinal)));

        }
        public void addAlunoListenner(ActionListener alunoListenner){
                salvar.addActionListener(alunoListenner);
        }
}

