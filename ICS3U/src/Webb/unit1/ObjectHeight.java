package Webb.unit1;

import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		double Time;
		double height;


		System.out.println("Enter a time less than 4.5 seconds: ");
		
		Time = sc.nextDouble();
		height =100 - 2.9 * Time*Time;
		
		System.out.println("the height of the object is "+ height+" in meaters");

	}


}


