package OO;

public class Produto {
    static double desconto = 0.25;
    double preco;
    String nome;

    double calcularDesconto(){
        return preco *(1-desconto);
    }

    public Produto(){};
    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

}
