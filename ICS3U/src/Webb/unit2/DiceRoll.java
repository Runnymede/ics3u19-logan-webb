package Webb.unit2;

public class DiceRoll {

	public static void main(String[] args) {

		System.out.format("%10s %10s %10s", "Dice 1", "Dice 2","Sum" );
		System.out.println("");
		for(int roll=1; roll<5; roll++)
		{
			int dice1;
			int dice2;
			int sum;

			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;
			sum= dice1+dice2;

			System.out.format("%10s %10s %10s", (dice1), (dice2),(sum) );
			System.out.println("");
		}
		
	}

}
