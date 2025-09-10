package lista1;

import java.util.Scanner;

public class Questao02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        s += (h*3600) + (m*60);
        System.out.println("Então já se passaram " + s+ " segundos");

    }
}
