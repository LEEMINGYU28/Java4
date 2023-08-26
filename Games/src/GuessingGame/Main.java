package GuessingGame;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
	Evidence evidence =new Evidence();
	Scenario scenario =new Scenario();
	Room room =new Room();
	
	Scanner scanner = new Scanner(System.in);
	String player;
	
	room.roomMap();
	
	
	System.out.println("게임을 시작하시겠습니까? yes/no 입력");
	player = scanner.nextLine();
	if(player.equals("yes")) 
	{
		System.out.println("\n스토리\n"+scenario.story[0]+"\n 호텔 입장 >입력");
		
		player = scanner.nextLine();
		while(!player.equals(">")) 
		{
			System.out.println("> 입력");
			player = scanner.nextLine();
		}
		if(player.equals(">"))
		{
			System.out.println(scenario.story[1]);			
			
		}
	}	
	else
	{
		System.out.println("게임종료");
	}
	
	
	
	}
}
