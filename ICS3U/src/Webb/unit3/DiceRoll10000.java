package Webb.unit3;
/*
 * diceroll10000
 * this a program will roll 2 dice 10000 times and count the total times each number is rolled
 * nov 24 2019
 * @author Logan Webb
 */
public class DiceRoll10000 {

	public static void main(String[] args) {
	
		// making all the possable options to roll
		int[] rollnumber= {2,3,4,5,6,7,8,9,10,11,12};
		// making the sum for all the rolls
		int[] rollsum=    {0,0,0,0,0,0,0,0,0,0,0};
		
		// loop to role the dice 10000 times
		for(int rollnum = 0; rollnum<=10000; rollnum++)
		{
		
		int dice1;
		int dice2;
		int sum;

		// roling the dice
		dice1=(int)(Math.random()*6)+1;
		dice2=(int)(Math.random()*6)+1;
		sum= dice1+dice2;
		
// counting up the sum of the rolls
		switch(sum)
		{
		case 2: rollsum[0]++;
		break;
		case 3: rollsum[1]++;
		break;
		case 4: rollsum[2]++;
		break;
		case 5: rollsum[3]++;
		break;
		case 6: rollsum[4]++;
		break;
		case 7: rollsum[5]++;
		break;
		case 8: rollsum[6]++;
		break;
		case 9: rollsum[7]++;
		break;
		case 10: rollsum[8]++;
		break;
		case 11: rollsum[9]++;
		break;
		case 12: rollsum[10]++;
		break;
		default: break;
		
		}
		
		}
		// printing the totals
		System.out.format("%-10s %20s %20s", "total", "number of rolls","\n");
		for(int i = 0;i<11; i++)
		{
			System.out.format("%-10s %20s %20s", rollnumber[i], rollsum[i], "\n");
		}
		
		
		
		

	}

}
