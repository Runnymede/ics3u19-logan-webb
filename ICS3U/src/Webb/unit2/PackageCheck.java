package Webb.unit2;

import java.util.Scanner;
/*
 * package check
 * this a program about checking if a package is the right wodth, height, volume
 * oct 15 2019
 * @author Logan Webb
 */
public class PackageCheck {

	public static void main(String[] args) {
		//this is the entry point to the program
		Scanner sc=new Scanner(System.in);		
		// Variables
		double width;
		double height;
		double length;
		double weight;
		double volume;
		// asking for dimensions of the package
		System.out.println("please input the width of the package");
		width=sc.nextDouble();
		System.out.println("please input the hight of the package");
		height=sc.nextDouble();
		System.out.println("please input the length of the package");
		length=sc.nextDouble();
		System.out.println("please input the weight of the package");
		weight=sc.nextDouble();
		//calculating volume
		volume= length*width*height;
		// checking dimensions to see if it is too bug or small
		if (volume>= 100000&&weight>27)
		{
			System.out.println("too heavy and too big");
		}
		else if (volume<= 100000&&weight<27)
		{
			System.out.println("accepted");
		}
		else if(volume>= 100000)
		{
			System.out.println("too big");
		}
		else if(weight>=27)
		{
			System.out.println("too heavy");
		}




	}

}
