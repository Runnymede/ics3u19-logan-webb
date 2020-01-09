package Webb.unit4;
import java.util.Scanner;

import javax.crypto.Mac;
public class MathPlus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	

		System.out.println("please enter the numbers that you wish to calculate");
		int amountofnumbers=sc.nextInt();
		double amountofnumbersD= amountofnumbers;
		double[] numbers=new double[amountofnumbers];

		System.out.println("please enter the number one by one");
		for(int i = 0;i<amountofnumbers; i++){
			numbers[i]=sc.nextInt();
		}

		System.out.println("how would you like to calculate?");
		System.out.println("find the maximum(max), minumum(min),average(average), sum(sum), median(median)");
		String calculate = sc.next();

		if (calculate.equals("max")){
			System.out.println(numbers[(int) min(numbers,amountofnumbers)]);
			//System.out.println(numbers[(int) min(numbers,amountofnumbers)]);
		}
		else if (calculate.equals("min")){
			System.out.println(numbers[(int) min(numbers,amountofnumbers)]);
		}
		else if (calculate.equals("sum")){
			System.out.println(sum(numbers,amountofnumbers));
		}
		else if (calculate.equals("average")){
			System.out.println(average(numbers,amountofnumbers));
		}
		else if (calculate.equals("median")){
			System.out.println(median(numbers,amountofnumbers));
		}

	}
	/**
	 * method name - min
	 * this method returns the index of the first occurrence of the smallest number in the array
	 * @param numbers (int[])
	 * @param amountofnumbers (int)
	 * @return minindex (int)
	 */
	public static int min (int[] numbers, int amountofnumbers){
		int min=numbers[0];
		int minindex = 0;

		for(int i = 0; i<amountofnumbers; i++) {

			if (numbers[i]>min)
			{
				min=numbers[i];
				minindex = i;
			}
		}
		return minindex;
	}
	/**
	 *  method name - max
	 * this method returns the index of the first occurrence of the largest number in the array
	 * @param numbers (int[])
	 * @param amountofnumbers (int)
	 * @return maxindex (int)
	 */
	public static int max (int[] numbers, int amountofnumbers){

		int max=numbers[0];
		int maxindex = 0;

		for(int i = 0; i<amountofnumbers; i++) {

			if (numbers[i]>max)
			{
				max=numbers[i];
				maxindex = i;
			}
		}
		return maxindex;
	}
	/**
	 * this method returns the sum of all the integers in the given array
	 * @param numbers (int[])
	 * @param amountofnumbers (int)
	 * @return sum (int)
	 */
	public static int sum (int[] numbers, int amountofnumbers){
		int sum = 0;
		int total = 0;
		for(int i = 0; i<amountofnumbers; i++) {

			total=numbers[i]+ total;
			sum=total;
		}	
		return sum;
	}
	/**
	 * this method returns the average of all the integers in the given array
	 * @param numbers (int)
	 * @param amountofnumbers (int)
	 * @return average (double)
	 */
	public static double average (int[] numbers, int amountofnumbers){
		int sum = 0;
		int total = 0;
		for(int i = 0; i<amountofnumbers; i++) {

			total=numbers[i]+ total;
			sum=total;
		}
		sum /= amountofnumbers;
		return sum;
	}



	// all doubles


	/**
	 * method name - min
	 * this method returns the index of the first occurrence of the smallest number in the array
	 * @param numbers (double[])
	 * @param amountofnumbers (double)
	 * @return minindex (double)
	 */
	public static double min (double[] numbersD, double amountofnumbersD){
		double min=numbersD[0];
		int minindex = 0;

		for(int i = 0; i<amountofnumbersD; i++) {

			if (numbersD[i]>min)
			{
				min=numbersD[i];
				minindex = i;
			}
		}
		return minindex;
	}
	/**
	 *  method name - max
	 * this method returns the index of the first occurrence of the largest number in the array
	 * @param numbers (double[])
	 * @param amountofnumbers (double)
	 * @return maxindex (double)
	 */
	public static double max (double[] numbers, double amountofnumbers){

		double max=numbers[0];
		int maxindex = 0;

		for(int i = 0; i<amountofnumbers; i++) {

			if (numbers[i]>max)
			{
				max=numbers[i];
				maxindex = i;
			}
		}
		return maxindex;
	}
	/**
	 * this method returns the sum of all the integers in the given array
	 * @param numbers (double[])
	 * @param amountofnumbers (double)
	 * @return sum (double)
	 */
	public static double sum (double[] numbers, double amountofnumbers){

		//Variables
		double sum = 0;
		double total = 0;
		for(int i = 0; i<amountofnumbers; i++) {

			total=numbers[i]+ total;
			sum=total;
		}	
		return sum;
	}
	/**
	 * this method returns the average of all the integers in the given array
	 * @param numbers (double)
	 * @param amountofnumbers (double)
	 * @return average (double)
	 */
	public static double average (double[] numbers, double amountofnumbers){

		//Variables
		double sum = 0;
		double total = 0;

		// getting numbers out of array to calculate average
		for(int i = 0; i<amountofnumbers; i++) {

			//finding the total
			total=numbers[i]+ total;
			sum=total;
		}

		//Finding the average and returning
		sum /= amountofnumbers;
		return sum;
	}





	/**
	 * Returns the median value of all the numbers in the array
	 * @param numbers
	 * @param amountofnumbers
	 * @return double
	 */
	public static double median (double[] numbers, double amountofnumbers){
		double medianindex = 0;

		//if the amount of numbers is even getting the two numbers and finding the average
		if (amountofnumbers/2 == 0){
			medianindex = Math.abs(amountofnumbers/2); 
			int medindex1 = (int) medianindex;
			int medindex2 = (int) medianindex-1;
			return numbers[medindex1] + numbers[medindex2] / 2;
		}

		// if the amount of numbers is odd finding the middle number
		else if(amountofnumbers/2 != 0){
			medianindex = amountofnumbers/2;
		}
		// returning the answer
		return numbers[(int) medianindex];
	}

	public static double mode (double[] numbers, double amountofnumbers){

		for(int i = 0; i<amountofnumbers; i++) {


		}
		return numbers[0];
	}
	public static boolean prime (double number){

		//Variables
		int counter=2;
		boolean prime=true;
	
		//loop to check all possible factors
		while(counter!=number){
			counter++;
			if( number% counter==0){
				prime=false;
				break;
			}
		}

		//returning true(prime) or false (not prime)
		return prime;
	}

}


