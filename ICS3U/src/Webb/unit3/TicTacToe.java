package Webb.unit3;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		String[][] tttboard= {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};




		for (int row1 = 0; row1<10; row1++)
		{


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

			System.out.println("where would player one like to go? type in the number");
			String player1= sc.nextLine();
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
			
			System.out.println("where would player two like to go? type in the number");
			String player2= sc.nextLine();
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
			//int player2 = sc.nextInt();
			//			
			//			if(player1= 1)
			//			{
			//				tttboard[0][0]=("X");
			//				
			//			}
			//			else if(player1= 2)
			//			{
			//				tttboard[0][2]=("X");
			//			}
			//			else if(player1= 3)
			//			{
			//				tttboard[0][2]=("X");
			//			}
			//			else if(player1= 4)
			//			{
			//				tttboard[1][0]]=("X");
			//			}
			//			else if(player1= 5)
			//			{
			//				tttboard[0][2]=("X");
			//			}
			//System.out.println(tttboard[row][col]);
			
		}





	}

}
}
