class Animal {
  public void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  @Override
  public void sound() {
    System.out.println("Cat meows");
  }
}

// Not supported in Java
public class HybridAnimal extends Dog, Cat {
  public static void main(String[] args) {
    HybridAnimal hybrid = new HybridAnimal();
    hybrid.sound(); // Creates ambiguity: Should it call Dog's sound() or Cat's
                    // sound()?
  }
}
