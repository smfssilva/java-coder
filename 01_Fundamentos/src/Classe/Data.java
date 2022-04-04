package Classe;

public class Data {
  int dia;
  int mes;
  int ano;

  public Data() {
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  String obterDataFormatada(){
    return String.format("%02d/%02d/%d", dia, mes, ano);
  }

}
