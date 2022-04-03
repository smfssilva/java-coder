package fundamentos;

public class PrimitivoVsObjeto {

  public static void main(String[] args) {

    String s = new String("Texto");
    s.toUpperCase();

    //Wrappers é a versao objeto dos tipos
    int a = 123;
    System.out.println(a);
  }
}
