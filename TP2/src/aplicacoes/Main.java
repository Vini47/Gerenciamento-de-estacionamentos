package aplicacoes;

import models.Contratante;
import models.Estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Contratante> contratantes = new ArrayList<Contratante>();
        ArrayList<Estacionamento> estacionamentos = new ArrayList<Estacionamento>();

        char menu;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Cadastrar Contratante");
            System.out.println("2. Cadastrar Estacionamento");
            System.out.println("3. Acessar Estacionamento");
            System.out.println("4. Pesquisar Registro");
            System.out.println("5. Editar Registro");
            System.out.println("0. Sair");
            menu = ler.next().charAt(0);
            clearBuffer(ler);

            switch (menu) {
                case '1' -> {
                    System.out.println("Insira o nome da empresa contratante: ");
                    String nomeEmpresa = ler.nextLine();
                    System.out.println("Insira a localidade do contratante:");
                    String localidade = ler.nextLine();
                    System.out.println("Insira a porcentagem de lucro do contratante:");
                    double porcentagemLucro = ler.nextDouble();
                    Contratante contratante = new Contratante();
                    contratante.setNomeEmpresa(nomeEmpresa);
                    contratante.setLocalidade(localidade);
                    contratante.setPorcentagemLucro( porcentagemLucro);

                    contratantes.add(contratante);
                }
                case '2' ->{
                    System.out.println("Para qual contratante deseja adicionar um novo estacionamento:");
                    int numEstacionamento = 0;
                    for (Contratante i : contratantes) {
                        System.out.print(numEstacionamento + ".");
                        System.out.println(contratantes.get(numEstacionamento).getNomeEmpresa());
                        numEstacionamento ++;
                    }
                    numEstacionamento = ler.nextInt() ;
                    if(numEstacionamento <= contratantes.size() ) {
                        for (int i = 0; i <= contratantes.size(); i++) {
                            System.out.println("Insira horário de abertura do estacionamento:");
                            String horaAbertura = ler.nextLine();
                            System.out.println("Insira horário de fechamento do estacionamento:");
                            String horaFechamento = ler.nextLine();
                            System.out.println("Insira a capacidade do estacionamento");
                            int capacidade = ler.nextInt();
                            Estacionamento estacionamento = new Estacionamento();
                            estacionamento.setHoraAbertura(horaAbertura);
                            estacionamento.setHoraFechamento(horaFechamento);
                            estacionamento.setCapacidade(capacidade);

                            //estacionamentos.add(estacionamento);
                        }
                    }else{
                        System.out.println("OPÇÃO INVÁLIDA");
                    }


                }
                case '3' -> {
                    System.out.println("Escolha um dos estacionamentos cadastrados: ");
                    int numEstacionamento = 0;
                    for (Contratante i : contratantes) {
                        System.out.print(numEstacionamento + ".");
                        System.out.println(contratantes.get(numEstacionamento).getNomeEmpresa());
                        numEstacionamento ++;
                    }

                }
                case '4' -> System.out.println("case3");
                case '5' -> System.out.println("case4");
                case '0' -> System.out.println("PROGRAMA ENCERRADO!");
                default -> System.out.println("OPÇÃO INVALÍDA!");
            }
        } while (menu != '0');

        for (Contratante i : contratantes) {
            System.out.println(i);
        }

    }

    private static void clearBuffer(Scanner ler) {
        if (ler.hasNextLine()) {
            ler.nextLine();
        }
    }
}