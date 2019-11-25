package Webb.unit1;

import java.util.Scanner;

public class Quadratics {

	public static void main(String[] args) {

		/*
		 * Quadratics
		 * Logan,Webb
		 * sept 30
		 */

		Scanner sc=new Scanner(System.in);
		// decalring varables
		double a;
		double b;
		double c;
		double x1;
		double x2;
		//asking for inputs
		System.out.println("please input a vale for a");
		a=sc.nextDouble();
		System.out.println("please input a vale for b");
		b=sc.nextDouble();
		System.out.println("please input a vale for c");
		c=sc.nextDouble();
		//calculating answers
		x1=(Math.sqrt(Math.pow(b,2)-4*a*c));
		x1= -b+x1;
		x1=x1/(2*a);		

		x2=(Math.sqrt(Math.pow(b,2)-4*a*c));
		x2= -b-x2;
		x2=x2/(2*a);
		//printing answers
		System.out.println("the value of x1 is"+ x1);
		System.out.println("the value of x2 is"+ x2);


	}

}
