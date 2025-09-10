package lista2;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario pessoa01 = new Funcionario();
        Funcionario pessoa02 = new Funcionario();
        Funcionario pessoa03 = new Funcionario();
        Funcionario pessoa04 = new Funcionario();
        Funcionario pessoa05 = new Funcionario();


        pessoa01.nome = "Maria";
        pessoa01.funcao = "Analista";
        pessoa01.salario = 5000;


        pessoa02.nome = "João";
        pessoa02.funcao = "Engenheiro";
        pessoa02.salario = 8000;


        pessoa03.nome = "Arthur";
        pessoa03.funcao = "Gerente";
        pessoa03.salario = 10000;


        pessoa04.nome = "Luís";
        pessoa04.funcao = "Suporte";
        pessoa04.salario = 2000;


        pessoa05.nome = "Pedro";
        pessoa05.funcao = "Dev";
        pessoa05.salario = 4000;


        pessoa01.ajustaSalario();
        pessoa02.ajustaSalario();
        pessoa03.ajustaSalario();
        pessoa04.ajustaSalario();
        pessoa05.ajustaSalario();
    }

}
