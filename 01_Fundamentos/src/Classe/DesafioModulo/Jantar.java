package Classe.DesafioModulo;

public class Jantar {
  public static void main(String[] args) {

    Comida c1 = new Comida("Arroz", 0.233);
    Comida c2 = new Comida("Feijao", 0.300);

    Pessoa p1 = new Pessoa("Silva", 74.0);
    System.out.printf("Nome: %s peso: %.3fKg\n", p1.nome, p1.peso);

    p1.comer(c1);
    p1.comer(c2);
    System.out.printf("Nome: %s peso: %.3fKg\n", p1.nome, p1.peso);

  }
}
