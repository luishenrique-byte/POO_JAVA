package lista2;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno b = new Aluno();
        double notaP1=0, notaP2=0, notaT=0;


        System.out.println("Informe o Nome do Aluno");
        b.nome = sc.nextLine();


        System.out.println("Informe a MATRÍCULA do Aluno");
        b.matricula = sc.nextLong();


        System.out.println("Informe a NOTA DA PROVA Nº1 do Aluno");
        b.nota_Prova1 = sc.nextDouble();


        System.out.println("Informe a NOTA DA PROVA Nº2 do Aluno");
        b.nota_Prova2 = sc.nextDouble();


        System.out.println("Informe a NOTA DO TRABALHO do Aluno");
        b.nota_Trabalho = sc.nextDouble();


        System.out.printf("%d | %s  PONTOS RESTANTES: %.1f", b.matricula, b.nome, b.qtdeFaltante(b.calcular_media()));
    }

}
