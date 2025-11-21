package edu.bhscs;

public class Baker {

  Player p;
  Flour f;
  Store placeOfWork;
  int skill;
  int cash;
  String name;
  String quality;
  String color;

  // constructor
  public Baker(String name) {
    this.name = name;
  }

  Baker(String name, Player p) {
    this.name = name;
    this.p = p;
  }

  // methods

  public void learn(int amount) {
    this.skill += amount;
  }

  public String translateSkill() {
    if (skill >= 7) {
      quality = "good";
    } else {
      quality = "okay";
    }
    if (skill <= 4) {
      quality = "bad";
    }
    return quality;
  }

  public Cake bakes(int age, String name) {
    return new Cake("Flavor", this.f, quality, "Color");
  }

  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("What cake do you want?");
    return new Cake(answer, this.f, quality, color);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    } else {
      System.out.println(
          name
              + " does not want to work at the bakery, oh well, a customer is still buying a cake");
    }
  }

  void donateToPTSA(PTSA ptsa, int amount) {
    if (amount <= cash) {
      cash -= amount;
      ptsa.receiveDonation(amount);
    } else {
      System.out.println("to broke to donate ;-;");
    }
  }
}
