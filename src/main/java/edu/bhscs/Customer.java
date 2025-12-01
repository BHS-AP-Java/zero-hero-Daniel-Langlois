package edu.bhscs;

// fields and properties
public class Customer {
  private int money = 20;
  private Player p;

  // constructor
  public Customer(Player p) {
    this.p = p;
  }

  // methods
  public int pay(int price) {
    if (money >= price) {
      money -= price;
      System.out.println("The customer paid $" + price);
      return price;
    } else {
      System.out.println("Customer is too broke to buy cake ;-;");
      return money;
    }
  }

  public void takeCake(Cake cake) {
    System.out.println(
        "Customer received a "
            + cake.getFlavor()
            + " cake that is "
            + cake.getQuality()
            + " quality and "
            + cake.getColor());
  }

  public Player getPlayer() {
    return this.p;
  }
}
