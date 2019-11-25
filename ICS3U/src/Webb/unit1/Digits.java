package Webb.unit1;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		/*
		 * digits
		 * Logan,Webb
		 * sept 30
		 */
		Scanner sc=new Scanner(System.in);
		// declaring variables
		int inputnumber;
		int hundreds;
		int tens;
		int ones;
		// asking for an input
		System.out.println("input a number between 0 and 999");
		inputnumber=sc.nextInt();
		//calculating
		hundreds= inputnumber/100;
		tens= (inputnumber - hundreds* 100) /10;
		ones= inputnumber - hundreds*100- tens*10;
		// printing answer
		System.out.println(inputnumber);
		System.out.println("hureds: "+ hundreds);
		System.out.println("tens: "+ tens);
		System.out.println("ones: "+ ones);


	}

}
