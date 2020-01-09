import java.time.LocalDateTime;

public class JavaClassStuff {
  public static void main(String[] args) {
    // Object o = new Cat("Hobbes");

    String s = new String("Something");
    System.out.println("s.length(): " + s.length());

    if (s == "Something") {
      System.out.println("s == Something");
    }

    if (s.equals("Something")) {
      System.out.println("s equals Something");
    }

    int i = Integer.parseInt("16");
    System.out.println("i: " + i);

    double pi = Double.parseDouble("3.1415");
    String piStr = String.valueOf(3.1415);

    System.out.println("The time is now: " + LocalDateTime.now());
  }
}
