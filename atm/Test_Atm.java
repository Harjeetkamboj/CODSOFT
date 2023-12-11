package atm;
import java.util.Scanner;

public class Test_Atm extends Atm {
	
		static {
			System.out.println("\n**WELCOME TO MY ATM**\n");
			System.out.println("Your Default Account Balance: 20000");
			System.out.println("Your Default Account Pin: 123\n");
		}
		
		public static void main(String[] args) {	
		
			Scanner sc = new Scanner(System.in);
			
		Atm a = new Atm();
		
		boolean x = true;
		while(x) {
			System.out.println("\nWhat do you wanna do now!!");
			System.out.println("Press 1 --> Check Balance");
			System.out.println("Press 2 --> Withdraw Cash");
			System.out.println("Press 3 --> Change Pin");
			System.out.println("Press 4 --> Deposit Cash");
			System.out.println("Press 5 --> Mini-Statement (press this option after doing 1 or more transaction)");
			System.out.println("Press 6 --> Exit");
			
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			a.checkBalance();
		}
		if(choice == 2)
		{
			a.withdraw();
		}
		if(choice == 3)
		{
			a.changePin();
		}
		if(choice == 4)
		{
			a.deposit();
		}
		if(choice == 5)
		{
			a.miniStatement();
		}
		else if( choice==6 )
		{
			x = false;
			System.out.println("**Thankyou for using this ATM**");
			
		}
		}
		}
	}


