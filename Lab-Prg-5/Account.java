import java.util.Scanner;

public class Account
{
	static long count=0;

	protected String customerName;
	protected String accountNumber;
	protected String accountType;
	protected double balance;

	public Account(){
	}
	
	protected void getData(Scanner sc)
	{
		
		System.out.print("Enter customer name:");
		customerName = sc.nextLine();
		
		accountNumber = (++count)+"";
		display();
	}

	protected void askBalance(Scanner sc){
		System.out.print("Enter initial Balance:");
		balance = sc.nextDouble();

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
	SavingsAccount(){
		this.getData();
	}

	private void getData(){
		Scanner sc = new Scanner(System.in);

		super.getData(sc);
		accountType = "S";
		accountNumber = accountType+accountNumber;

		super.askBalance(sc);
	}

	public void addInterest(){
		balance += balance*interestRate;
	}
}

class CurrentAccount extends Account
{
	static long minimumBalance = 5000;
	
	String chequeBook = "";
	CurrentAccount(){
		getData();
	}

	private void getData(){
		Scanner sc = new Scanner(System.in);

		super.getData(sc);
		accountType = "C";
		accountNumber = accountType + accountNumber + (++count);

		super.askBalance(sc);
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

	public void AddCheque(String s)
	{
		chequeBook = chequeBook+s;
	}
}
