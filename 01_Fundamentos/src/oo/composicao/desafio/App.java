package oo.composicao.desafio;

public class App {

  public static void main(String[] args) {

    Cliente cliente = new Cliente("Maria");

    Produto p1 = new Produto("Notebook", 1450.0);
    Produto p2 = new Produto("Impressora", 345.0);
    Produto p3 = new Produto("Mouse USB", 25.0);


    Compra compra1 = new Compra();
    compra1.adicionarItem(new Produto("Nega maluca de 5", 10.0), 10);
    compra1.adicionarItem(new Produto("Africana P", 15.0), 10);
    compra1.adicionarItem(new Produto("Africana M", 30.0), 5);
    compra1.itens.add(new Item(new Produto("Pilao G", 40.0), 2));

    cliente.compras.add(compra1);

    System.out.println(cliente.obterValorTotal());

    Cliente cliente1 = new Cliente("Sivanilson");

    Compra compra2 = new Compra();
    compra2.itens.add(new Item(p1, 1));
    compra2.itens.add(new Item(p2, 1));
    compra2.itens.add(new Item(p3, 1));

    cliente1.compras.add(compra2);
    System.out.println("Cliente: " + cliente1.nome);
    System.out.println();
    System.out.println("ITENS:");
    System.out.println();
    for (Item item : compra2.itens) {
      System.out.printf("%s - %.2f\n", item.produto.nome, item.produto.preco);
    }
    System.out.println();
    System.out.printf("Total da compra R$ %.2f\n", cliente1.obterValorTotal());

  }
}
