import pets.Cat;
import pets.Dog;

class PetStuff {
  public static void main(String[] args) {
    Cat c = new Cat("Hobbes");
    System.out.println("The cat's name is: " + c.getName());

    System.out.println("Cats say: " + Cat.says());

    Dog d = new Dog("Snoopy");
  }
}
