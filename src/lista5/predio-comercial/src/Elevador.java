import java.util.Random;

//package lista5.predio-comercial;
//1) Crie uma classe denominada Elevador para armazenar as informações de um elevador
//dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no
//prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
//presentes nele.
//A classe deve também disponibilizar os seguintes métodos:
//        • construtor: que deve receber como parâmetros a capacidade do elevador e o total
//de andares no prédio (os elevadores sempre começam no térreo e vazio);
//• entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
//        houver espaço);
//• sai: para remover uma pessoa do elevador (só deve remover se houver alguém
//        dentro dele);
//• sobe: para subir um andar (não deve subir se já estiver no último andar);
//• desce: para descer um andar (não deve descer se já estiver no térreo);
// Encapsular todos os atributos da classe (criar os métodos set e get).
//Crie o javadocs do projeto e em seguida crie um arquivo jar.
public class Elevador {
    /**
     * Variável que armazena o andar atual em que o elevador está (inicialmente atribuída a 0 (Térreo)).
     */
    private int andarAtual = 0;
    /**
     * Variável que armazena a quantidade total de andares do prédio, incluindo o Térreo.
     */
    private int totalAndar;
    /**
     * Variável que armazena a quantidade máxima de pessoas que podem estar mutualmente no elevador.
     */
    private int capacidade;
    /**
     * Variável que armazena a quantidade de pessoas que estão no elevador.
     */
    private int qtdePessoas = 0;
    /**
     * Variável que armazena a quantidade total de pessoas que entraram no elevador.
     */
    private int qtdeEntrar;
    /**
     * Variável que armazena a quantidade total de pessoas que saíram do elevador.
     */
    private int qtdeSair;
    /**
     * Variável auxilixar para sortear o número de pessoas que podem sair ou entrar do elevador.
     */
    private int sorteio;
    Random rd = new Random();

    /**
     * Método construtor que recebe como parametro a capacidade total de pessoas
     * e a quantidade total de andares no prédio.
     * @param capacidade
     * @param totalAndar
     */
    public Elevador(int capacidade, int totalAndar) {
        this.capacidade = capacidade;
        this.totalAndar = totalAndar;
    }

    /**
     * Método que permite pessoas entrarem no elevador se, somente se, a capacidade de pessoas não tenha sido alcançada, através de um Random que sorteia de 0 a quantidade ainda permitida no elevador.
     */
    public void entra(){

        if (qtdePessoas<capacidade){
            sorteio = rd.nextInt(0,capacidade-qtdePessoas);
            qtdePessoas += sorteio;
            qtdeEntrar += sorteio;
            sorteio = 0;
        } else {
            System.out.println("Não há espaço para mais gente!");
        }

    }

    /**
     * Método que permite pessoas saírem do elevador se, somente se, houve alguém no elevador, através de um Random que sorteia de 0 a quantidade de pessoas que estão no elevador.
     */
    public void sai(){
        if (qtdePessoas>0){
            sorteio = rd.nextInt(0,qtdePessoas);
            qtdePessoas-=sorteio;
            qtdeSair += sorteio;
            sorteio=0;
        } else {
            System.out.println("Não há pessoas para sair!");
        }
    }

    /**
     * Método que permite o elevador subir de andar se, somente se, não estiver no último andar.
     */
    public void sobe(){
        if (andarAtual<totalAndar){
            andarAtual++;
        }
    }

    /**
     * Método que permite o elevador descer se, somente se, não estiver no andar 0 (Térreo).
     */
    public void desce(){
        if (andarAtual>0){
            andarAtual--;
        }
    }

    /**
     * Método get que retorna o valor da variável andarAtual.
     * @return
     */
    public int getAndarAtual() {
        return andarAtual;
    }

    /**
     * Método set que permite atribui um valor a variável andarAtual.
     * @param andarAtual
     */
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    /**
     * Método get que retorna o valor da variável totalAndar.
     * @return
     */
    public int getTotalAndar() {
        return totalAndar;
    }

    /**
     * Método set que permite atribuir um valor a variável totalAndar.
     * @param totalAndar
     */
    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    /**
     * Método get que retorna o valor da variável capacidade.
     * @return
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Método set que permite atribuir um valor a variável capacidade.
     * @param capacidade
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Método get que retorna o valor da variável qtdePessoas.
     * @return
     */
    public int getQtdePessoas() {
        return qtdePessoas;
    }

    /**
     * Método set que permite atribuir um valor a variével qtdePessoas.
     * @param qtdePessoas
     */
    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    /**
     * Método get que retorna o valor da variável qtdeEntrar.
     * @return
     */
    public int getQtdeEntrar() {
        return qtdeEntrar;
    }

    /**
     * Método set que permite atribuir um valor a variével qtdeEntrar.
     * @param qtdeEntrar
     */
    public void setQtdeEntrar(int qtdeEntrar) {
        this.qtdeEntrar = qtdeEntrar;
    }

    /**
     * Método get que retorna o valor da variável qtdeSair.
     * @return
     */
    public int getQtdeSair() {
        return qtdeSair;
    }

    /**
     * Método set que permite atribuir um valor a variével qtdeSair.
     * @param qtdeSair
     */
    public void setQtdeSair(int qtdeSair) {
        this.qtdeSair = qtdeSair;
    }
}