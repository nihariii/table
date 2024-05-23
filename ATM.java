import java.io.*;
import java.util.*;
class ATM
{
	float amount=5000;
	int PIN=1234,pin;
	Scanner sc=new Scanner(System.in);
	boolean login()
	{
		System.out.println("Enter your pin:");
		pin=sc.nextInt();
		if(PIN==pin)
		{
			//System.out.println("Login succesfull:");
			return true;
		}
		else
		//System.out.println("Invalid password:");
		return false;
	}
	void Deposit(float damount)
	{
		
		amount+=damount;
		System.out.println("After deposit amount is:"+amount);
	}
	void Withdraw(float wamount)
	{
		if(amount>wamount)
		{
		amount=amount-wamount;
		System.out.println("After Withdraw amount is:"+amount);
		}
		else
		System.out.println("insuffient amount is:"+amount);
	}
	void Balenq()
	{
		System.out.println("Balance  amount is:"+amount);
	}
}
class Demo
{
	public static void main(String args[])
	{
		ATM a=new ATM();
		int i;
		float damount,wamount;
		boolean b=a.login();
		Scanner sc=new Scanner(System.in);
		if(b==false)
		{
			System.out.println("Incorrect pin try again:");
			boolean c=a.login();
		}
		do{
			System.out.println("1:Deposit\n2:Withdraw\n3:Balace\n4:exit\n");
		System.out.println("Enter your Choice:");
		i=sc.nextInt();
		switch(i)
		{
			case 1:
			System.out.println("Enter amount for Deposit");
			damount=sc.nextFloat();
			a.Deposit(damount);
			break;
			case 2:
			System.out.println("Enter amount for withdraw");
			wamount=sc.nextFloat();
			a.Withdraw(wamount);
			break;
			case 3:
			a.Balenq();
			break;
			default:
			System.out.println("Enter valid Choice:");
		}
		
		}while(i<4);
			
	}
}
