package lista3;

import java.util.Scanner;

public class AppPA {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        ProgressaoAritmetica pa1 = new ProgressaoAritmetica(2,3);
        pa1.status();
        System.out.println("Informe quantos a quantidade de números da PA");
        int qtde = sc.nextInt();
        pa1.mostrarNumerosPA(qtde);


        System.out.println("Informe o primeiro termo que deseja para sua PA personalizadas:");
        int t1 = sc.nextInt();
        System.out.println("Informe a razão para sua PA personalizadas: ");
        int rz = sc.nextInt();
        System.out.println("Informe uma nova qtde de números que quer ver da sua sequência: ");
        qtde = sc.nextInt();
        ProgressaoAritmetica pa2 = new ProgressaoAritmetica(t1, rz);


        pa2.status();
        pa2.mostrarNumerosPA(qtde);


        ProgressaoAritmetica pa3 = new ProgressaoAritmetica(5, 5);
        qtde = 10;
        System.out.println("----PA 3 ------");
        System.out.println("1º Termo: " + pa3.getPrimeiroTermo());
        System.out.println("Razão: " + pa3.getRazao());
        System.out.println("Termo Atual"+pa3.getTermoAtual());
        pa3.mostrarNumerosPA(qtde);


        pa3.setPrimeiroTermo(2);
        pa3.setRazao(2);
        pa3.setTermoAtual(pa3.getPrimeiroTermo());
        pa3.mostrarNumerosPA(qtde);
    }

}
