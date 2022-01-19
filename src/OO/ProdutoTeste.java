package OO;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "ARROZ";
        produto1.preco = 6.80;
        System.out.println(produto1.calcularDesconto());
        Produto.desconto = 0.29;
        Produto produto2 = new Produto(10.80, "Feijão");
        System.out.println((produto2.calcularDesconto()));

        

    }
}
