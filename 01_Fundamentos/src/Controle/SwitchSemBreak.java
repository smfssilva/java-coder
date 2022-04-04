package Controle;

public class SwitchSemBreak {
  public static void main(String[] args) {
    String faixa = "preta";

    switch (faixa.toLowerCase()) {
      case "preta":
        System.out.println("Sei o Bassai-Dai...");
      case "marroma":
        System.out.println("Sei o Takki Shodan...");
      case "roxa":
        System.out.println("Sei o Heian Yodan...");
      case "verde":
        System.out.println("Sei o Heian Sandan...");
      case "laranja":
        System.out.println("Sei o Heian Nidan...");
      case "vermelha":
        System.out.println("Sei o Heian Shodan...");
    }
  }
}
