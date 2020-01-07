package Webb.unit4;
import java.util.Scanner;

/*COMMENT SOMETHING HERE AND CHANGE PACKAGE
 *
 */

public class IsoTriangles {

	public static void main (String [] args)
	{

		Scanner sc  = new Scanner(System.in);
		//asks user for the height the triangle
		
		System.out.println("Please enter how high you want your isotriangle to be");
		int userNum = sc.nextInt();
		
		//variables for the loop
		int loopCounter = 0;
		int decrease = userNum;
		
		//loop for how many times the stars and spaces need to be printed per line
		for (int counter = 0; counter != userNum; counter ++)
		{
			int stars = (loopCounter*2)+1;
			int spaces = decrease-1;
			
			//calls on spaces method
			for (int spacesCount = 0; spacesCount != spaces; spacesCount ++)
				printSpaces(spaces);
			
			//calls on stars method
			for (int starCount = 0; starCount != stars; starCount ++)
				printStars(stars);
			System.out.println();
			
			//adjusts variable for a new line
			loopCounter ++;
			decrease --;

		}

	}
	//prints the stars each line
	public static void printStars (int stars)
	{
		System.out.print("*");
	}
	//prints the spaces each line
	public static void printSpaces (int spaces)
	{
		System.out.print(" ");
	}

}