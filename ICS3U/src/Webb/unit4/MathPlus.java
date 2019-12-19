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
		String calculate = sc.nextLine();
		
		if (calculate.equals("max")){
			max(numbers,amountofnumbers);
		}
		else if (calculate.equals("min")){
			min(numbers,amountofnumbers);
		}
		else if (calculate.equals("sum")){
			sum(numbers,amountofnumbers);
		}
		else if (calculate.equals("average")){
			average(numbers,amountofnumbers);
		}

	}
    public static int min (int[] numbers, int amountofnumbers){
	
    	return 0;
}
    public static int max (int[] numbers, int amountofnumbers){
    	
    	return 0;
}
    public static int sum (int[] numbers, int amountofnumbers){
    	int sum = 0;
    	for(int i = 0; i<amountofnumbers; i++) {
    		int total = 0;
    		total=numbers[i]+ total;
    		sum=total;
    	}
    		
    	return sum;
	
}
    public static double average (int[] numbers, int amountofnumbers){
    	
    	return 0;
}
}
