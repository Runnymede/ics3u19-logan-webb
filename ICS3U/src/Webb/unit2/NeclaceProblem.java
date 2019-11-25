package Webb.unit2;

import java.util.Scanner;
/*
 * necklace problem
 * this a program will as up two consecutive numbers in a row and will put down the sum 
 * and repute the process until the original 2 numbers are reached
 * nov 7 2019
 * @author Logan Webb
 */
public class NeclaceProblem {

	public static void main(String[] args) {
		//this is the entry point to the program
		
		Scanner sc=new Scanner(System.in);
// varibles
		int num1;
		int num2;
		int A;
		int B;
		int C;
// asking user for inputs
		System.out.println("please input a single digit number");
		num1=sc.nextInt();
		System.out.println("please input another single digit number");
		num2=sc.nextInt();
		A=num1;
		B=num2;
		
//loop to add the two numbers and to get the next "bead" in the necklace
		do
		{
			C=A+B;
			
			if (C>=10)
			{
				C=C%10;
				System.out.println(C);
			}
			else
			{
				System.out.println(C);
			}
				
				B=C;
			C=A;

		}
		while(A!=num1&&B!=num2);
		{
			System.out.println("BYE");

		}	
	}

}
