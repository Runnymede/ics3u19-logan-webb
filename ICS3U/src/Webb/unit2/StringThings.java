package Webb.unit2;
import java.util.Scanner;
/*
 * package check
 * this a program is practice with the string class
 * oct 8 2019
 * @author Logan Webb
 */
public class StringThings {

	public static void main(String[] args) {
		//this is the entry point to the program
		Scanner sc=new Scanner(System.in);		
		// varibles
		String word;
		// asking for inputs
		System.out.println("please enter a word that is atleast 7 letters long");
		word=sc.next();
		//changing the word
		System.out.println(word);
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
		System.out.println(word.length());
		System.out.println(word.charAt(6));

		//new program, and declaring variables
		String word2;
		String word3;
		//asking for a word
		System.out.println("please input a word");
		word2=sc.next();
		//asking for a word to compare it to
		System.out.println("what word would you like to compare it to");
		word3=sc.next();
		// if statments to compare the words
		if (word2.equals(word3))
		{
			System.out.println("the words are the same");
		}
		else 
		{
			System.out.println("the words are not the same");	
		}


		if (word2.compareTo(word3)<0) 
		{
			System.out.println("the words are letters apart");	
		}
		else
		{
			System.out.println("the words are the same");	
		}


		// new program, and variables
		String word4;
		String word5;
		// asking for username and password
		System.out.println("please input a username");
		word4=sc.next();

		System.out.println("please input a password");
		word5=sc.next();
		// checking if username and password are correct
		if(word4.equals("kemps"))
		{
			System.out.print("correct username");
		}
		else 
		{
			System.out.println("incorrect user");
		}



		if (word5.equals("class"))
		{
			System.out.println("the password is correct,");
		}
		else
		{
			System.out.println(" the password is incorrect");
		}
	}

}
