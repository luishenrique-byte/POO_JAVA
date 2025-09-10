package lista1;

import java.util.Scanner;

public class Questao01 {
    public static void main(String args[]) {
// F=((9.C)+160)/5.
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = ((9*c)+160)/5;
        System.out.printf("%.2f equivale a %.2f fahrenheit",c,f);

    }
}
