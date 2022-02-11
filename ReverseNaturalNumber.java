import java.util.Scanner;

public class ReverseNaturalNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the value of n : ");
		n=s.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println(n-i);
		}

	}

}
