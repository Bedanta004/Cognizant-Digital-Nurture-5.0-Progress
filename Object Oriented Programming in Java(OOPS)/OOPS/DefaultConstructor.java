class Movie {
  private String title;
  private int duration;

  public void displayDetails() {
    System.out.println("Title: " + title + ", Duration: " + duration + " mins");
  }
}

public class DefaultConstructor {
  public static void main(String[] args) {
    Movie movie = new Movie(); // Implicit default constructor is called
    movie.displayDetails(); // Displays default values
  }
}