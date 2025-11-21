package edu.bhscs;

public class Cake {
  // fields and properties
  private String flavor;
  private String quality;
  private Flour flour;
  private String color;
  private int leg;
  int width;

  // constructor
  public Cake(String flavor, Flour flour, String quality, String color) {
    this.flavor = flavor;
    this.quality = quality;
    this.flour = flour;
    this.color = color;
  }

  // code needs serious refactoring becasue it is really bad and needs to improve as soon as possib

  // methods

  public String getFlavor() {
    return flavor;
  }

  public String getQuality() {
    return quality;
  }

  public String getColor() {
    color = flavor + " color";
    // if (flavor == "qwerty") {
    //  color = "this cake is not qwerty but instead vanilla and white color";
    // }
    return color;
  }

  private String candles = "";

  public void drawCake(int width, int height, int depth, int cakeOffset) {
    // cakeCandle(width, cQuantity);

    cakeHWD(width, height, depth, cakeOffset);
  }

  public void cakeCandle(int width, int cQuantity) {

    int spacing = width / cQuantity / 2;
    for (int k = 0; k < cQuantity; k++) {
      for (int p = 0; p < spacing; p++) {
        candles += " ";
        if (p == spacing - 1) {

          candles += "|";
        }
      }
    }
    System.out.println(candles);
  }

  public void cakeHWD(int width, int height, int depth, int cakeOffset) {

    // depth

    for (int d = 0; d < depth; d++) {
      for (int c = 0; c < cakeOffset - ((width / 2) + depth); c++) {
        System.out.print(" ");
      }
      for (int i = 0; i < depth - d - 1; i++) {
        System.out.print(" ");
      }
      System.out.print("/");
      for (int i = 0; i < width; i++) {
        System.out.print("^");
      }
      System.out.print(" ");
      for (int i = 0; i < d + 1; i++) {
        System.out.print("/");
      }
      System.out.println();
    }

    // width/height

    for (int h = 0; h < height; h++) {
      for (int c = 0; c < cakeOffset - ((width / 2) + depth); c++) {
        System.out.print(" ");
      }
      for (int i = 0; i < h; i++) {
        System.out.print(" ");
      }
      System.out.print("—");
      for (int i = 0; i < width; i++) {
        System.out.print("-");
      }
      for (int i = 0; i < depth - h && i >= 0; i++) {
        System.out.print("/");
      }
      System.out.println();
    }
  }

  public void drawTable(Table t, String legChar) {
    Table myTable = new Table(3, 20);
    // this.draw(t);
    int center = width / 2;
    leg = t.legs;
    int twidth = t.width;

    myTable.drawTable(leg, twidth, 6, center / 2, legChar);
  }

  public int centeringMath(Table t) {
    // MATH CHUNK OF CODE....
    int cakeWidth = this.width;
    int tableWidth = t.getWidth();
    int offset = (cakeWidth - tableWidth) / 2;
    int cakeOffset = 0;
    int tableOffset = 0;

    if (cakeWidth > tableWidth) {
      tableOffset = Math.abs(offset);
      cakeOffset = 0;
    } else {
      cakeOffset = Math.abs(offset);
      tableOffset = 0;
    }
    return cakeOffset;
  }

  public void draw(Table t, int width, int height, int cakeOffset, String legChar) {

    drawCake(width, height, height, cakeOffset);

    drawTable(t, legChar);
  }
}
