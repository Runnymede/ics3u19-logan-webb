package Webb.culminating;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Scanner;

import hsa_new.Console;

public class PigGame {
	static Console c = new Console();
	static Console a = new Console();

	public static void main(String[] args) throws InterruptedException {

		Image[] pics = new Image [6];
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		pics[0]= toolkit.getImage("src/webb/culminating/Dice1.jpg");
		pics[1]= toolkit.getImage("src/webb/culminating/Dice2.jpg");
		pics[2]= toolkit.getImage("src/webb/culminating/Dice3.jpg");
		pics[3]= toolkit.getImage("src/webb/culminating/Dice4.jpg");
		pics[4]= toolkit.getImage("src/webb/culminating/Dice5.jpg");
		pics[5]= toolkit.getImage("src/webb/culminating/Dice6.jpg");
		Scanner sc=new Scanner(System.in);

		String player1name;
		String player2name;
		String decistion;
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

		while (player1total <= maxscore || player2total <= maxscore ){
			do {
				c.println(player1name+"'s roll");
				int dice1= dice1(pics);
				int dice2= dice2(pics);
				int sum = rolltotal(dice1,dice2);
				a.drawImage(pics[dice1-1], 5, 5, null);
				a.drawImage(pics[dice2-1], 75, 5, null);

				c.println("dice 1: "+dice1);
				c.println("dice 2: "+dice2);
				c.println("sum "+sum);
				printing(player1total,player2total,player1name,player2name);
				if (ones(dice1,dice2) == true){
					c.println("oh no! you rolled a 1 your score for this round is 0");
					printing(player1total,player2total,player1name,player2name);
					break;
				}
				else if(dice1 == 1 &&dice2 == 1) {
					c.println("oh no! you rolled double ones your score is now 0!!");
					player1total = 0;
					printing(player1total,player2total,player1name,player2name);
					break;
				}
				player1total=player1total+ sum;
				c.println("would you like to roll again (R)? pr hold(H)?");
				decistion=sc.nextLine();
				if (decistion. equals ("H")) {
					c.println("you total for this round is"+ player1total);
					printing(player1total,player2total,player1name,player2name);
					break;
				}

				printing(player1total,player2total,player1name,player2name);

//				c.clear();
//				Thread.sleep(1000);

			}while(decistion. equals ("R"));
			do {
				c.println(player2name+"'s roll");
				int dice1= dice1(pics);
				int dice2= dice2(pics);
				int sum = rolltotal(dice1,dice2);

				c.println("dice 1: "+dice1);
				c.println("dice 2: "+dice2);
				c.println("sum "+sum);
				printing(player1total,player2total,player1name,player2name);
				if (ones(dice1,dice2) == true){
					c.println("oh no! you rolled a 1 your score for this round is 0");
					printing(player1total,player2total,player1name,player2name);
					break;
				}
				else if(dice1 == 1 &&dice2 == 1) {
					c.println("oh no! you rolled double ones your score is now 0!!");
					player1total = 0;
					printing(player1total,player2total,player1name,player2name);
					break;
				}
				player2total=player2total+ sum;
				c.println("would you like to roll again (R)? pr hold(H)?");
				decistion=sc.nextLine();
				if (decistion. equals ("H")) {
					c.println("you total for this round is"+ player2total);
					printing(player1total,player2total,player1name,player2name);
					break;
				}

				printing(player1total,player2total,player1name,player2name);
//				Thread.sleep(1000);
//				c.clear();

			}while(decistion. equals ("R"));
		}
	}


	public static void printing(int player1total, int player2total, String player1name, String player2name){

		a.clear();
		a.println(player1name+" : "+ player1total);
		a.println(player2name+" : "+ player2total);
	}
	public static int dice1(Image[] pics) {
		int dice1;
		dice1=(int)(Math.random()*6)+1;
		return dice1;
	}
	public static int dice2(Image pics[]) {
		int dice2;
		dice2=(int)(Math.random()*6)+1;
		return dice2;
	}
	public static int rolltotal(int dice1, int dice2) {
		int sum = dice1 + dice2;
		return sum;	
	}
	public static boolean ones(int dice1, int dice2) {
		if (dice1==1||dice2==1) {
			return true;
		}
		else{
			return false;
		}
	}

}