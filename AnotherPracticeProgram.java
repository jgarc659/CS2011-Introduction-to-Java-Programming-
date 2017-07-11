// Import Scanner.
import java.util.Scanner;

public class AnotherPracticeProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter the exchange rate from dollars to RMB: ");
			double exchangeRate = input.nextDouble();
			
			System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
			int choice = input.nextInt();
			
			if (choice == 1) {
				System.out.print("Enter the RMB amount: ");
				double amountRMB = input.nextDouble();
				double yuanToUSD = amountRMB / exchangeRate;
				System.out.printf("%1.1f yuan is $%1.2f.\n\n", amountRMB, yuanToUSD);
			}
			else if (choice == 0) {
				System.out.print("Enter the dollar amount: ");
				double amountUSD = input.nextDouble();
				double dollarsToRMB = amountUSD * exchangeRate;
				System.out.printf("$%1.2f is %1.1f yuan.\n\n", amountUSD, dollarsToRMB);
			}
			else {
				System.out.println("\nINCORRECT INPUT \n");
				continue;
			}
		}
	}
}
