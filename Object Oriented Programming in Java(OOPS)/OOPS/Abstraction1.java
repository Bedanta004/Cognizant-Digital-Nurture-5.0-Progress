class Dog {
  void makeSound() {
    System.out.println("Bark");
  }
  void sleep() {
    System.out.println("Sleeping...");
  }
}

class Cat {
  void makeSound() {
    System.out.println("Meow");
  }
  void sleep() {
    System.out.println("Sleeping...");
  }
}

public class Abstraction1 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.makeSound(); // Outputs: Bark
    dog.sleep(); // Outputs: Sleeping...
    Cat cat = new Cat();
    cat.makeSound(); // Outputs: Meow
    cat.sleep(); // Outputs: Sleeping...
  }
}