class Person {
  private String name;
  private int age;

  // Constructor 1
  Person(String name) {
    this(name, 0); // Calls Constructor 2
  }

  // Constructor 2
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

public class ConstructorChaining {
  public static void main(String[] args) {
    Person p = new Person("Alice");
    p.display();
  }
}