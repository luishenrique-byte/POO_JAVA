package lista2;

public class Funcionario {
    String nome, funcao;
    double salario = 0;


    public double ajustaSalario() {
        this.salario *= 0.05;
        mostrarDados();
        return salario;
    }
    public void mostrarDados(){
        System.out.println("Nome: " +nome);
        System.out.println("Função: " + funcao);
        System.out.println("Salário: " + salario);
        System.out.println("---------------------");
    }
}

