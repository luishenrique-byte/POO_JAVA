package lista1;

import java.util.Scanner;

public class Questao08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nivel = sc.nextInt();
        int salario=0,horas;
        switch (nivel){
            case 1 :
                System.out.println("INFORME AS HORA TRABALHADAS");
                horas = sc.nextInt();
                salario = horas*12;
                break;
            case 2:
                System.out.println("INFORME AS HORA TRABALHADAS");
                horas = sc.nextInt();
                salario = horas*17;
                break;
            case 3:
                System.out.println("INFORME AS HORA TRABALHADAS");
                horas = sc.nextInt();
                salario = horas*25;
                break;
        }
        System.out.printf("Seu salário é de R$%d",salario);
    }
}
