package Webb.unit2;

import java.util.Scanner;
/*
 * number check
 * this a program about checking to see if a digit is a negative or positive number, and if it is divisible by 7,
 * oct 3 2019
 * @author Logan Webb
 */
public class NumberCheck {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc=new Scanner(System.in);		

		int number;

		System.out.println("please enter any whole number");
		number= sc.nextInt();

		if (number<0)
		{
			System.out.println("this is a negitive number");
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("this is a positive number");
			Thread.sleep(1000);
		}
		
		number=number%7;
		
		if(number==0)
		{
			System.out.println("this number is divisable by 7");
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("this number is not divisable by 7");
			Thread.sleep(1000);
		}



	}

}
