package lista4_2.agendamento;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//2) Faça um programa em Java que contém as classes Contato e Agenda.
//A classe Contato deve ter os atributos nome, telefone, data de aniversário (uma string no formato DDMMAAAA), e-mail.
//A classe Agenda deve ter um vetor de 50 posições de contatos e a quantidade de contatos
//registrados. Devem ser implementados para a classe Agenda métodos para adicionar
//contato, consultar contato, listar todos os contatos e listar aniversariantes do mês.
//Uma vez implementadas as classes, implemente uma aplicação que apresente um menu
//para o usuário para adicionar contatos, consultar contatos, listar os aniversariantes do mês
//e listar todos os contatos.
//Organize as classes em pacotes
public class Agenda {
    Scanner sc = new Scanner(System.in);
    private Contato vetor[] = new Contato[3];
    private int aux = 0;



    public void mostrarMenu(){
        int opcao, tentativa =0;

        do {  // do...while repetindo o menu
            do { // do...while garantindo receber valor aceito
                if (tentativa > 0) {
                    System.out.println("Opção inválida");
                }
                System.out.println("==========MENU=============");
                System.out.println("1. Adicionar contato");
                System.out.println("2. Consultar contato");
                System.out.println("3. Listar aniversariantes do Mês");
                System.out.println("4. Listar todos contatos");
                System.out.println("5. Sair");
                System.out.println("===========================");
                opcao = sc.nextInt();
                sc.nextLine();
                tentativa++;

            } while (opcao < 0 || opcao > 5);
            tentativa = 0; // Resetar as tentativas, logo o if() so aparece quando é uma opção errada
            acao(opcao);
        }while (opcao!=5);
    }

    public void acao(int opcao){
        int cont=0;
        if(opcao!=5) {
            for (int i = 0; i < vetor.length; i++) { // antes de toda ação, verifica se há alguma coi no verto
                if (vetor[i] != null) {
                    cont++;
                    break;
                }
            }
        }
        switch (opcao){
            case 1:
                inserirContato();
                break;
            case 2:

                if (cont>0){
                    consultarContato();
                } else {
                    System.out.println("Não há contatos registrados.");
                }
                break;

            case 3:

                if (cont>0){
                    aniversarianteMes();
                } else {
                    System.out.println("Não há contatos registrados.");
                }
                break;

            case 4:

                if (cont>0){
                    listarContatos();
                } else {
                    System.out.println("Não há contatos registrados.");
                }
                break;

            default:
                break;
        }
    }
    public void inserirContato() {
        String nome;

        do {
            System.out.println("Informe o nome do contato: ");
            nome = sc.nextLine();
            if (!(nome.trim().isEmpty())){
                //trim() para tirar os espaços vazios extras
                //isEmpty() para verificar se é vazio
                vetor[aux] = new Contato();
            } else {
                System.out.println("Você não informou o nome");
            }
        }while (nome.trim().isEmpty());
        vetor[aux].setNome(nome);

        capturandoAniversario();

        System.out.println("Informe o e-mail do contato: ");
        String email = sc.nextLine();
        vetor[aux].setEmail(email);

        capturarNumero();

        aux++;
    }

    public void consultarContato(){
        Arrays.sort(vetor, Comparator.comparing(Contato::getNome, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER))); // ordenando vetor
        System.out.println("Informe nome do contato: ");
        String entrada = sc.nextLine();
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getNome().toLowerCase().contains(entrada.toLowerCase())){
                System.out.println("| "+ vetor[i].getNumCell() + "  -  " + vetor[i].getNome());
                System.out.println("| "+ vetor[i].getDateBirthday());
                System.out.println("| "+ vetor[i].getEmail());
                System.out.println("----------------------------------------------------");
            }
        }
    }

    public void aniversarianteMes() {
        Arrays.sort(vetor, Comparator.comparing(Contato::getNome, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER))); // ordenando vetor
        int mesAtual = LocalDate.now().getMonthValue();
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < vetor.length; i++) {

            LocalDate aniversario = vetor[i].getDateBirthday();
            int mesAniversario = aniversario.getMonthValue();

            if (mesAtual == mesAniversario) {
                System.out.println("| " + vetor[i].getNumCell() + "  -  " + vetor[i].getNome());
                System.out.println("| " + vetor[i].getEmail());
                System.out.println("| " + vetor[i].getDateBirthday());
                System.out.println("----------------------------------------------------");
            }
        }
    }
    public void listarContatos(){
        Arrays.sort(vetor, Comparator.comparing(Contato::getNome, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER))); // ordenando vetor
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            if(!(vetor[i] == null)) {
                System.out.println("| " + vetor[i].getNumCell() + "  -  " + vetor[i].getNome());
                System.out.println("| " + vetor[i].getEmail());
                System.out.println("| " + vetor[i].getDateBirthday());
                System.out.println("----------------------------------------------------");
            }
        }
    }

    public void capturandoAniversario(){
        boolean dateValid=false;
        System.out.println("Informe o aniversário(dd/mm/aaaa) do contato: ");

        while (!dateValid) {
            String entrada = sc.nextLine();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            try {
                // tentando converter a String entrada no formato
                LocalDate dateBirthday = LocalDate.parse(entrada, formatador);
                vetor[aux].setDateBirthday(dateBirthday);
                dateValid = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Por favor, digite novamente.");
            }
        }
        System.out.println("Data de aniversário inserida com sucesso!");
    }

    public void capturarNumero(){
        boolean numValid = false;
        System.out.println("Informe o número do contato: ");

        while(!numValid){
            // Capturar o numero de entrada, troca todos char que não estão entre 0-9 por vazio;
            String entrada = sc.nextLine().replaceAll("[^\\d]","");

            // Verificar se a string tem, rigorosamente, de 8 a 11 dígitos.
            if(entrada.matches("\\d{8,11}")){
                vetor[aux].setNumCell(entrada);
                numValid = true;
            } else {
                System.out.println("Número invalido. Por favor, digite apenas números");
            }
        }
    }
}