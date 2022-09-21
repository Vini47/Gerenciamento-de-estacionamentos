package Main;

import Controller.Controller;
import Model.Aluno;
import View.CadastrarAluno;

public class Main {

        public static void main(String[] args) {

        CadastrarAluno view = new CadastrarAluno();
        Aluno model = new Aluno();
        Controller controller = new Controller(view,model);
        view.setVisible(true);
    }

}

