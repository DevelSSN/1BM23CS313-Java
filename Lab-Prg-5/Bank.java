import java.util.Scanner;

public class Bank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		SavingsAccount[] sa = new SavingsAccount[10];
		CurrentAccount[] ca = new CurrentAccount[10];

		int sIndex=0, cIndex=0;

		System.out.println("1. Savings\n2. Current\n3. Deposit\n4. Withdraw\n5. Interest\n0. Exit\n");
		int choice;

		do
		{
			System.out.println("Enter choice:");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1 -> 
				{
					sa[sIndex++]=new SavingsAccount();
				}
				case 2 -> 
				{
					ca[cIndex++]=new CurrentAccount();
				}

				case 3 ->
				{
					System.out.println("Enter Account number:");
					String accno = sc.next().strip().toUpperCase();
					
					if(accno.charAt(0)=='S')
					{

						for(int i=0;i<sIndex;i++)
						{
							if(sa[i].getAccountNumber().equals(accno))
							{
								System.out.print("Enter amount:");
								double amount = sc.nextDouble();
								sa[i].deposit(amount);
							}
						}
					}
					else if(accno.charAt(0)=='C')
					{
						for(int i=0;i<cIndex;i++)
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
				}
				case 4 ->
				{
					System.out.println("Enter Account number:");
					String accno = sc.next().strip().toUpperCase();

					if(accno.charAt(0)=='S')
					{

						for(int i=0;i<sIndex;i++)
						{
							if(sa[i].getAccountNumber().equals(accno))
							{
								System.out.print("Enter amount:");
								double amount = sc.nextDouble();
								sa[i].withdrawal(amount);
							}
						}
					}
					else if(accno.charAt(0)=='C')
					{
						for(int i=0;i<cIndex;i++)
						{
							if(ca[i].getAccountNumber().equals(accno))
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
				}

				case 5 ->
				{
					for(SavingsAccount s: sa)
					{
						s.addInterest();
					}

				}

			}
			sc.nextLine();
		}while(choice!=0);

		System.out.println("Exiting...");
		sc.close();
	}
}

		
