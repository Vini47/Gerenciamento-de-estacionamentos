package aplicacoes;

import models.Estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Estacionamento> estacionamentos = new ArrayList<Estacionamento>();

        char menu;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Cadastrar Estacionamento");
            System.out.println("2. Acessar Estacionamento");
            System.out.println("3. Pesquisar Registro");
            System.out.println("4. Editar Registro");
            System.out.println("0. Sair");
            menu = ler.next().charAt(0);
            clearBuffer(ler);

            switch (menu) {
                case '1' -> {
                    cadastrarEstacionamento(ler, estacionamentos);
                }
                case '2' ->{
                    System.out.println("Para qual estacionamento deseja acessar:");
                    int numEstacionamento = 0;
                    for (Estacionamento i : estacionamentos) {
                        System.out.print(numEstacionamento + ".");
                        System.out.println(estacionamentos.get(numEstacionamento).getNomeEstacionamento());
                        numEstacionamento ++;
                    }
                    numEstacionamento = ler.nextInt() ;
                    clearBuffer(ler);
                    if(numEstacionamento <= estacionamentos.size() ) {
                        System.out.println("aqui devemos fazer os acesso");

                    }else{
                        System.out.println("OPÇÃO INVÁLIDA");
                    }


                }
                case '3' -> {
                    System.out.println("Escolha um dos estacionamentos cadastrados: ");
                    }

                
                case '4' -> {
//                    for (Contratante i : contratantes) {
//                        System.out.println(i);
//                    }
                }
                case '5' -> System.out.println("case4");
                case '0' -> System.out.println("PROGRAMA ENCERRADO!");
                default -> System.out.println("OPÇÃO INVALÍDA!");
            }
        } while (menu != '0');

        System.out.println(estacionamentos);
    }
    //*--------------------------------------Métodos----------------------------------------------------------------*/
    private static void cadastrarEstacionamento(Scanner ler, ArrayList<Estacionamento> estacionamentos) {

        System.out.println("Insira o nome da empresa contratante: ");
        String nomeEmpresa = ler.nextLine();
        System.out.println("Insira o nome do estacionamento:");
        String nomeEstacionamento = ler.nextLine();
        System.out.println("Insira a capacidade do estacionamento:");
        int capacidade = ler.nextInt();
        clearBuffer(ler);
        System.out.println("Insira horário de abertura do estacionamento:");
        String horaAbertura = ler.nextLine();
        System.out.println("Insira horário de fechamento do estacionamento:");
        String horaFechamento = ler.nextLine();
        System.out.println("Insira a porcentagem de lucro do contratante:");
        double porcentagemLucro = ler.nextDouble();
        Estacionamento estacionamento =  new Estacionamento(nomeEmpresa, nomeEstacionamento,capacidade, horaAbertura, horaFechamento, porcentagemLucro);
        estacionamentos.add(estacionamento);
    }


    private static void clearBuffer(Scanner ler) {
        if (ler.hasNextLine()) {
            ler.nextLine();
        }
    }
}