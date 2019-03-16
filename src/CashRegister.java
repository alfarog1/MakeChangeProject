import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		System.out.print("What is the price of the item? $");
		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();

		System.out.print("How much cash was tendered? $");
		double tendered = sc.nextDouble();

		int change = (int) ((tendered * 100) - (price * 100));
		double cambio = ((double) change) / 100;

		int bill10 = 1000;
		int bill5 = 500;
		int bill1 = 100;
		int coin25 = 25;
		int coin10 = 10;
		int coin5 = 5;
		int coin1 = 1;

		if (tendered < price) {
			System.out.println("Sorry you gave to little, need more cash. ");
		}
		if (tendered == price) {
			System.out.println("Thanks for the exact change. ");
		} else if (tendered > price) {

			System.out.println("Wait for your change of  $" + cambio);
			// After prompting for the user for price and tendered, giving change here on
			do {

				// make an if statement if over $20 was given if ()
				// Change for $10 bills
				if (change > bill10) {
					System.out.println("You get one $10 bill ");
				}
				// Change for $5 bills
				if (change - bill10 >= bill5) {
					System.out.println("You get one $5 bill");
				}

				// Change for $1 bills
				if (change < bill5 || change >= bill1) {

					// making change if more than $15

					if (change > (bill10 + bill5)) {
						change = ((change - (bill10 + bill5)) / 100);

						System.out.println("You get " + change + " $1 bill(s)");
					}
					// making change if less than $15 AND more than $10

					if (change < (bill10 + bill5) && change > bill10) {
						change = ((change - bill10) / 100);

						System.out.println("You get " + change + " $1 bill(s)");
					}

					// making change if less than $10 AND more than $1
					if (change < bill10 && change > bill1) {
						change = change / 100;

						System.out.println("You get " + change + " $1 bill(s)");
					}

				}
//				// Change for Coins
//				// change for quarters
					change = (int) ((tendered * 100) - (price * 100));
//				
				if (change >= coin25) {
					cambio = ((int) cambio) * 100;
					int coins = (int) cambio;
					change = change - coins;
					int quarters = change / coin25;
//					
					System.out.println("You get " + quarters + " quarter(s)" + change);
					
					if (change > coin25 && change < bill1 ) { 
						change = change - (coin25 * quarters);
						int dimes = change / coin10;
						System.out.println("You get " + dimes + " dimes");
					}
					}
					
					//if ()
					
					
					
					
//				if (change >= coin10) {
//					cambio = ((int) cambio) * 100;
//					System.out.println("cambio "+ cambio);
//					int coins = (int) cambio;
//					System.out.println("coins "+ coins);
//					change = change - coins;
//					System.out.println("change "+ change);
//					change = change / coin10;
//					
//					System.out.println("You get " + change + " quarter(s)");
//				}

			} while (change == 0);

//
//			do {
//
//
//			} while (change == 0);

		}

	}
}