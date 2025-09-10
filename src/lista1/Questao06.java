package lista1;

import java.util.Scanner;

public class Questao06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double maca = sc.nextInt();

        if(maca<12) {
            maca *= 0.3;
            System.out.printf("Valor da compra %.2f",maca);
        } else if (maca >=12) {
            maca *= 0.25;
            System.out.printf("Valor da compra R$%.2f",maca);
        }

    }
}
