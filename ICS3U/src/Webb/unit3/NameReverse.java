package Webb.unit3;

import java.util.Scanner;

public class NameReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		

		// asking for the number of names and making an array with that number
		System.out.println("please input the number of names");
		int arraylist = sc.nextInt();
		String[] namelist = new String[arraylist];
		
		// asking for the names
		System.out.println("please enter the names one by one");
		
		// assigning the names to each space in the array
		for(int i = 0; i < namelist.length; i++)
		{
			namelist[i]= sc.next();
		}
		
		// printing the list forwards
		System.out.println("name list forwards");
		for (int x = 0; x < arraylist ;x++)
		{
			System.out.println(namelist[x]);
		}
		
		//printing the list backwards
		System.out.println("name list backwards");
		for (int x = arraylist-1; x >= 0 ;x--)
		{
			System.out.println(namelist[x]);
		}


	}

}
