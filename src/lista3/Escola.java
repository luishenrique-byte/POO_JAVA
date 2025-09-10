package lista3;

public class Escola {
//    Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
//    Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome,
//    2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
//    a. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
//    b. final -> calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
//
//    Faça uma aplicação que instancie três objetos do tipo Aluno defina todos os valores de
//    atributos e ao final informe os nomes dos alunos que vão para a prova final.
    private int matricula;
    private String nome;
    private double notaPorva1, notaProva2, notaTrabalho;


    public double getNotaTrabalho() {
        return notaTrabalho;
    }


    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }


    public double getNotaProva2() {
        return notaProva2;
    }


    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }


    public double getNotaPorva1() {
        return notaPorva1;
    }


    public void setNotaPorva1(double notaPorva1) {
        this.notaPorva1 = notaPorva1;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public double media(){
        return ((this.notaPorva1*2.5)+(this.notaProva2*2.5)+(this.notaTrabalho*2))/7;
    }
    public double provaFinal(){
        double pontosFaltantes;
        pontosFaltantes = 7-media();


        if (media()<7){
            return pontosFaltantes;
        } else {
            return 0;
        }
    }
    public void mostrarResultado(){
        System.out.printf("Matrícula: %d%n", getMatricula());
        System.out.printf("Nome do aluno: %s%n", getNome());
        if(media()<7){
            System.out.println("PROVA FINAL");
            System.out.printf("FALTA: %.1f pontos%n", provaFinal());
        } else {
            System.out.println("PARABÉNS, VOCÊ PASSOU");
            System.out.printf("FALTA: %f pontos%n", provaFinal());
        }
        System.out.println("============================");
    }
}

