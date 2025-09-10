package lista3;

import java.util.Scanner;

public class AppEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escola aluno1 = new Escola();
        Escola aluno2 = new Escola();
        Escola aluno3 = new Escola();


        aluno1.setMatricula(200037714);
        aluno1.setNome("Luis Henrique");
        aluno1.setNotaPorva1(8.7);
        aluno1.setNotaProva2(7.2);
        aluno1.setNotaTrabalho(6.7);


        aluno1.mostrarResultado();


        aluno2.setMatricula(200014448);
        aluno2.setNome("Pedro Miguel");
        aluno2.setNotaPorva1(5.5);
        aluno2.setNotaProva2(7.0);
        aluno2.setNotaTrabalho(6.9);
        aluno2.mostrarResultado();


        aluno3.setMatricula(20005555);
        aluno3.setNome("Elder Macedo");
        aluno3.setNotaPorva1(1);
        aluno3.setNotaProva2(1);
        aluno3.setNotaTrabalho(0.15384169);
        aluno3.mostrarResultado();
    }

}
