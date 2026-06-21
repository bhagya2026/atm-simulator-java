import java.util.Scanner;
 
public class ATMSimulator {
	private static double balance = 5000.0;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n----- ATM MENU -----");
			System.out.println("1. Balance Inquiry");
			System.out.println("2. Deposit");
			System.out.println("3. Withdrawal");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
 
			switch (choice) {
				case 1:
					System.out.println("Current Balance: Rs. " + balance);
					break;
				case 2:
					System.out.print("Enter amount to deposit: ");
					double depositAmt = sc.nextDouble();
					if (depositAmt > 0) {
						balance += depositAmt;
						System.out.println("Deposit successful. New Balance: Rs. " + balance);
					} else {
						System.out.println("Invalid amount.");
					}
					break;
				case 3:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmt = sc.nextDouble();
					if (withdrawAmt > 0 && withdrawAmt <= balance) {
						balance -= withdrawAmt;
						System.out.println("Withdrawal successful. New Balance: Rs. " + balance);
					} else {
						System.out.println("Insufficient balance or invalid amount.");
					}
					break;
				case 4:
					System.out.println("Thank you for using the ATM. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 4);
		sc.close();
	}
}
