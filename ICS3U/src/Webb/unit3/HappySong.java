package Webb.unit3;
/*
 * HappySong
 * this a program will roll 2 dice 10000 times and count the total times each number is rolled
 * nov 24 2019
 * @author Logan Webb
 */
public class HappySong {

	public static void main(String[] args) {
		
		// setting all of the variations for the lyrics
		String[] lyrics = {"clap your hands","stomp your feet", "write some code", "say hello",
				"raise your hand", "sing a song", "spin around", "jump up and down",
				"step to the left", "step to the right", "and you really want to show it"};
		
		// printing out the song
		for (int i = 0; i<10; i++)
		{
			System.out.println("if your happy and you know it "+lyrics[i]);
			System.out.println("if your happy and you know it "+lyrics[i]);
			System.out.println("if your happy and you know it "+lyrics[10]);
			System.out.println("if your happy and you know it "+lyrics[i]);
			System.out.println(" ");
			
		}
	}

}
