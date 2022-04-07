package lambdas;

@FunctionalInterface
public interface Calculo {
  double executar(double a, double b);

  static double subtrair(double a, double b) {
    return a - b;
  }
}
