package Classe;

public class AreaCirc {

  double raio;
  public static final double PI = 3.1415;

  public AreaCirc() {
  }

  public AreaCirc(double raio) {
    this.raio = raio;
  }

  double area() {
    return PI * Math.pow(raio, 2);
  }

  static double area(double raio) {
    return PI * Math.pow(raio, 2);
  }
}
