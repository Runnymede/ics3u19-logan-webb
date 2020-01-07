package Webb.unit4;
import java.util.Scanner;
public class MathPlus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	

		System.out.println("please enter the numbers that you wish to calculate");
		int amountofnumbers=sc.nextInt();
		int[] numbers=new int[amountofnumbers];
		System.out.println("please enter the number one by one");
		for(int i = 0;i<amountofnumbers; i++){
			numbers[i]=sc.nextInt();
		}
		System.out.println("how would you like to calculate?");
		System.out.println("find the maximum(max), minumum(min),average(average), sum(sum)");
		String calculate = sc.next();

		if (calculate.equals("max")){
			System.out.println(max(numbers,amountofnumbers));
		}
		else if (calculate.equals("min")){
			System.out.println(min(numbers,amountofnumbers));
		}
		else if (calculate.equals("sum")){
			System.out.println(sum(numbers,amountofnumbers));
		}
		else if (calculate.equals("average")){
			System.out.println(average(numbers,amountofnumbers));
		}

	}
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
	public static int sum (int[] numbers, int amountofnumbers){
		int sum = 0;
		int total = 0;
		for(int i = 0; i<amountofnumbers; i++) {

			total=numbers[i]+ total;
			sum=total;
		}	
		return sum;
	}
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
}
