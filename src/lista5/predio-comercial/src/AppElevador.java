public class AppElevador {
//    2) Crie um projeto denominado prédio comercial que importe o arquivo jar criado na questão
//    anterior. O projeto deve ter uma classe AppElevador que crie um objeto ‘Elevador’ que deve
//    estar no térreo (andar 0). O elevador deve subir, andar a andar, até o último andar do prédio
//    e depois descer até o Térreo de volta. A cada andar devem ser sorteadas a quantidade de
//    pessoas que entram e a quantidade de pessoas que descem do elevador e em seguida partir
//    para o andar seguinte. Antes de partir para o próximo andar deve ser informado quantas
//    pessoas saíram, quantas entraram e o total de pessoas no elevador.
    public static void main(String args[]) {
        Elevador elevador = new Elevador(10,5);
        int qtdeAndares = elevador.getTotalAndar();
        int aux = 0;
        /**
         * Possibilita o elevador subir, sair pessoas e entrar pessoas.
         */
        for (int i = 0; i <= qtdeAndares; i++) {

            if (aux>0) {
                elevador.sai();
            }aux++;
            elevador.entra();
            elevador.sobe();

        }
        /**
         * Possibilita o elevador descer, sair pessoas e entrar pessoas.
         */
        for (int i = qtdeAndares; i >=0 ; i--) {
            elevador.sai();
            elevador.entra();
            elevador.desce();
        }
        int qtdeEntrar = elevador.getQtdeEntrar();
        int qtdeSair = elevador.getQtdeSair();
        int qtdePessoa = elevador.getQtdePessoas();
        System.out.println("Quantidade de pessoas que entraram: "+qtdeEntrar);
        System.out.println("Quantidade de pessoas que saíram: "+qtdeSair);
        System.out.println("Quantidade de pessoa que estão no elevador: "+qtdePessoa);
    }
}
