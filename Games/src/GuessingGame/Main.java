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
		if(player.equals(">>"))
		{
			System.out.println(room.rooms()+1+suspect.information[0]+scenario.question[0]);					

			room.room1(player);


		System.out.println(scenario.question[2]);
		
		suspect.suspectA(player);

		System.out.println(scenario.question[5]);
		
		game.progress();
//		while(true) 
//		{
//			player=scanner.nextLine();
//			switch(player) 
//			{
//			case "2":System.out.println(room.rooms()+2+suspect.information[1]+scenario.question[0]);
//						room.room2(player);
//						System.out.println(scenario.question[2]);
//						suspect.suspectB(player);
//						
//			continue;
//			case "3":System.out.println(room.rooms()+3+suspect.information[2]+scenario.question[0]);
//						room.room3(player);
//						System.out.println(scenario.question[2]);
//						suspect.suspectC(player);
//						System.out.println(scenario.question[5]);
//			continue;
//			case "4":System.out.println(room.rooms()+4+suspect.information[3]+scenario.question[0]);
//						room.room4(player);
//						System.out.println(scenario.question[2]);
//						suspect.suspectD(player);
//						System.out.println(scenario.question[5]);
//			continue;
//			case "5":System.out.println(5+suspect.information[4]+"\n열쇠사용하기 > 사용입력");}						
//			         	player=scanner.nextLine();
//						System.out.println(room.rooms()+5+"번방 피해자의 방이다."+scenario.question[0]);
//						room.room5(player);
//						System.out.println(scenario.question[6]);
//						suspect.victim(player);
//						System.out.println(scenario.question[5]);
//		}
	}	
}	
	else
	{
		System.out.println("게임종료");
	}
	
	
	
	}
}
