package lista1;

import java.util.Scanner;

public class Questao04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a hora inicial");
        int horaInicial = sc.nextInt();
        System.out.println("informe o minuto inicial");
        int minInicial = sc.nextInt();
        System.out.println("informe o segundo inicial");
        int segInicial = sc.nextInt();
        segInicial += (horaInicial*3600)+(minInicial*60);

        System.out.println("informe a hora final");
        int horaFinal = sc.nextInt();
        System.out.println("informe o minuto final");
        int minFinal = sc.nextInt();
        System.out.println("informe o segundo final");
        int segFinal = sc.nextInt();
        segFinal += (horaFinal*3600)+(minFinal*60);

        int segDurante = segFinal-segInicial;
        int hora = segDurante/3600;

        int min = (segDurante%3600)/60;
        int seg = (segDurante%3600)%60;

    }
}
