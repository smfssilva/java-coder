package Classe;

public class ProdutoTeste {
  public static void main(String[] args) {
    Produto p1 = new Produto("Notebook",4500,0.1);
//    p1.nome = "Notebook";
//    p1.preco = ;
//    p1.desconto = .1;
    System.out.printf("%.2f\n", p1.precoComDesconto());
    System.out.printf("%s Valor com desconto: R$ %.2f\n",p1.nome, p1.precoComDesconto(.1));
  }
}
