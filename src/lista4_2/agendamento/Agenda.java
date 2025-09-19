package lista4_2.agendamento;

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

    private Contato vetor[] = new Contato[50];
    private int aux =0;
    public void addContato(){
        Contato object = new Contato();
        System.out.println("Informe o nome do contato: ");
         =
    }
}
