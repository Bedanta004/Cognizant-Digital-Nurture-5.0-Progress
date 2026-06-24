class Movie {
  private String title;
  private int duration;

  // Custom default constructor
  public Movie() {
    this.title = "Untitled";
    this.duration = 90;
  }
  public void displayDetails() {
    System.out.println("Title: " + title + ", Duration: " + duration + " mins");
  }
}

public class ParameterizedConstructor {
  public static void main(String[] args) {
    Movie movie = new Movie(); // Custom default constructor is called
    movie.displayDetails(); // Displays custom default values
  }
}