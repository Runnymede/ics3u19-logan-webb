package Webb.unit4;
import java.util.Scanner;
/*
 * printsignature
 * this a program will print an ascii text using two methods
 * nov 29 2019
 * @author Logan Webb
 */
public class PrintSignature {
	public static void printsignature()
	{
		System.out.println("8 8888         ,o888888o.         ,o888888o.          .8.          b.             8"); 
		System.out.println("8 8888      . 8888     `88.      8888     `88.       .888.         888o.          8"); 
		System.out.println("8 8888     ,8 8888       `8b  ,8 8888       `8.     :88888.        Y88888o.       8");
		System.out.println("8 8888     88 8888        `8b 88 8888              . `88888.       .`Y888888o.    8");
		System.out.println("8 8888     88 8888         88 88 8888             .8. `88888.      8o. `Y888888o. 8");
		System.out.println("8 8888     88 8888         88 88 8888            .8`8. `88888.     8`Y8o. `Y88888o8");
		System.out.println("8 8888     88 8888        ,8P 88 8888   8888888 .8' `8. `88888.    8   `Y8o. `Y8888");
		System.out.println("8 8888     `8 8888       ,8P  `8 8888       .8'.8'   `8. `88888.   8      `Y8o. `Y8");
		System.out.println("8 8888      ` 8888     ,88'      8888     ,88'.888888888. `88888.  8         `Y8o.`");
		System.out.println("8 888888888888 `8888888P'         `8888888P' .8'       `8. `88888. 8            `Yo");
		

	}
	public static void DrawTurtle() {
	
    System.out.println("               __   ");
    System.out.println("    .,-;-;-,. /'_\\  ");
	System.out.println("  _/_/_/_|_\\_\\) /  ");
	System.out.println("'-<_><_><_><_>=/\\  ");
	System.out.println("  `/_/====/_/-'\\_\\ ");
	System.out.println("   \"\"     \"\"    \"\" ");
	}
	public static void main(String[] args) {
		printsignature();
		DrawTurtle();
	}
}