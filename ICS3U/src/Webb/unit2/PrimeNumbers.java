package Webb.unit2;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaring variables
		int n;
		int counter=2;
		boolean prime=true;
		//asking for a number
		System.out.println("please input a number and we will see if its prime");
		n=sc.nextInt();
		//loop to check all possible factors
		while(counter!=n)
		{
			counter++;

			if( n% counter==0)
			{
				prime=false;
				break;
			}
			
		}
		
		if (prime==false)
		{
			System.out.println("the number is not prime");
		}
		else if (prime==true)
		{
			System.out.println("the number is prime");
		}
	
	
	}
}
