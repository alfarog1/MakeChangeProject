import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		System.out.print("What is the price of the item? ");
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		
		
		System.out.print("How much cash was tendered? ");	
		double tendered = sc.nextDouble();

		
		if (tendered < price) {
			System.out.println("Sorry you gave to little, need more cash. ");
		}
		if (tendered == price) {
			System.out.println("Thanks for the exact change. ");
		}
		else if (tendered > price){
			System.out.println("Wait for your change. ");
			
		}
		
		
		
		
		

	}

}
