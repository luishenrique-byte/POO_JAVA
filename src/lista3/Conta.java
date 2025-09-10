package lista3;

import java.util.Scanner;


public class Conta {
    //    Implemente uma classe chamada Conta que tenha por atributos o número da conta, o
//    nome do correntista e o saldo. Deve ser criada uma aplicação que instancie um objeto
//    da classe Conta e ofereça um menu com as opções saque, depósito, consulta de saldo
//    e sair da aplicação. A aplicação deve realizar as operações que o usuário desejar até
//    que ele peça para sair do programa.
    Scanner sc = new Scanner(System.in);
    private int conta;
    private String nome;
    private double saldo;


    public Conta(String nome, int conta, double saldo) {
        this.nome = nome;
        this.conta=conta;
        this.saldo = saldo;
    }


    public int getConta() {
        return conta;
    }


    public void setConta(int conta) {
        this.conta = conta;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void mostraMenu(){
        int opcao;
        do {


            System.out.println("====================");
            System.out.println("1. DEPOSITAR");
            System.out.println("2. SACAR");
            System.out.println("3. CONSULTAR SALDO");
            System.out.println("0. SAIR");
            System.out.println("===================");
            acao(opcao = sc.nextInt());
        }while(opcao!=0);
    }
    public void acao(int opcao){
        double valor;
        switch (opcao){
            case 1:
                System.out.println("informe o valor");
                valor = sc.nextDouble();
                this.saldo=valor;
                break;
            case 2:
                System.out.println("Informe o valor");
                valor = sc.nextDouble();
                this.saldo-=valor;
                break;
            case 3:
                System.out.println("Conta " + getConta());
                System.out.println("proprietário - "+getNome());
                System.out.printf("Saldo: R$ %.2f%n", getSaldo());
                break;
            default:
                System.out.println("FINAL DA APLICAÇÃO");
                break;
        }
    }
}

