package atm;
import java.util.Arrays;
import java.util.Scanner;
public class Atm {

	double bal = 20000;
	static int pin = 123;
	int x;
	MiniStatement m[] = new MiniStatement[5];
	
	
	Scanner sc = new Scanner(System.in);
	
	public void checkBalance() 
	{
		System.out.println("Enter Pin:");
		int p = sc.nextInt();
		if(p == pin)
		{
		System.out.println("your current balance is: "+bal);
		}
		else
		{
			System.out.println("!!invalid Pin--Try again");
			checkBalance();
		}
	}
	
	public void withdraw() 
	{
		System.out.print("Enter Pin: ");
		int p = sc.nextInt();
		if(p == pin)
		{
			System.out.print("Enter Amount: ");
			int amount = sc.nextInt();
			if(amount<=bal && amount%100 == 0) 
			{
				bal = bal - amount;
				System.out.println("money withdrawn: " + (amount)+ "  Remaining balance "+ bal);
				
				if(x<5) 
				{
				m[x] = new MiniStatement(amount," Withdraw \n");
				x++;
				}
				else
				{
					for(int i = 0;i<m.length-1;i++) 
					{
						m[i] = m[i+1];
					}
					x--;
					m[x] = new MiniStatement(amount," Withdraw \n");
				}
			}
			else
			{
				System.out.println("Insufficient Balance--Try again");
				withdraw();
			}
		}
		else
		{
			System.out.println("invalid Pin!!\n");
			withdraw();
		}
	}
	
	public void deposit()
	{
		System.out.print("Enter Pin: ");
		int p = sc.nextInt();
		if(p == pin)
		{
			System.out.print("Enter Amount: ");
			int amount = sc.nextInt();
			if(amount%100 == 0) {
				bal = bal + amount;
				System.out.println("Deposited amount: " + (amount)+ "  Updated balance "+ bal);
				if(x<5) {
					m[x] = new MiniStatement(amount,"deposit \n");
					x++;
					}
					else {
						
						for(int i = 0;i<m.length-1;i++) {
							m[i] = m[i+1];
							
						}
						x--;
						m[x] = new MiniStatement(amount," Deposit \n");
						
					}
				
			}			
			else
			{
				System.out.println("!!Accepts amount only in multiple of 100--Try again\n");
				deposit();
			}
			}
	}
	
	public void printReicept()
	{
		
	}
	
	public void miniStatement()
	{
		System.out.println("\n**Mini-Statement** (Most Recent Transactions)");
		for(int i =0;i<m.length;i++) {
			
			if(i<x) System.out.print(m[i].amt +" "+m[i].msg);
		}
		
		
	}
	
	public void changePin()
	{
		System.out.println("Press 1 -- If wanna change Pin \nPress 2 -- If not");
		
		int x = sc.nextInt();
		if(x==1) 
		{
			System.out.print("Enter Old Pin First: ");
			int op = sc.nextInt();
			if(op==pin) {
				
			
			System.out.print("Enter new pin: ");
			int newpin = sc.nextInt();
			if(newpin!=pin) {
				Atm.pin = newpin;			
			System.out.println("\nyour new pin is: "+pin);
			}
			else
			{
				System.out.println("!!New PIN cannot be the same as old PIN\nTry Again\n");
				changePin();
			}
			}
			else {
				System.out.println("Entered pin is not your old pin..try again");
				changePin();
			}
		}
		else if(x==2)
		{
			System.out.println("Your current pin: " + pin);
		}
	}
	
	
}
