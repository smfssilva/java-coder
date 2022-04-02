package fundamentos;

public class TipoString {

  public static void main(String[] args) {
    System.out.println();

    System.out.println("Olá pessoal".charAt(0));

    String s = "Boa tarde";
    s = s.toUpperCase();
    System.out.println(s);
    System.out.println(s.startsWith("BOA"));
    System.out.println(s.toLowerCase().endsWith("tarde"));

    System.out.println();
  }
}
