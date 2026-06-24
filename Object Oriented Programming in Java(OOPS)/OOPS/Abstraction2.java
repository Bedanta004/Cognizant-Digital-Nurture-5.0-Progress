// Abstract Class Animal
abstract class Animal {
  // Abstract method for unique behaviors
  abstract void makeSound();
  // Concrete method for shared behaviors
  void sleep() {
    System.out.println("Sleeping...");
  }
}

// Specific implementation for Dog
class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Bark");
  }
}

// Specific implementation for Cat
class Cat extends Animal {
  @Override
  void makeSound() {
    System.out.println("Meow");
  }
}

public class Abstraction2 {
  public static void main(String[] args) {
    Animal myDog = new Dog(); // Treating Dog as an Animal
    myDog.makeSound(); // Outputs: Bark
    myDog.sleep(); // Outputs: Sleeping...
    Animal myCat = new Cat(); // Treating Cat as an Animal
    myCat.makeSound(); // Outputs: Meow
    myCat.sleep(); // Outputs: Sleeping...
  }
}