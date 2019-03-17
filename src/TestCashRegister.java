
public class TestCashRegister {

}
//// Change for Coins
//// change for quarters
change = (int) ((tendered * 100) - (price * 100));
//

// More than or equal to a quarter
if (change >= coin25) {
	cambio = ((int) cambio) * 100;
	int coins = (int) cambio;
	change = change - coins;
	int quarters = change / coin25;
//	
	System.out.println("You get " + quarters + " quarter(s) J" + change);

	if (change > coin25 && change < bill1) {
		// pasted here
		change = change - (coin25 * quarters);
		int dimes = change / coin10;
		System.out.println("You get " + dimes + " dime(s) " + change + "x");

		/* Pasted here */ if (change < coin10 && change > 0) {

			change = change - (coin10 * dimes);

			int nickels = change / coin5;

			System.out.println("You get " + nickels + " nickels ");

			if (change > coin5) {
				change = change - (coin5);

				System.out.println("You get " + change + " penny(ies) ");

			}
//LEFT OFF here looking for 
		}
	}

	if (change < coin25 && change > 0) {
		cambio = ((int) cambio) * 100;
		coins = (int) cambio;
		change = change - coins;
		quarters = change / coin25;
//	
		System.out.println("You get " + quarters + " quarter(s) k" + change);
	}
}
// Change for dimes
// more than a quarter AND less than a dollar
if (change > coin25 && change < bill1) {
	change = change - (coin25 * quarters);
	int dimes = change / coin10;
	System.out.println("You get " + dimes + " dime(s) " + change + "x");

	/* Pasted here */ if (change < coin10 && change > 0) {

		change = change - (coin10 * dimes);

		int nickels = change / coin5;

		System.out.println("You get " + nickels + " nickels ");

		if (change > coin5) {
			change = change - (coin5);

			System.out.println("You get " + change + " penny(ies) ");

		}
	}

	/* Copy this */ if (change >= coin10) {

		change = change - (coin10 * dimes);

		int nickels = change / coin5;

		System.out.println("You get " + nickels + " nickels ");

		if (change > coin5) {
			change = change - (coin5);

			System.out.println("You get " + change + " penny(ies) ");
		}

	}

}

// Round 2
// less than a quarter AND less than 0
if (change < coin25 && change > 0) {
	change = change - (coin25 * quarters);
	int dimes = change / coin10;
	// System.out.println("You get " + dimes + " dimes 2 " + change);

	if (change <= coin10 && change > 0) {

		change = change - (coin10 * dimes);

		int nickels = change / coin5;

		System.out.println("You get " + nickels + " nickels 2 " + change);

		if (change < coin5 && change > 0) {

			System.out.println("You get " + change + " penny(ies) 2 " + change);

		}
	}

	if (change > coin10 && change > 0) {

		change = change - (coin10 * dimes);

		int nickels = change / coin5;

		System.out.println("You get " + nickels + " nickels 3 " + change);

		if (change < coin5 && change > 0) {

			System.out.println("You get " + change + " penny(ies) 3 " + change);
		}

	}

	// Change for nickels

	// if ()
