package lista4_1.escola;

import java.sql.SQLOutput;
import java.util.Scanner;

//A classe Turma deve conter os atributos disciplina, professor, carga horária,
//quantidade de alunos e um vetor de 30 posições de objetos do tipo Aluno. Nesta
//classe deve existir um metodo chamado insereAluno que instancia um objeto do tipo
//Aluno e o insere no vetor de alunos da turma.
//A aplicação de teste deve instanciar uma turma e oferecer um menu de opções para o
//usuário com as opções:
//        • Inserir aluno
//        • Registrar nota 1
//        • Registrar nota 2
//        • Registrar nota do trabalho
//        • Calcular média da turma
//        • Mostrar listagem da turma
//        • Sair
//Outros métodos serão necessários. Faz parte de sua atividade identificá-los
public class Turma {
    Scanner sc = new Scanner(System.in);
    private String diciplina, professor;
    private int cargaHoraria, qtdeAlunos = 30;
    private Aluno vetor[] = new Aluno[qtdeAlunos];
    private int aux = 0;



    public void insereAluno(){
        if(aux<=qtdeAlunos) {
            Aluno objeto = new Aluno();

            this.vetor[aux] = objeto;
            aux++;
        } else {
            System.out.println("Limite de Alunos atingido!!!");
        }
    }

    public void registrarNotaP1() {

        //Função para registrar a nota da Primeira prova.
        // do...while para garantir que informe um aluno existente.
        // if  apenas mostrado quando na primeira tentativa for colocado um valor errado.

        int posicaoAluno, tentativa = 0;
        do{

            if (tentativa>0){
                System.out.println("Aluno Inexistente!");
            }

            System.out.println("Informe o ID do Aluno: ");
            posicaoAluno = sc.nextInt();

            tentativa++;

        }while(posicaoAluno > 30 || vetor[posicaoAluno]==null);

        System.out.println("Informe a nota da Primeira prova: ");
        double nota = sc.nextDouble();
        vetor[posicaoAluno-1].setNotaP1(nota);

    }

    public void registrarNotaP2(){

        //Função para registrar a nota da Segunda prova.
        // do...while para garantir que informe um aluno existente.
        // if  apenas mostrado quando na primeira tentativa for colocado um valor errado.

        int posicaoAluno;
        int tentativa = 0; // variavel auxilar usada somente como verificação
        do{

            if (tentativa>0){
                System.out.println("Aluno Inexistente!");
            }

            System.out.println("Informe o ID do Aluno: ");
            posicaoAluno = sc.nextInt();

            tentativa++;

        }while(posicaoAluno > 30 || vetor[posicaoAluno]==null);

        System.out.println("Informe a nota da Segunda prova: ");
        double nota = sc.nextDouble();

        vetor[posicaoAluno-1].setNotaP2(nota);// posicão - 1, pq o usuario nunca vai informar o aluno 0
    }

    public void registrarNotaT(){

        //Função para registrar a nota do Trabalho.
        // do...while para garantir que informe um aluno existente.
        // if  apenas mostrado quando na primeira tentativa for colocado um valor errado.

        int posicaoAluno;
        int tentativa = 0; // variavel auxilar usada somente como verificação
        do{

            if (tentativa>0){
                System.out.println("Aluno Inexistente!");
            }

            System.out.println("Informe o ID do Aluno: ");
            posicaoAluno = sc.nextInt();

            tentativa++;

        }while(posicaoAluno > 30 || vetor[posicaoAluno]==null);

        System.out.println("Informe a nota da Segunda prova: ");
        double nota = sc.nextDouble();

        vetor[posicaoAluno-1].setNotaP2(nota); // posicão - 1, pq o usuario nunca vai informar o aluno 0
    }

    public double calcularMediaTurma(){
        double soma=0, mediaTurma;
        for (int i = 0;i<qtdeAlunos;i++){
            soma+=vetor[i].mediaAluno(); //gettando as todas as média individuais
        }
        mediaTurma = soma/qtdeAlunos;
        return mediaTurma;
    }

    public void mostrarLista(){
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+++++++ +Lista Alunos+++++++++");
        System.out.println("------------------------------");
        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.println("Matricula: " + vetor[i].getMatricula());
            System.out.println("Nome Aluno: " + vetor[i].getNome());
            System.out.println("Media : " + vetor[i].mediaAluno());
            vetor[i].provaFinal(); // mostrando se o aluno vai para a prova final ou se passou de ano
            System.out.println("=============================");
        }
    }

    public int mostrarMenu(){
        System.out.println("==========MENU=============");
        System.out.println("1. Inserir aluno");
        System.out.println("2. Registrar nota 1");
        System.out.println("3. Registrar nota 2");
        System.out.println("4. Registrar nota do trabalho");
        System.out.println("5. Calcular média da turma");
        System.out.println("6. Mostrar listagem da turma");
        System.out.println("7. Sair");
        System.out.println("===========================");
        return sc.nextInt();
    }
    public void GarantirMenu(){ // Função garante que o usuario escolha um opção certa e RETORNA ELA
        int opcao, tentativa =0;
        do {
            if (tentativa>0){
                System.out.println("Opção inválida");
            }

            opcao = mostrarMenu(); // Chama o menu e retorna a opção

        }while(opcao<0||opcao>7);
       acao(opcao);
    }
    public void acao(int opcao){

        switch(opcao){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;

        }
    }
}
