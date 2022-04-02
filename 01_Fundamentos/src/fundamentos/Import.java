package fundamentos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Import {

  public static void main(String[] args) {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String s = "Bom dia!";
    System.out.println(s);

    Date d = new Date();
    System.out.println(sdf.format(d));
  }
}
