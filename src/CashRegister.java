import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		System.out.print("What is the price of the item? $");
		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();

		System.out.print("How much cash was tendered? $");
		double tendered = sc.nextDouble();
		
		sc.close();
		
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

		}

		int tenner = change % bill10;
		if (bill10 == (change - tenner)) {
			System.out.println("You get 1 $10 bill ");
		}

		int fiver = tenner % bill5;
		if (tenner >= bill5 && tenner != bill10) {
			System.out.println("You get 1 $5 bill ");
		}

		int buck = change % bill1;

		if (fiver >= bill1) {

			int c = (fiver - buck) / 100;
			System.out.println("You get " + c + " $1 bill(s) ");
		}

		int quarter = buck % coin25;

		if (buck >= coin25) {

			int q = buck - quarter;
			q = q / coin25;
			System.out.println("You get " + q + " quarter(s) ");
		}

		int dime = quarter % coin10;

		if (quarter >= coin10) {

			int d = quarter - dime;
			d = d / coin10;
			System.out.println("You get " + d + " dime(s) ");
		}
		
		int nickel = dime % coin5;

		if (dime >= coin5) {

			int n = dime - nickel;
			n = n / coin5;
			System.out.println("You get " + n + " nickel(s) ");
		}
		
		
		int penny = nickel % coin1;

		if (nickel >= coin1) {

			int p = nickel - penny;
			p = p / coin1;
			System.out.println("You get " + p + " penny(ies) ");
		}
		

	}
}