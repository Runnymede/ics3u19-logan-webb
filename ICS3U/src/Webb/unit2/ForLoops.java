package Webb.unit2;
/*
 * for loops 
 * this a program about checking to see how many digits a number has
 * nov 11 2019
 * @author Logan Webb
 */
public class ForLoops {

	public static void main(String[] args) throws InterruptedException {

		// printing hello 10 times
		for(int i= 0; i<10; i++)
		{
			System.out.println("hello");
		}
		// counting by 2's to 100	
		for (int number=0; number<102; number+=2)
		{
			System.out.println(number);
		}
		//counting down from 10 slowly till blast off
		for(int x=10; x>0; x--)
		{
			System.out.println(x);
			Thread.sleep(1000);
		}
		System.out.println("Blast off!");

		// powers table for numbers 1-5
		for(int base=1;base<6;base++)
		{ 
			for(int power=1;power<6;power++)
			{

				System.out.format("%10s", (Math.pow(base,power)));
			}
			System.out.println(" ");
		}

	}
}
