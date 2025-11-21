package edu.bhscs;

public class App {
  public static void main(String[] args) {
    /*
    Flour f = new Flour("Good");

    Scanner scanner = new Scanner(System.in);
    Cake myCake = new Cake("",f,"string","string");
    Player player = new Player(scanner);
    String data;
    String data2;
    data = player.getCakeData();
    int width = Integer.parseInt(data);
    data2 = player.getCakeData2();
    int height = Integer.parseInt(data2);
    myCake.draw(width, height, height);
    */
    date10_27();
    // Cake myCake = new Cake("", f, "", "");
    // myCake.draw(20, 5, 5);

    // Hello world
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(5, 100);
    Cake bDay = bob.bakes(5, "Suzzie");
    String legChar = t.setLegChar("k");
    int cakeOffset = bDay.centeringMath(t);
    int width = 20;
    bDay.draw(t, width, width / 2, cakeOffset, legChar);
  }
}
