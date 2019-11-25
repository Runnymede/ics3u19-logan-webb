package Webb.unit2;

import java.util.Scanner;
/*
 * guessing game2
 * this a program is trying to guess an number
 * oct 22 2019
 * @author Logan Webb
 */
public class Guessinggame2 {

	public static void main(String[] args) {
		//entry point to the program
		Scanner sc=new Scanner(System.in);		
		//Declaring variables
		int computernumber;
		int usernumber;
		do {

			//getting random numbers
			computernumber=(int)(Math.random()*20)+1;
			//asking for a guess
			System.out.println("please guess a number between 1 -20");
			usernumber=sc.nextInt();
			//printing answer
			System.out.println("compuers number:"+ computernumber);
			System.out.println("players number:"+ usernumber);
			if (usernumber==computernumber)
			{
				System.out.println("you won!");
			}
			else
			{
				System .out.println("better luck next time");
			}
		}while(usernumber!=computernumber);

	}
}