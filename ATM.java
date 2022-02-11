import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("****ATM****");
		String n1="Sai";
		String n2="143";
		System.out.println("Enter you username : ");
		String user = s.next();
		System.out.println("Enter your password : ");
		String password = s.next();
		if(user==n1 & password==n2) 
		{
		 int bal=100000,w,d;
		 while(true)
		 {
			 System.out.println("1.Deposit\n2.Withdraw\n3.Balance");
			 System.out.println("Enter your option : ");
			 int op=s.nextInt();
			 if(op==1)
			 {
		 		System.out.println("Enter the amount to be deposited : ");
	 			d=s.nextInt();
		 		bal=bal+d;
	         }
			 else if(op==2)
			 {
		 		System.out.println("Enter the amount to be withdrawn : ");
				w=s.nextInt();
				if(bal>=w)
			 	{
					System.out.println("Collect your money");
					bal=bal-w;
				}
				else
				{
					System.out.println("Insufficient money");
				}
			 }
			 else
			 {
		 		System.out.println(bal);
	 		 }
		 }
		} 
	    else
	    {
			System.out.println("Incorrect password!!!");
	    } 
  }
}	
