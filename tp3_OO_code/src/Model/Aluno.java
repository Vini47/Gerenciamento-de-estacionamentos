package Model;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String curso;
    private String matricula;
    private String email;

    @Override
    public  String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", matricula='" + matricula + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addAluno(String nome, String curso, String matricula, String email){
        setNome(nome);
        setCurso(curso);
        setMatricula(matricula);
        setEmail(email);
    }
    public String retornaAluno(){
        String a = getNome();
        String b = getCurso();
        String c = getMatricula();
        String d = getEmail();

        return "Aluno Salvo" + "\n" +
        "Nome: " + a + "\n" +
        "Curso: " + b + "\n" +
        "Matricula: " + c + "\n" +
        "E-mail: " + d + "\n";

    }
}


