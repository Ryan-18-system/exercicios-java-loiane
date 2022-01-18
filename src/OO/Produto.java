package OO;

public class Produto {
    double desconto;
    double preco;
    String nome;

    double calcularDesconto(){
        return preco *(1-desconto);
    }
}
