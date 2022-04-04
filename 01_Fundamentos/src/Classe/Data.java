package Classe;

public class Data {
  int dia;
  int mes;
  int ano;

  String obterDataFormatada(){
    return String.format("%02d/%02d/%d", dia, mes, ano);
  }

}
