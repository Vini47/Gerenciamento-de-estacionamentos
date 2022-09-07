package aplicacoes;

import models.Acesso;
import models.Estacionamento;
import models.Evento;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Estacionamento> estacionamentos = new ArrayList<Estacionamento>();
        ArrayList<Acesso> acessos = new ArrayList<Acesso>();
        ArrayList<Acesso> acessosEventos = new ArrayList<Acesso>();
        ArrayList<Evento> eventos = new ArrayList<Evento>();

        char menu;

        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Cadastrar Estacionamento");
            System.out.println("2. Acessar Estacionamento");
            System.out.println("3. Gerar Relatorio de Registro");
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
                        System.out.println("-------Informções do Estacionamento------");
                        System.out.println(estacionamentos.get(numEstacionamento));
                        System.out.println("------------------------------------------");
                        System.out.println("Qual acesso deseja cadastras");
                        System.out.println("1. Acesso por Tempo");
                        System.out.println("2. Cadastrar Evento");
                        System.out.println("3. Acessar Evento");
                        char escolha = ler.next().charAt(0);
                        clearBuffer(ler);
                        switch (escolha) {
                            case '1' -> {

                                boolean continuar;
                                do {
                                    System.out.println("Insira a placa do veículo:");
                                    String placa = ler.nextLine();

                                    System.out.println("O proprietário do veículo é um mensalista?");
                                    System.out.println("Digite 'S' para sim e qualquer outra caracter para não");
                                    boolean mensalista = false;
                                    char mensal = ler.next().charAt(0);
                                    clearBuffer(ler);

                                    if (mensal == 'S' | mensal == 's') {
                                        mensalista = true;
                                    }

                                    System.out.println("Insira o dia de entrada do veículo e o horário: ");
                                    System.out.println("OBS = Utilize o seguinte formato");
                                    System.out.println("ano-mes-diaThora:minutos:segundos");
                                    System.out.println("Exemplo: 2022-04-19T10:48:25");
                                    String entrada = ler.nextLine();
                                    LocalDateTime dateTimeEntrada = LocalDateTime.parse(entrada);

                                    System.out.println("Insira o dia de saída do veículo e o horário: ");
                                    System.out.println("OBS = Utilize o seguinte formato");
                                    System.out.println("ano-mes-diaThora:minutos:segundos");
                                    System.out.println("Exemplo: 2022-04-19T10:48:25");
                                    String saida = ler.nextLine();
                                    LocalDateTime dateTimeSaida = LocalDateTime.parse(saida);

                                    Acesso acesso = new Acesso(placa, mensalista, dateTimeEntrada, dateTimeSaida);
                                    acessos.add(acesso);

                                    estacionamentos.get(numEstacionamento).setAcessos(acessos);

                                    continuar = true;
                                    System.out.println("Deseja adicionar outro acesso?");
                                    System.out.println("Digite 'N' para não, e voltar ao menu!");
                                    char decisao = ler.next().charAt(0);
                                    if (decisao == 'N' | decisao == 'n') {
                                        continuar = false;
                                    }
                                    clearBuffer(ler);
                                } while (continuar);

                                System.out.println(estacionamentos);
                            }
                            case '2' -> {
                                System.out.println("Digite o nome do Evento");
                                String nomeEvento = ler.nextLine();
                                System.out.println("Digite o valor de acesso do Evento:");
                                int valorEvento = ler.nextInt();

                                Evento evento = new Evento(nomeEvento,valorEvento);
                                eventos.add(evento);
                            }
                            case '3' ->{
                                System.out.println("Para qual evento deseja cadastrar acessos:");
                                int numEvento = 0;
                                for (Evento i : eventos) {
                                    System.out.print(numEvento + ".");
                                    System.out.println(eventos.get(numEvento).getNomeEvento());
                                    numEvento ++;
                                }
                                numEstacionamento = ler.nextInt() ;
                                clearBuffer(ler);
                                if (numEvento <= eventos.size()) {
                                    boolean continuar;
                                    do {
                                        System.out.println("Insira a placa do veículo:");
                                        String placa = ler.nextLine();
                                        System.out.println("O proprietário do veículo é um mensalista?");
                                        System.out.println("Digite 'S' para sim e qualquer outra caracter para não");
                                        boolean mensalista = false;
                                        char mensal = ler.next().charAt(0);
                                        clearBuffer(ler);

                                        if (mensal == 'S' | mensal == 's') {
                                            mensalista = true;
                                        }
                                        Acesso acesso = new Acesso(placa, mensalista);
                                        acessosEventos.add(acesso);
                                        eventos.get(numEvento).setAcessos(acessos);

                                        continuar = false;
//                                        System.out.println("Deseja adicionar outro acesso?");
//                                        System.out.println("Digite 'N' para não, e voltar ao menu!");
//                                        char decisao = ler.next().charAt(0);
//                                        if (decisao == 'N' | decisao == 'n') {
//                                            continuar = false;
//                                        }
//                                        clearBuffer(ler);
                                    } while (continuar);

                                }else{
                                    System.out.println("OPÇÃO INVÁLIDA!");
                                }
                            }
                            default -> {
                                System.out.println("OPÇÃO INVÁLIDA!");
                            }
                        }

                    }else{
                        System.out.println("OPÇÃO INVÁLIDA");
                    }

                }
                case '3' -> {
                        System.out.println("Pesquise pelo nome do estacionamento que deseja  gerar relatório");
                        String pesquisa = ler.nextLine();
                        int nPesquisa = 0;
                        boolean pesquisaSucesso = false;
                        for (Estacionamento i : estacionamentos) {

                            if(estacionamentos.get(nPesquisa).getNomeEstacionamento().equalsIgnoreCase(pesquisa)){
                                System.out.println(i);
                                pesquisaSucesso = true;
                            }
                            nPesquisa ++;
                        }
                        if(!pesquisaSucesso){
                            System.out.println("Estacionamento não encontrado");
                        }
                    }


                case '4' -> {
                    System.out.println("Escolha um dos estacionamentos cadastrados: ");

                }
                case '5' ->{
                    System.out.println("ss");
                }

                case '0' -> System.out.println("PROGRAMA ENCERRADO!");
                default -> System.out.println("OPÇÃO INVALÍDA!");
            }
        } while (menu != '0');

        System.out.println(estacionamentos);
    }

    /*
    private static void relatórioRegistros(ArrayList<Estacionamento> estacionamentos,Scanner ler) {
        System.out.println("Pesquise pelo nome do estacionamento que deseja  gerar relatório");
        String pesquisa = ler.nextLine();
        int nPesquisa = 0;
        boolean pesquisaSucesso = false;
        for (Estacionamento i : estacionamentos) {

            if(estacionamentos.get(nPesquisa).getNomeEstacionamento().equalsIgnoreCase(pesquisa)){
                System.out.println(i);
                pesquisaSucesso = true;
            }
            nPesquisa ++;
        }
        if(!pesquisaSucesso){
            System.out.println("Estacionamento não encontrado");
        }
    }
    */
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

        System.out.println("Insira o valor da fração: ");
        double valorFracao = ler.nextDouble();

        System.out.println("Insira a porcentagem do desconto do valor da hora cheia: ");
        double valorDesconto = ler.nextDouble();

        System.out.println("Insira o valor do mensalista: ");
        double valorMensalista = ler.nextDouble();

        System.out.println("Insira o valor da diária diurna: ");
        double diariaDiurna = ler.nextDouble();

        System.out.println("Insira o valor da diária noturna: ");
        double diariaNoturna = ler.nextDouble();


        Estacionamento estacionamento =  new Estacionamento(nomeEmpresa, nomeEstacionamento,capacidade, horaAbertura, horaFechamento,
                                                            porcentagemLucro, valorFracao, valorDesconto, valorMensalista, diariaDiurna,diariaNoturna);

        estacionamentos.add(estacionamento);
    }

    private static void clearBuffer(Scanner ler) {
        if (ler.hasNextLine()) {
            ler.nextLine();
        }
    }
}