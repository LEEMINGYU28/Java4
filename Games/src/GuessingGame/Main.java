package GuessingGame;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
	Evidence evidence =new Evidence();
	Scenario scenario =new Scenario();
	Suspect suspect =new Suspect();
	Inventory inventory=new Inventory();
	Room room =new Room();
	Room1 room1 =new Room1();
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
			player=scanner.nextLine();
			switch (player) 
			{
			case "침대": System.out.println(scenario.search[0]);	
						player=scanner.nextLine();

			case "책상": System.out.println(scenario.search[0]);
						player=scanner.nextLine();
						
			case "액자": System.out.println(scenario.find[1]);
						System.out.println(evidence.name[0]+evidence.description[0]
											+scenario.question[1]);
						player=scanner.nextLine();
						System.out.println("저장완료/인벤토리 확인=v입력");
						inventory.evidences[0]=evidence.name[0];
						break;	
			}		
			player=scanner.nextLine();
			if(player.equals("v")) 
			{	
				for(int i=0; i <inventory.evidences.length; i++) 
				{
					
					if(inventory.evidences[i]!=null)
						{
						System.out.println(inventory.evidences[i]);						};
				}
			}
		System.out.println(scenario.question[2]);
		player=scanner.nextLine();
		if(player.equals("y")) 
		{
		System.out.println(scenario.story[2]);
		}
		player=scanner.nextLine();
		switch (player) 
		{
		case "1":System.out.println("투숙객A:"+suspect.reiationship[0]);
				
		}
		
	}
}	
	else
	{
		System.out.println("게임종료");
	}
	
	
	
	}
}
