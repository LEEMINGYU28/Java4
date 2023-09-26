package GuessingGame;

import java.util.Scanner;


public class Main {
	
	public static void main(String[]args) {
	Scenario scenario =new Scenario();
	Suspect suspect =new Suspect();
	Room room =new Room();
	Games game = new Games();
	Start start = new Start();
	Scanner scanner = new Scanner(System.in);
	String player;
		
		
	System.out.println("게임을 시작하시겠습니까? yes/no 입력");
	player = scanner.nextLine();
	if(player.equals("yes")) 
	{

			start.start();
			
			start.start2();
			
			room.room1(player);		
			
			suspect.suspectA(player);			
//			System.out.println(scenario.question[5]);			
			game.progress(room);
			
			
	}	
		else
		{
		System.out.println("게임종료");
		}
	
	
	
	}
}
