import java.util.Scanner;

public class Bank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		SavingsAccount[] sa = new SavingsAccount[10];
		CurrentAccount[] ca = new CurrentAccount[10];

		int sIndex=0, cIndex=0;

		System.out.println("1. Savings\n2. Current\n3. Deposit\n4. Withdraw\n5. Interest\n6. Display\n7. Cheque\n0. Exit");
		int choice;

		do
		{
			System.out.print("\nEnter choice:");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1 :sa[sIndex]=new SavingsAccount();
					sa[sIndex++].getData();
					break;
				case 2 :ca[cIndex]=new CurrentAccount();
					ca[cIndex++].getData();
					break;
				case 3 :System.out.print("Enter Account number:");
					String accno = sc.next().strip().toUpperCase();
					
					if(accno.charAt(1)=='S')
					{

						for(int i=0;i<=sIndex;i++)
						{
							if(sa[i].getAccountNumber().equals(accno))
							{
								System.out.print("Enter amount:");
								double amount = sc.nextDouble();
								sa[i].deposit(amount);
							}
						}
					}
					else if(accno.charAt(1)=='C')
					{
						for(int i=0;i<=cIndex;i++)
						{
							if(ca[i].getAccountNumber().equals(accno))
							{
								System.out.print("Enter amount:");
								double amount = sc.nextDouble();
								ca[i].deposit(amount);
							}
						}
					}
					else
					{
						System.out.println("Invalid account no.");
					}
					break;
				case 4 :System.out.print("Enter Account number:");
					String accnumber = sc.next().strip().toUpperCase();

					if(accnumber.charAt(1)=='S')
					{

						for(int i=0;i<=sIndex;i++)
						{
							if(sa[i].getAccountNumber().equals(accnumber))
							{
								System.out.print("Enter amount:");
								double amount = sc.nextDouble();
								sa[i].withdrawal(amount);
							}
						}
					}
					else if(accnumber.charAt(1)=='C')
					{
						for(int i=0;i<=cIndex;i++)
						{
							if(ca[i].getAccountNumber().equals(accnumber))
							{
								System.out.print("Enter amount:");
								double amount = sc.nextDouble();
								ca[i].withdrawal(amount);
							}
						}
					}
					else
					{
						System.out.println("Invalid account no.");
					}
					break;
				case 5 :for(SavingsAccount s: sa)
					{
						if(s!=null)
						{
							s.addInterest();
						}
					}
					System.out.println("Added Interest");
					break;
				case 6:
					// Display Savings Accounts
					for (SavingsAccount a : sa) {
						if (a != null) {  // Check if the account is initialized
							a.display();
        					}
    					}
					// Display Current Accounts
					for (CurrentAccount b : ca) {
						if (b != null) {  // Check if the account is initialized
						        b.display();
        					}
    					}
    					break;
				case 7:	System.out.print("Enter Account No:");
					String accNo = sc.next().strip().toUpperCase();
					if(accNo.charAt(1)=='C')
					{
						System.out.print("Enter Cheque No:");
						String checkNumber = sc.next().strip().toUpperCase();
						for(CurrentAccount c: ca)
						{
							if(c!=null && c.getAccountNumber().equals(accNo))
								c.addCheque(checkNumber);
						}
					}
					else
					{
						System.out.println("Invalid Account");
					}
					break;
				default:System.out.println("Invalid Input");

			}
			sc.nextLine();
		}while(choice!=0);

		System.out.println("Exiting...");
		sc.close();
	}
}

		
