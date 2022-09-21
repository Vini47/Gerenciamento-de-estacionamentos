package Controller;

import Model.Aluno;
import View.CadastrarAluno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

        private CadastrarAluno alunoView;
        private Aluno alunoModel;

        public void alunoController(CadastrarAluno alunoView, Aluno alunoModel){

            this.alunoView = alunoView;
            this.alunoModel = alunoModel;

            this.alunoView.addAlunoListenner(new alunoListenner());
        }

    class alunoListenner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            String nome,curso, matricula, email;

            try{
                nome = alunoView.getStringNome();
                curso = alunoView.getStringCurso();
                matricula = alunoView.getStringMatricula();
                email = alunoView.getStringEmail();

                alunoModel.addAluno(nome, curso, matricula,email);
                System.out.println(alunoModel.toString());
                alunoView.setListar(alunoModel.retornaAluno());

                System.out.println(alunoModel.retornaAluno());

            }catch (NumberFormatException ex) {
                alunoView.mensagemErro("INSIRA TODOS OS DADOS!");
            }

        }
    }

    public Controller(CadastrarAluno alunoView, Aluno alunoModel) {
        this.alunoView = alunoView;
        this.alunoModel = alunoModel;
    }
}


