package Classe.DesafioModulo;

public class Pessoa {

  String nome;
  Double peso;

  public Pessoa() {
  }

  public Pessoa(String nome, Double peso) {
    this.nome = nome;
    this.peso = peso;
  }

  void comer(Comida comida) {
    if (comida!=null){
      peso += comida.peso;
    }
  }
}
