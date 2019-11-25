package Webb.unit2;

import java.util.Scanner;
/*
 * digits display
 * this a program about checking to see how many digits a number has
 * oct 3 2019
 * @author Logan Webb
 */
public class DigitDisplay {

	public static void main(String[] args) {
		// this is the entry point to the program
		
		Scanner sc=new Scanner(System.in);
		//Variables
		String number;
		int length;
		int placeholder = 0;
		// Asking for inputs 
		System.out.println("please input a positive number");
		number=sc.next();
		length= number.length();
		//loop to find the number of digits
		while (length>placeholder);
		{
		 System.out.println(number.charAt(placeholder));
		 placeholder++;
		}
		

	}


	}


