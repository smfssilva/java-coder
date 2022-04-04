package Classe;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data(24, 7, 1977);
//    d1.dia = 24;
//    d1.mes = 7;
//    d1.ano = 1977;

    var d2 = new Data();
//    d2.dia = 13;
//    d2.mes = 8;
//    d2.ano = 1979;

    System.out.printf("%d/%02d/%d\n", d1.dia, d1.mes, d1.ano);
    System.out.printf("%d/%02d/%d\n", d2.dia, d2.mes, d2.ano);

    System.out.println();
    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());

  }
}
