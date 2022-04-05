package colecoes;

import java.util.ArrayList;

public class Lista {
  public static void main(String[] args) {

    ArrayList<Usuarios> lista = new ArrayList<>();

    lista.add(new Usuarios("Sivanilson"));
    lista.add(new Usuarios("Carlos"));
    lista.add(new Usuarios("Nina"));
    lista.add(new Usuarios("Manu"));

    System.out.println(lista.get(0));
    lista.remove(3);
    lista.remove(new Usuarios("Nina"));

    for (Usuarios u: lista) {
      System.out.println(u);
    }
  }
}
