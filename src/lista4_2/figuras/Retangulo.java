package lista4_2.figuras;

import java.util.Scanner;

//1) Implemente, em Java, as classes Círculo e Retângulo.
//A classe Círculo deve conter como atributos as coordenadas x e y do centro e o tamanho do
//raio. A classe Retângulo deve ter as coordenadas x e y do canto superior esquerdo, a largura e a
//altura.
//Devem ser implementados para as classes os métodos para calcular o perímetro e a área.
//Estas duas classes devem ser colocadas dentro de um mesmo pacote denominado figuras.
//        Em seguida, num outro pacote denominado aplicações, deve ser implementada uma aplicação
//que instancie um objeto de cada classe do pacote figuras e mostre na tela o perímetro e a área
//de cada um.
//        Obs.:
//Perímetro do círculo = 2πr
//Área do círculo = πr
//2
//Perímetro do retângulo = 2altura + 2largura
//Área do retângulo – altura.largura
public class Retangulo {
    private double largura, altura;
    Scanner sc = new Scanner(System.in);
    public Retangulo() {
        System.out.println("Informe largura:");
        this.largura = sc.nextDouble();
        System.out.println("Informe a altura");
        this.altura = sc.nextDouble();
    }

    public void calcularArea(){
        System.out.printf("Área do rentângulo:             %.2f%n",this.altura*this.largura);
    }

    public void calcularPerimetro(){
        System.out.printf("Perímetro retângulo:            %.2f%n",(this.altura*2)+(this.largura*2));
    }
}
