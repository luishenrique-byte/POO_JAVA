package lista1;

import java.util.Scanner;

public class Questao03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a nota");
        double nota1 = sc.nextDouble();
        System.out.println("agora o peso");
        double peso1 = sc.nextDouble();

        System.out.println("informe a nota");
        double nota2 = sc.nextDouble();
        System.out.println("agora o peso");
        double peso2 = sc.nextDouble();

        System.out.println("informe a nota");
        double nota3 = sc.nextDouble();
        System.out.println("agora o peso");
        double peso3 = sc.nextDouble();


        double m = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
        System.out.println("a média ponderada é "+ m);

    }
}
