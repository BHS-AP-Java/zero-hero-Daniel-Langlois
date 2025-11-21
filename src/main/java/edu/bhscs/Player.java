package edu.bhscs;

import java.util.Scanner;

public class Player {
  // fields and properties
  private Scanner scanner;
  int accomplishments;
  public String question2 = "how wide is your cake?";
  public String question3 = "how tall is your cake?";

  // Constructor
  public Player(Scanner scanner) {
    this.scanner = scanner;
  }

  // Methods
  public void accomplish(int amount) {
    this.accomplishments += amount;
  }
  ;

  public String giveAnswer(String question) {
    System.out.println(question);
    return scanner.nextLine();
  }

  public String getCakeData() {
    System.out.println(question2);
    String width = scanner.nextLine();
    return width;
  }

  public String getCakeData2() {
    System.out.println(question3);
    String height = scanner.nextLine();
    return height;
  }
}
