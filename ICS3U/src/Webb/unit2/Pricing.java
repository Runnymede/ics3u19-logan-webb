package Webb.unit2;

import java.util.Scanner;
/*
 * digits display
 * this a program about checking to see how many digits a number has
 * oct 3 2019
 * @author Logan Webb
 */
public class Pricing {

	public static void main(String[] args) {
		
		int copynumber;
		double copyprice;
		double totalcost;
		
		Scanner sc=new Scanner(System.in);		

		System.out.println("what is the number of copies that you woild like?");
		copynumber=sc.nextInt();
		
		if(copynumber<=99)
		{
			copyprice= 0.30;
			totalcost= copynumber*copyprice;
		}
		else if (copynumber<=499)
		{
			copyprice= 0.28;
			totalcost= copynumber*copyprice;
		}
		else if (copynumber<=749)
		{
			copyprice= 0.27;
			totalcost= copynumber*copyprice;
		}
		else if (copynumber<=1000)
		{
			copyprice= 0.26;
			totalcost= copynumber*copyprice;
		}
		else
		{
			copyprice= 0.25;
			totalcost= copynumber*copyprice;
		}
		
		System.out.println("the price per copy is"+copyprice);
		System.out.println("the total cost"+totalcost);





	}

}
