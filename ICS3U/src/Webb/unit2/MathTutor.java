package Webb.unit2;

import java.util.Scanner;
/* math tutor
	 * this a program will generate random numbers and operators and random numbers to help improve math skills
	 * oct 25 2019
	 * @author Logan Webb
	 */
public class MathTutor {
	
	public static void main(String[] args) {
		//this is the entry point to the program


		Scanner sc=new Scanner(System.in);	
		//Declaring variables
		int num1;
		int num2;
		int answer;
		int guess;
		int opperator;
		//randomizing numbers
		num1=(int)(Math.random()*10)+1;
		num2=(int)(Math.random()*10)+1;
		opperator=(int)(Math.random()*4)+1;

		//calculating numbers and asking user
		if ( opperator==1)
		{
			System.out.println("what is "+num1+"+"+num2);
			guess=sc.nextInt();
			answer=num1+num2;
			if (answer==guess)
			{
				System.out.println("correct!");
			}
			else
			{
				System.out.println("incorrect");
			}
		}
		else if ( opperator==2)
		{
			System.out.println("what is "+num1+"-"+num2);
			guess=sc.nextInt();
			answer=num1-num2;
			if (answer==guess)
			{
				System.out.println("correct!");
			}
			else
			{
				System.out.println("incorrect");
			}


		}
		else if ( opperator==3)
		{
			System.out.println("what is "+num1+"x"+num2);
			guess=sc.nextInt();
			answer=num1*num2;
			if (answer==guess)
			{
				System.out.println("correct!");
			}
			else
			{
				System.out.println("incorrect");
			}


		}
		else if ( opperator==4)
		{
			System.out.println("what is "+num1+"/"+num2);
			guess=sc.nextInt();
			answer=num1/num2;
			if (answer==guess)
			{
				System.out.println("correct!");
			}
			else
			{
				System.out.println("incorrect");
			}


		}

	}
}
