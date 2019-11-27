package Webb.unit3;
/*
 * questions20
 * this a program will try to guess what fruit the user is thinking of
 * nov 24 2019
 * @author Logan Webb
 */
import java.util.Scanner;

public class Questions20 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		
		String response ;
		String[] guesses = {"strawberry", "rasberry", "apple","orange","banana","pineapple","watermelon"
				,"blackberry","bluberry", "peach", "apricot","kiwi","plum","grape","dragonfruit","cherry"
				,"pear","mango","cranbery","clemintine"};
	
		
		System.out.println("lets play a guessing game, pick a fruit and i will try to guess it!");
		for( int i =0; i<20; i++)
		{
			int guessSpot = (int)((Math.random()*20)+1);
			System.out.println("is it a "+guesses[guessSpot]);
			response= sc.nextLine();
			if(response.equals("yes"))
			{
				System.out.println("i win!");
				break;
			}
			
		}

	}

	
	}


