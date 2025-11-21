package edu.bhscs;

public class PTSA {
  private int totalDonations = 0;

  public void receiveDonation(int amount) {
    totalDonations += amount;
    System.out.println("baker donated " + amount + ". ptsa now has: $" + totalDonations);
  }
}
