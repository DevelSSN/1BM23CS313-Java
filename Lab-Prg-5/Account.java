import java.util.Scanner;

public class Account
{
	private static long accountCounter=0;
	protected String customerName;
	protected String accountNumber;
	protected String accountType;
	protected double balance;

	public Account(){
	}
	
	public void getData(Scanner sc, String accountType, long accountCount)
	{
		
		System.out.print("Enter customer name:");
		customerName = sc.nextLine();
		
		accountNumber = (++accountCounter)+""+accountType+""+accountCount;
		System.out.print("Enter initial Balance:");
		balance = sc.nextDouble();
		display();
	}

	public void display()
	{
		System.out.println(
				"\nName:"+customerName+
				"\nAcc No:"+accountNumber+
				"\nBalance:"+balance);
	}
	public void withdrawal(double amount)
	{
		if(balance-amount>0)
		{
			balance -= amount;
			System.out.println("Withdrawn "+amount+
				". Balance:"+balance);
		}
		else
		{
			System.out.println("Transaction failed.");
		}
	}

	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited "+amount+
				". Balance:"+balance);
	}

	public void getBalance(){
		System.out.println("Balance:"+balance);
	}

	public String getAccountNumber(){return accountNumber;}

	public void addInterest(){}
}

class SavingsAccount extends Account
{
	
	static public double interestRate=0.05;
	static long count=0;
	SavingsAccount(){
	}

	public void getData(){
		Scanner sc = new Scanner(System.in);
		accountType = "S";
		super.getData(sc, accountType,++count);
	}

	public void addInterest(){
		balance += balance*interestRate;
	}
}

class CurrentAccount extends Account
{
	static long minimumBalance = 5000;
	static long count=0;
	String chequeBook = "";
	CurrentAccount(){
	}

	public void getData(){
		Scanner sc = new Scanner(System.in);

		accountType = "C";
		super.getData(sc,accountType,++count);
	}

	public void withdrawal(double amount){
		if (balance-amount < minimumBalance)
		{
			double serviceCharge = amount * 0.1;
			System.out.println("Transaction to go below minimum balance("+
					minimumBalance+"). Service charge of "+
					serviceCharge+" levied for the transaction");

			super.withdrawal(amount+serviceCharge);
			return;
		}
		super.withdrawal(amount);
	}

	public void addCheque(String s)
	{
		chequeBook = chequeBook+s+"\n";
	}
}
