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
public class Circulo {
    double r;
    Scanner sc = new Scanner(System.in);
    public Circulo() {
        System.out.println("Informe o raio: ");
        this.r = sc.nextDouble();
    }

    public void calcularArea(){
        System.out.printf("Área do circulo:                %.2f%n",Math.PI*Math.pow(this.r,2));}
    public void calcularPerimetro(){
        System.out.printf("Perímetro do círculo:           %.2f%n",2*Math.PI*this.r);}
}
