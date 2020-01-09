package pets;

public class Dog {
  private String name;

  public Dog(String name) {
    this.name = new String(name);
  }

  public String getName() {
    return this.name;
  }

  public static String says() {
    return "woof";
  }
}
