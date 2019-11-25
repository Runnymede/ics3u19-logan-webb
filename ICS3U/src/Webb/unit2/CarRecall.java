package Webb.unit2;

import java.util.Scanner;
/*
 * car recall 
 * this a program about checking the model numbers of defective cars
 * oct 3 2019
 * @author Logan Webb
 */
public class CarRecall {

	public static void main(String[] args) {
		//this is the entry point to the program

		Scanner sc=new Scanner(System.in);	
		//Variables
		int carnumber;
		//asking for model number
		System.out.println("please enter the cars modle number");
		carnumber=sc.nextInt();
		//switch to check all the car models that are defective
		while(carnumber!=0) {
			switch(carnumber){
			case 199:
			case 179:
			case 185:
			case 186:
			case 187:
			case 188:
			case 189:
			case 190:
			case 191:
			case 192:
			case 193:
			case 194:
			case 195:
			case 221:
			case 780:
				System.out.println("your car is defective it needs to be repared");
				break;
			default: System.out.println("your car is not defective");
			}
		}
		System.out.println("quiting program");

	}
}

