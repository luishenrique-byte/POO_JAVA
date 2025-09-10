package lista3;

public class ProgressaoAritmetica {
// Implemente uma classe chamada ProgressaoAritmetica que possui três atributos
// (primeiroTermo, razao, termoAtual) e um método chamado proximoTermo que
// devolve o termo atual para quem chamou e calcula o próximo termo atualizando o
// termoAtual. A classe deverá ter um método construtor que receba o valor do primeiro
// termo e a razão e instancie o objeto com esses valores. Em seguida crie uma aplicação
// que instancie um objeto da classe implementada, e mostre na tela os n primeiros
// termos da progressão, sendo n definido pelo usuário. Em seguida a aplicação deve
// reinicializar o objeto estabelecendo novos valores para o primeiro termo e a razão
// (Deves ser usados os getters e setters para fazer isso).
    private int primeiroTermo ;
    private int razao;
    private int termoAtual;



    public ProgressaoAritmetica(int primeiroTermo, int razao){
        this.primeiroTermo = primeiroTermo;
        this.razao = razao;
        this.termoAtual = this.primeiroTermo;
    }


    public int proximoTermo(){
        return this.termoAtual += this.razao;
    }




    public int getPrimeiroTermo() {
        return primeiroTermo;
    }
    public void setPrimeiroTermo(int n){
        this.primeiroTermo = n;
    }




    public int getRazao(){
        return this.razao;
    }
    public void setRazao(int r){
        this.razao = r;
    }


    public int getTermoAtual(){
        return this.termoAtual;
    }
    public void setTermoAtual(int t){
        this.termoAtual = t;
    }




    public void mostrarNumerosPA(int qtde){
        System.out.print(this.primeiroTermo + "  -  ");
        for(int i = 1; i<qtde; i++){
            System.out.print(proximoTermo()+ "  -  ");
        }
        System.out.println();
    }


    public void status(){
        System.out.println("1º Termo = " + getPrimeiroTermo());
        System.out.println("Razão: " + getRazao());
        System.out.println("Termo Atual: " + getTermoAtual());
    }


}

