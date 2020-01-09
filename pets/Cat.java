package pets;

public class Cat {
  private static final int INIT_NUM_LIVES = 9;
  private String name;

  public Cat(String name) {
    this.name = new String(name);
  }

  public String getName() {
    return this.name;
  }

  public static String says() {
    return "meow";
  }
}
