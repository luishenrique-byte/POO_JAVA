package lista4_2.aplicacoes;

import lista4_2.figuras.Circulo;
import lista4_2.figuras.Retangulo;

public class AppGeometria {
    public static void main(String[] args) {
        Retangulo retan = new Retangulo();
        Circulo circ = new Circulo();

        circ.calcularArea();
        circ.calcularPerimetro();
        retan.calcularArea();
        retan.calcularPerimetro();
    }
}
