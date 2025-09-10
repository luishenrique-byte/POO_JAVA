package lista1;

import java.util.Scanner;

public class Questao05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if(idade<=15) {
            System.out.println("Sem permissão para votar ");
        }else if((idade>15 && idade <18) || idade >=65) {
            System.out.println(" Voto facultativo");
        }else if(idade >=18 && idade<=64) {
            System.out.println("Voto obrigatório ");
        }

    }
}
