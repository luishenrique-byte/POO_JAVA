package lista4_2.agendamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
public class Contato {
    Scanner sc = new Scanner(System.in);
    private String name, email,numberPhone;
    private LocalDate dateBirthday;



    public Contato() {
        System.out.println("Informe o nome do contato: ");
        this.name = sc.nextLine();

        capturandoAniversario();

        System.out.println("Informe o e-mail do contato: ");
        this.email = sc.nextLine();

        capturarNumero();

    }
    public void capturandoAniversario(){
        boolean dateValid=false;
        System.out.println("Informe o aniversário(dd/mm/aaaa) do contato: ");

        while (!dateValid) {
            String entrada = sc.nextLine();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            try {
                // tentando converter a String entrada no formato
                this.dateBirthday = LocalDate.parse(entrada, formatador);
                dateValid = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Por favor, digite novamente.");
            }
            System.out.println("Data de aniversário inserida com sucesso!");
            sc.close();
        }
    }
    public void capturarNumero(){
        boolean numValid = false;
        System.out.println("Informe o número do contato: ");

        while(!numValid){
            // capturar o numero de entrada, troca todos char que não estão entre 0-9 por vazio;
            String entrada = sc.nextLine().replaceAll("[^\\d]","");

            // verificar se a string tem, rigorosamente, de 8 a 11 dígitos.
            if(entrada.matches("\\d{8,11}")){
                this.numberPhone = entrada;
                numValid = true;
            } else {
                System.out.println("Número invalido. Por favor, digite apenas números");
            }
        }

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {

        this.email = email;
    }
}
