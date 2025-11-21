// Daniel Langlois
// BHSCSA Period 2
// Desc
// Draws a cake and simulates a customer buying a cake based on changing variables.

package edu.bhscs;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Player player = new Player(scanner);
    Customer customer = new Customer(player);
    Bakery bakery = new Bakery("My bakery");
    PTSA ptsa = new PTSA();

    Flour flour = new Flour("the best flower ever");
    Cake myCake = new Cake("Str", flour, "str", "str");
    Baker baker = new Baker("User", player);
    String data;
    String data2;
    data = player.getCakeData();
    int width = Integer.parseInt(data);
    baker.f = flour;
    data2 = player.getCakeData2();
    int height = Integer.parseInt(data2);
    int bakerSkill = (int) (Math.random() * 10);
    baker.learn(bakerSkill);
    baker.translateSkill();
    baker.takeJob(bakery);
    baker.takeOrder(10, customer);
    myCake.drawCake(width, height, height, width / 2);
    baker.donateToPTSA(ptsa, 10);

    scanner.close();
  }
}
