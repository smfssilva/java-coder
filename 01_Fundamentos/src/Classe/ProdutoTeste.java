package Classe;

public class ProdutoTeste {
  public static void main(String[] args) {
    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 4500;
    p1.desconto = .1;
    System.out.printf("%.2f\n", p1.precoComDesconto());
    System.out.printf("Valor com desconto: R$ %.2f\n", p1.precoComDesconto(.1));
  }
}
