package Controller;

import Model.Aluno;
import View.CadastrarAluno;
import View.ListarAlunos;
import View.TelaPrincipal;

import javax.swing.*;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        new TelaPrincipal();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        int menu = 0;


        if (CadastrarAluno.getIntMenu() != 0) {
            menu = CadastrarAluno.getIntMenu();
        }
        if (ListarAlunos.getIntMenu() != 0) {
            menu = ListarAlunos.getIntMenu();
        }

        switch (menu) {
            
            case 1:
                String a = String.valueOf(CadastrarAluno.getStringNome());
                String b = String.valueOf(CadastrarAluno.getStringCurso());
                String c = String.valueOf(CadastrarAluno.getStringMatricula());
                String d = String.valueOf(CadastrarAluno.getStringEmail());

                Aluno aluno = new Aluno(a, b, c, d);
                alunos.add(aluno);

                break;
            case 2:

                break;
        }

    }
}


