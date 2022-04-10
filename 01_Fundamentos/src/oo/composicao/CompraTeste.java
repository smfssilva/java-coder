package oo.composicao;

import java.util.Locale;

public class CompraTeste {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Locale.setDefault(Locale.US);
    Compra c1 = new Compra();
    System.out.printf("");
    System.out.println("");
    c1.cliente = "João Pedro";
    c1.items.add(new Item("Caneta", 20, 7.45));
    c1.items.add(new Item("Borracha", 12, 3.89));
    c1.items.add(new Item("Caderno", 3, 18.79));

    System.out.println(c1.items.size());

    System.out.printf("Total da compra R$ %.2f", c1.getValorTotal());
  }
}
