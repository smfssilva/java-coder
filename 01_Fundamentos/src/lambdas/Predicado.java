package lambdas;

import java.util.function.Predicate;

public class Predicado {
  public static void main(String[] args) {
    Predicate<Produto> caro =
            produto -> (produto.preco * (1 - produto.desconto)) >= 750.0;

    Produto produto = new Produto("Notebook", 3893.89, .15);
    System.out.println(caro.test(produto));
  }
}
