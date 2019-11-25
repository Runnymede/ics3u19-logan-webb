package Webb.unit2;

public class LicenseToRide {
	/*
	 * License to ride
	 * this program is meant to add up all of the possible 4 
	 * digit combinations and check it their sum is over 34
	 * November 14
	 * @author Logan Webb
	 */
	public static void main(String[] args) {
		//this is the entry point to the program
		// Variables for the if statement
		int counter = 0;
		int num;
		//first loop for first digit
		for(int a = 9; a >= 0; a--)
		{
			//second loop for second digit
			for(int b = 9; b >= 0; b--)
			{
				//third loop for third digit
				for(int c = 9; c >= 0; c--)
				{
					//fourth loop for fourth digit
					for(int d = 9; d >= 0; d--)
					{
						//Checking id the sum of the numbers is greater than 34
						num = a + b + c + d;
						if (num >= 34)
						{
							counter++;
						}
					}
				}
			}
		}
		//printing the number of combinations that are greater than 34
		System.out.println("the number of combonations that add up to 34 or greater"
				+ " is "+counter);
	}

}
