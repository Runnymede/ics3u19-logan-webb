package Webb.unit3;

import java.util.Scanner;
/*
 * TicTacToe 
 * this a program will let 2 players play tictactoe against each other
 * nov 29 2019
 * @author Logan Webb
 */
public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
// making the board		
		String[][] tttboard= {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

		for (int count = 0; count<=9; count++)
		{
//printing out the bored
			System.out.print(tttboard[0][0]+"  ");//1
			System.out.print(tttboard[0][1]+"  ");//2
			System.out.print(tttboard[0][2]+"  ");//3
			System.out.println(" ");
			System.out.print(tttboard[1][0]+"  ");//4
			System.out.print(tttboard[1][1]+"  ");//5
			System.out.print(tttboard[1][2]+"  ");//6
			System.out.println(" ");
			System.out.print(tttboard[2][0]+"  ");//7
			System.out.print(tttboard[2][1]+"  ");//8
			System.out.print(tttboard[2][2]+"  ");//9
// asking for player 1's move
			System.out.println("where would player one like to go? type in the number");
			String player1= sc.nextLine();
//inputing player 1's move into the board
			if(player1.equals("O"))
				
			switch(player1)
			{
			case "1":tttboard[0][0]=("X");
			break;
			case "2":tttboard[0][1]=("X");
			break;
			case "3":tttboard[0][2]=("X");
			break;
			case "4":tttboard[1][0]=("X");
			break;
			case "5":tttboard[1][1]=("X");
			break;
			case "6":tttboard[1][2]=("X");
			break;
			case "7":tttboard[2][0]=("X");
			break;
			case "8":tttboard[2][1]=("X");
			break;
			case "9":tttboard[2][2]=("X");
			break;
			default: break;
			}
			

			//looking for a winner on all vertical spots
			if(tttboard[0][0].equals("X")&&tttboard[1][0].equals("X")&&tttboard[2][0].equals("X")||
			   tttboard[0][1].equals("X")&&tttboard[1][1].equals("X")&&tttboard[2][1].equals("X")||
			   tttboard[0][2].equals("X")&&tttboard[1][2].equals("X")&&tttboard[2][2].equals("X"))
			{
				System.out.println("player 1 wins!!");
				break;

			}
			else if(tttboard[0][0].equals("O")&&tttboard[1][0].equals("O")&&tttboard[2][0].equals("O")||
					tttboard[0][1].equals("O")&&tttboard[1][1].equals("O")&&tttboard[2][1].equals("O")||
					tttboard[0][2].equals("O")&&tttboard[1][2].equals("O")&&tttboard[2][2].equals("O"))
			{
				System.out.println("player 2 wins!!");
				break;
			}
			//Looking for a winner on all horizontal spots
			else if(tttboard[0][0].equals("X")&&tttboard[0][1].equals("X")&&tttboard[0][2].equals("X")||
					tttboard[1][0].equals("X")&&tttboard[1][1].equals("X")&&tttboard[1][2].equals("X")||
					tttboard[2][0].equals("X")&&tttboard[2][1].equals("X")&&tttboard[2][2].equals("X"))
			{
				System.out.println("player 1 wins!!");
				break;
			}
			else if(tttboard[0][0].equals("O")&&tttboard[0][1].equals("O")&&tttboard[0][2].equals("O")||
					tttboard[1][0].equals("O")&&tttboard[1][1].equals("O")&&tttboard[1][2].equals("O")||
					tttboard[2][0].equals("O")&&tttboard[2][1].equals("O")&&tttboard[2][2].equals("O"))
			{
				System.out.println("player 2 wins!!");
				break;
			}
			//Looking for a winner on all diagonal spots
			else if(tttboard[0][0].equals("X")&&tttboard[1][1].equals("X")&&tttboard[2][2].equals("X")||
					tttboard[0][2].equals("X")&&tttboard[1][1].equals("X")&&tttboard[2][0].equals("X"))
			{
				System.out.println("player 1 wins!!");
				break;
			}
			else if(tttboard[0][0].equals("O")&&tttboard[1][1].equals("O")&&tttboard[2][2].equals("O")||
					tttboard[0][2].equals("O")&&tttboard[1][1].equals("O")&&tttboard[2][0].equals("O"))
			{
				System.out.println("player 2 wins!!");
				break;
			}
// printing out the board with player 1's move for player 2 to make their move
			System.out.print(tttboard[0][0]+"  ");//1
			System.out.print(tttboard[0][1]+"  ");//2
			System.out.print(tttboard[0][2]+"  ");//3
			System.out.println(" ");
			System.out.print(tttboard[1][0]+"  ");//4
			System.out.print(tttboard[1][1]+"  ");//5
			System.out.print(tttboard[1][2]+"  ");//6
			System.out.println(" ");
			System.out.print(tttboard[2][0]+"  ");//7
			System.out.print(tttboard[2][1]+"  ");//8
			System.out.print(tttboard[2][2]+"  ");//9
// asking for player 2's move
			System.out.println("where would player two like to go? type in the number");
			String player2= sc.nextLine();
//inputing player 1's move into the board		
			switch(player2)
			{
			case "1":tttboard[0][0]=("O");
			break;
			case "2":tttboard[0][1]=("O");
			break;
			case "3":tttboard[0][2]=("O");
			break;
			case "4":tttboard[1][0]=("O");
			break;
			case "5":tttboard[1][1]=("O");
			break;
			case "6":tttboard[1][2]=("O");
			break;
			case "7":tttboard[2][0]=("O");
			break;
			case "8":tttboard[2][1]=("O");
			break;
			case "9":tttboard[2][2]=("O");
			break;
			default: break;
			}
			//looking for a winner on all vertical spots
			if(tttboard[0][0].equals("X")&&tttboard[1][0].equals("X")&&tttboard[2][0].equals("X")||
					tttboard[0][1].equals("X")&&tttboard[1][1].equals("X")&&tttboard[2][1].equals("X")||
					tttboard[0][2].equals("X")&&tttboard[1][2].equals("X")&&tttboard[2][2].equals("X"))
			{
				System.out.println("player 1 wins!!");
				break;
			}
			else if(tttboard[0][0].equals("O")&&tttboard[1][0].equals("O")&&tttboard[2][0].equals("O")||
					tttboard[0][1].equals("O")&&tttboard[1][1].equals("O")&&tttboard[2][1].equals("O")||
					tttboard[0][2].equals("O")&&tttboard[1][2].equals("O")&&tttboard[2][2].equals("O"))
			{
				System.out.println("player 2 wins!!");
				break;
			}
			//Looking for a winner on all horizontal spots
			else if(tttboard[0][0].equals("X")&&tttboard[0][1].equals("X")&&tttboard[0][2].equals("X")||
					tttboard[1][0].equals("X")&&tttboard[1][1].equals("X")&&tttboard[1][2].equals("X")||
					tttboard[2][0].equals("X")&&tttboard[2][1].equals("X")&&tttboard[2][2].equals("X"))
			{
				System.out.println("player 1 wins!!");
				break;
			}
			else if(tttboard[0][0].equals("O")&&tttboard[0][1].equals("O")&&tttboard[0][2].equals("O")||
					tttboard[1][0].equals("O")&&tttboard[1][1].equals("O")&&tttboard[1][2].equals("O")||
					tttboard[2][0].equals("O")&&tttboard[2][1].equals("O")&&tttboard[2][2].equals("O"))
			{
				System.out.println("player 2 wins!!");
				break;
			}
			//Looking for a winner on all diagonal spots
			else if(tttboard[0][0].equals("X")&&tttboard[1][1].equals("X")&&tttboard[2][2].equals("X")||
					tttboard[0][2].equals("X")&&tttboard[1][1].equals("X")&&tttboard[2][0].equals("X"))
			{
				System.out.println("player 1 wins!!");
				break;
			}
			else if(tttboard[0][0].equals("O")&&tttboard[1][1].equals("O")&&tttboard[2][2].equals("O")||
					tttboard[0][2].equals("O")&&tttboard[1][1].equals("O")&&tttboard[2][0].equals("O"))
			{
				System.out.println("player 2 wins!!");
				break;
			}

		}
	}
}

