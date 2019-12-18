package Webb.unit4;

import java.util.Scanner;

public class TempatureConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		String convert;
		int temp;

		System.out.println("would you like to convert from fahrenheit to celsius (F) "
				+ "or from celsius to fahrenheit(C)");
		convert=sc.nextLine();
		System.out.println("what tempature would you like to convert?");
		temp=sc.nextInt();
		if (convert.equals("C"))
		{
			double tempinF=CtoF(temp);
			System.out.println("the tempature in Farhrenheit is "+ tempinF);
		}
		else if (convert.equals("F"))
		{
			double tempinC=CtoF(temp);
			System.out.println("the tempature in Celsius is "+ tempinC);
		}
	}



	public static double CtoF(double C) {
		double F=(C - 32) * 5/9;
		return F;
	}
	public static double FtoC(double F) {
		double C=(F - 32) * 5/9 ;
		return C;
	}


}
