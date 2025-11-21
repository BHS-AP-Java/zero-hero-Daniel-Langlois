package edu.bhscs;

public class Table {
  /*make a table with legs that can be spaced apart and can but doesnt necessarily have to be centered on a potential cake
  fields and properties*/
  int legs;
  int width;
  String legChar = "";
  String spaces = "|";

  // constructor
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
  }

  // methods
  public String setLegChar(String input) {
    legChar = input;
    System.out.println(legChar);
    return legChar;
  }

  public void drawTable(int legs, int width, int legHeight, int center, String legChar) {

    for (int c = 0; c < center; c++) {
      System.out.print(" ");
    }
    for (int w = 0; w < width; w++) {
      System.out.print("=");
    }
    System.out.println();
    for (int c = 0; c < center; c++) {

      String space = " ";
      spaces = spaces.concat(space);
    }
    for (int h = 0; h < legHeight; h++) {
      int centerCopy = center;
      for (int w = 0; w < width; w++) {
        for (int i = 0; i < legs; i++) {
          int legX = (int) Math.round(i * (width - 1.0) / (legs - 1));
          if (w == legX) {
            for (int c = 0; c < centerCopy; c++) {
              System.out.print(spaces);
              centerCopy = 0;
            }
            System.out.print(legChar);
            break;
          }
          if (i == legs - 1) {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

  public int getWidth() {
    return this.width;
  }
}
