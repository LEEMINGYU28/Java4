package GuessingGame;

import java.util.Scanner;


public class Main {
	
	public static void main(String[]args) {
	Evidence evidence =new Evidence();
	Scenario scenario =new Scenario();
	Suspect suspect =new Suspect();
	Inventory inventory=new Inventory();
	Room room =new Room();
	Games game = new Games();
	Scanner scanner = new Scanner(System.in);
	String player;
		
	
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
			player = scanner.nextLine();
		}
		while(!player.equals(">>")) 
		{
			System.out.println(">> 입력");
			player = scanner.nextLine();
		}
		if(player.equals(">>"))
		{
			System.out.println(room.rooms()+1+suspect.information[0]+scenario.question[0]);					

			room.room1(player);


		System.out.println(scenario.question[2]);
		
		suspect.suspectA(player);

		System.out.println(scenario.question[5]);
		
		game.progress();

	}	
}	
	else
	{
		System.out.println("게임종료");
	}
	
	
	
	}
}