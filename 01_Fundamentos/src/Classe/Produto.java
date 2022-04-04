package Classe;

public class Produto {
  String nome;
  double preco;
  public static double desconto = 0.25;

  public Produto() {
  }

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  double precoComDesconto() {
    return preco * (1 - desconto);
  }

  double precoComDesconto(double descontoDoGerente) {
    return preco * (1 - (desconto + descontoDoGerente));
  }
}
