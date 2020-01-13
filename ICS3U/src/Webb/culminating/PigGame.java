package Webb.culminating;

import java.util.Scanner;

import hsa_new.Console;

public class PigGame {

	public static void main(String[] args) {
		Console c = new Console();
		Console a = new Console();
		Scanner sc=new Scanner(System.in);

		String player1name;
		String player2name;
		int maxscore = 100;
		int player1total = 0;
		int player2total = 0;


		c.println("hello welcome to the game of pig! This game works by having two players\n"
				+ "take turns rolling two dice,  you will be trying to accumulate the most\n"
				+ "points by either rolling the dice again or holding the dice and the first \n"
				+ "player to 100 points wins. However, if you roll a one the total amount of\n"
				+ "points that they have accumulated during the round is reduced to zero and\n"
				+ "it is the next player’s turn. When playing pig if double ones are rolled\n"
				+ "that player’s total score is reduced to zero.\n");

		c.println("player 1 please input your name");
		player1name= sc.nextLine();

		c.println("player 2 please input your name");
		player2name= sc.nextLine();

		while (player1total != maxscore || player2total != maxscore ){
			do {
				c.println(player1name+"'s roll");
				int dice1= dice1();
				int dice2= dice2();
				int sum = rolltotal();


			}while(player1total != maxscore);
		}
	}
	public static int dice1() {
		int dice1;S
		dice1=(int)(Math.random()*6)+1;
		return dice1;
	}
	public static int dice2() {
		int dice2;
		dice2=(int)(Math.random()*6)+1;
		return dice2;
	}
	public static int rolltotal() {
		int sum = dice1() + dice2();
		return sum;
	}
}