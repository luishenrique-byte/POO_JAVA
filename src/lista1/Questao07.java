package lista1;

import java.util.Scanner;

public class Questao07 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        if(l1<l2+l3 && l2<l1+l3 && l3<l1+l2){
            if (l1==l2 && l2==l3){
                System.out.println("EQUILATERO");
            } else if (l1==l2 || l2==l3 || l3==l1) {
                System.out.println("ISÓSCELES");
            } else /*if (l1!=l2 && l2!=l3)*/ {
                System.out.println("ESCALENO");
            }
        } else {
            System.out.println("Impossivel ser um triangulo");
        }
    }
}
