package Webb.unit4;

import java.util.Scanner;

public class IsoTirangle {
		
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int userheight;
	System.out.println("please enter the height of your triangle");
	userheight=sc.nextInt();
	
	DrawStars(userheight);
	DrawSpaces(userheight);
	}
	public static void DrawStars(int userheight) {
		for(int height=0; height<userheight;height++) {
			for(int numstars = 0;numstars>0;numstars+=2) {
				System.out.println("*");
			}
		}
	}
	public static void DrawSpaces(int userheight) {
		for(int height=0; height<userheight;height++) {
			for(int numstars = 0;numstars<2;numstars++) {
				System.out.println(" ");
			}
		}
	}
}
