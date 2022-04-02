package fundamentos;

public class Temperatura {

  public static void main(String[] args) {
    System.out.println();
    // (F - 32) * 5/9 = C
    final double AJUSTE = 32;
    final double FATOR = 5/9.0;
    double fireheight = 86;
    double c = (fireheight - AJUSTE) * FATOR;
    System.out.printf("O resultado e: %.2fºC\n", c);
    fireheight = 150;
    c = (fireheight - AJUSTE) * FATOR;
    System.out.printf("O resultado e: %.2fºC\n", c);
    System.out.println();

  }
}
