import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		System.out.print("What is the price of the item? $");
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		
		System.out.print("How much cash was tendered? $");	
		double tendered = sc.nextDouble();

		double change = tendered - price;
		
		if (tendered < price) {
			System.out.println("Sorry you gave to little, need more cash. ");
		}
		if (tendered == price) {
			System.out.println("Thanks for the exact change. " );
		}
		else if (tendered > price){
			
			System.out.println("Wait for your change of $" + change);
			//After prompting for the user for price and tendered, giving change here on
			do { double remainder;
				 double bill10 =10;
				 double bill5 =5;
				 double bill1 =1;
				 double coin25 =0.25;
				 double coin10 =0.10;
				 double coin5 =0.05;
				 double coin1 =0.01;
				
			//make an if statement if over $20 was given if () 
			
				if (tendered - price > bill10) {
					System.out.println("You get one $10 bill ");
				}
				if ((tendered - price) - bill10 >= bill5) {
					System.out.println("You get one $5 bill");
				}
				//Since the 
				if ((tendered - price) - bill1 > bill1) {
					 
					//creating an if statement to see how many $1 bills they need to receive
					
					if ((tendered - price) - bill1 > bill1) {
						
						System.out.println("You get "+ /*count +*/ "$1 bill");
					}
					 
				}
				
			} while (tendered - price == 0);
			
		}
		
		
		
		
		

	}

}
