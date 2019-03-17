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
			System.out.println("Sorry you gave too little, need more cash. ");
		}
		if (tendered == price) {
			System.out.println("Thanks for the exact change. ");
		} else if (tendered > price) {

			System.out.println("Wait for your change of  $" + cambio);
			// After prompting for the user for price and tendered, giving change here on
			do {

				// Use How many $10 bills will you get?
				// Change for $10 bills
				if (change > bill10) {
					System.out.println("You get one $10 bill ");
				}
				// Use How many $5 bills will you get?
				// Change for $5 bills
				if (change - bill10 >= bill5) {
					System.out.println("You get one $5 bill");
				}
				// Use How many $1 bills will you get?
				// Change for $1 bills
				if (change < bill5 || change >= bill1) {

					// making change if more than $15. How many $1 bills will you get?

					if (change > (bill10 + bill5)) {
						int dollars = ((change - (bill10 + bill5)) / 100);
						change = change - (bill10 + bill5 + (dollars * 100));
						System.out.println("You get " + dollars + " $1 bill(s) A");

						if (change >= coin25) {
							int quarters = change % coin25;
							quarters = (change - quarters) / coin25;
							change = change - (quarters * coin25);
							System.out.println("You get " + quarters + " quarter(s) ");

							if (change >= coin10) {
								int dimes = change % coin10;
								dimes = (change - dimes) / coin10;
								change = change - (dimes * coin10);
								System.out.println("You get " + dimes + " dime(s) ");

								if (change >= coin5) {
									int nickels = change % coin5;
									nickels = (change - nickels) / coin5;
									change = change - (nickels * coin5);
									System.out.println("You get " + nickels + " nickel ");
									System.out.println("You get " + change + " penny(ies) ");

								}
							}
						}
								if (change < coin5 && change > 0) {
									int nickels = change % coin5;
									nickels = (change - nickels) / coin5;
									change = change - (nickels * coin5);
									System.out.println("You get " + nickels + " nickel ");
									System.out.println("You get " + change + " penny(ies) ");
						}
					}

					if (change > bill10 && change < (bill10 + bill5)) {
						int dollars = (change - bill10) / 100;
						change = change - (bill10 + (dollars * 100));
						System.out.println("You get " + dollars + " $1 bill(s) B");

						if (change >= coin25) {
							int quarters = change % coin25;
							quarters = (change - quarters) / coin25;
							change = change - (quarters * coin25);
							System.out.println("You get " + quarters + " quarter(s) ");

							if (change >= coin10) {
								int dimes = change % coin10;
								dimes = (change - dimes) / coin10;
								change = change - (dimes * coin10);
								System.out.println("You get " + dimes + " dime(s) ");

								if (change >= coin5) {
									int nickels = change % coin5;
									nickels = (change - nickels) / coin5;
									change = change - (nickels * coin5);
									System.out.println("You get " + nickels + " nickels ");
									System.out.println("You get " + change + " penny(ies) ");
								}
							}
							if (change >= coin5) {
								int nickels = change % coin5;
								nickels = (change - nickels) / coin5;
								change = change - (nickels * coin5);
								System.out.println("You get " + nickels + " nickel ");
								System.out.println("You get " + change + " penny(ies) ");

							}
						}

					}

				if (change > bill10 && change < (bill10 + bill5)) {
					int dollars = (change - bill10) / 100;
					change = change - (bill10 + (dollars * 100));
					System.out.println("You get " + dollars + " $1 bill(s) C");

					if (change >= coin25) {
						int quarters = change % coin25;
						quarters = (change - quarters) / coin25;
						change = change - (quarters * coin25);
						System.out.println("You get " + quarters + " quarter(s) ");

						if (change >= coin10) {
							int dimes = change % coin10;
							dimes = (change - dimes) / coin10;
							change = change - (dimes * coin10);
							System.out.println("You get " + dimes + " dime(s) ");

							if (change >= coin5) {
								int nickels = change % coin5;
								nickels = (change - nickels) / coin5;
								change = change - (nickels * coin5);
								System.out.println("You get " + nickels + " nickel ");
								System.out.println("You get " + change + " penny(ies) ");
							}
						}
						if (change >= coin5) {
							int nickels = change % coin5;
							nickels = (change - nickels) / coin5;
							change = change - (nickels * coin5);
							System.out.println("You get " + nickels + " nickel ");
							System.out.println("You get " + change + " penny(ies)  ");

						}

					}
				}

				if (change < bill10 && change > 0) {
					int dollars = change / 100;
					change = change - (dollars * 100);
					System.out.println("You get " + dollars + " $1 bill(s) D");

					if (change >= coin25) {
						int quarters = change % coin25;
						quarters = (change - quarters) / coin25;
						change = change - (quarters * coin25);
						System.out.println("You get " + quarters + " quarter(s) ");

						if (change >= coin10) {
							int dimes = change % coin10;
							dimes = (change - dimes) / coin10;
							change = change - (dimes * coin10);
							System.out.println("You get " + dimes + " dime(s) ");

							if (change >= coin5) {
								int nickels = change % coin5;
								nickels = (change - nickels) / coin5;
								change = change - (nickels * coin5);
								System.out.println("You get " + nickels + " nickel ");
								System.out.println("You get " + change + " penny(ies) ");
							}
						}
					}
						if (change >= coin5) {
							int nickels = change % coin5;
							nickels = (change - nickels) / coin5;
							change = change - (nickels * coin5);
							System.out.println("You get " + nickels + " nickel  " );
							System.out.println("You get " + change + " penny(ies) ");

						}
				}

				}
			} while (change == 0);
		}
	}
}
