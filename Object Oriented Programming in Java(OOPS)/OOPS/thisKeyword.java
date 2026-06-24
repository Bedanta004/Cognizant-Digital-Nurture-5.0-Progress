class Person {
  private String name;

  // Constructor
  Person(String name) {
    this.name =
        name; // Resolves conflict between instance variable and parameter
  }
  void display() {
    System.out.println("Name: " + this.name);
  }
}

public class thisKeyword {
  public static void main(String[] args) {
    Person p = new Person("Alice");
    p.display();
  }
}