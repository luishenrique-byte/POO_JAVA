package lista2;

public class Aluno {
    /*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
    Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome,
    2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
    a. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
    tem peso 2)
    b. final -> calcula quanto o aluno precisa para a prova final (retorna zero se ele
    não for para a final)*/
    long matricula;
    String nome;
    double nota_Prova1, nota_Prova2, nota_Trabalho;


    public double calcular_media(){
        double mediaP = 0;
        mediaP = ((nota_Prova1*2.5)+(nota_Prova2*2.5)+(nota_Trabalho*2))/7;
        return mediaP;
    }


    public double qtdeFaltante(double media){
        if (media>=7){
            return 0;
        } else{
            return  7 - media;
        }
    }


}

