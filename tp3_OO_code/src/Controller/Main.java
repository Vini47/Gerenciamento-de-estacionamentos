package Controller;


import Model.Aluno;
import View.TelaPrincipal;

import java.util.ArrayList;

public class Main {
    //--------------------------------------------
    public static void main(String[] args) {

        new TelaPrincipal();
    }

    //-------------------------------------------------------
    public static void salvarAluno(ArrayList<Aluno> getAlunos, String nome, String curso, String matricula, String email) {

        Aluno aluno = new Aluno(nome, curso, matricula, email);
        getAlunos.add(aluno);


        for (Aluno i : getAlunos) {
            System.out.println(getAlunos.get(getAlunos.indexOf(i)).toString());
        }
        System.out.println(getAlunos.size());

    }

    public static String imprimirAluno(ArrayList<Aluno> getAlunos) {

        return getAlunos.toString();

    }

}


