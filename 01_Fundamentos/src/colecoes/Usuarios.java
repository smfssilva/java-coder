package colecoes;

import java.util.Objects;

public class Usuarios {
  String nome;

  public Usuarios(String nome) {
    this.nome = nome;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Usuarios)) return false;
    Usuarios usuarios = (Usuarios) o;
    return Objects.equals(nome, usuarios.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }

  @Override
  public String toString() {
    return "Meu nome é: "+nome;

  }
}
