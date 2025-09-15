package lista4_1.escola;

import java.util.Scanner;

//Cada objeto da classe Aluno deve guardar os seguintes dados: matrícula, nome, 2
//notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
//a. setNota1 -> para inserir a nota da primeira avaliação.
//b. setNota2 -> para inserir a nota da segunda avaliação.
//c. setNotaTrabalho -> para inserir a nota do trabalho
//d. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
public class Aluno {
    Scanner sc = new Scanner(System.in);
    private long matricula;
    private String nome;
    private double notaP1, notaP2, notaT;

    public Aluno() {
        System.out.println("Informe a matricula do Aluno: ");
        this.matricula = sc.nextLong();
        sc.nextLine(); // Limpar o buffer
        System.out.println("Informe o Nome do Aluno: ");
        this.nome = sc.nextLine();
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public void setNotaT(double notaT) {
        this.notaT = notaT;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double mediaAluno(){return ((this.notaP1*2.5)+(this.notaP2*2.5)+(this.notaT*2))/(2.5+2.5+2);}

    public void provaFinal(){
        double pontosFaltantes;
        pontosFaltantes = 7-mediaAluno();


        if (mediaAluno()<7){
            System.out.println("PROVA FINAL");
            System.out.printf("FALTA: %.1f pontos%n", pontosFaltantes);
        } else {
            System.out.println("PARABÉNS, VOCÊ PASSOU");
            System.out.printf("FALTA: %f pontos%n", pontosFaltantes);
        }

    }

}
