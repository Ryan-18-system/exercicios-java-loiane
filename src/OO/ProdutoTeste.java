package OO;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "ARROZ";
        produto1.preco = 6.80; 
        produto1.desconto = 0.20;
        System.out.println(produto1.calcularDesconto());
        

    }
}
