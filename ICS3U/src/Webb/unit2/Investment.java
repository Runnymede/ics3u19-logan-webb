package Webb.unit2;

public class Investment {
	/*
	 * investment
	 * this a program is checking how long an inbvestment will take
	 * oct 22 2019
	 * @author Logan Webb
	 */
	public static void main(String[] args) {
		//this is the entry point to the program
		//Variables
		double money=2500;
		double increase=1.075;
		int year=0;
		//loop to check how much the money increases each year
		while(money <5000)
		{
			money=(money*increase);
			year=year+1;
		}
		System.out.println("it will take you "+year+" years"+" to make "+money);

	}

}