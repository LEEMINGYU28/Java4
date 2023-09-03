package GuessingGame;

import java.util.Scanner;

public class Games extends Inventory
{
	Scanner scanner = new Scanner(System.in);
	String player;
	Room room =new Room();
	Scenario scenario = new Scenario();
	Suspect suspect = new Suspect();
	
	
	protected int progress() {
		while(true) 
		{
			player=scanner.nextLine();
			switch(player) 
			{
			case "2":System.out.println(room.rooms()+2+suspect.information[1]+scenario.question[0]);
						room.room2(player);
						System.out.println(scenario.question[2]);
						suspect.suspectB(player);
						System.out.println(scenario.question[5]);
			continue;
			case "3":System.out.println(room.rooms()+3+suspect.information[2]+scenario.question[0]);
						room.room3(player);
						System.out.println(scenario.question[2]);
						suspect.suspectC(player);
						System.out.println(scenario.question[5]);
			continue;
			case "4":
				System.out.println(room.rooms()+4+suspect.information[3]+scenario.question[0]);
						room.room4(player);
						System.out.println(scenario.question[2]);
						suspect.suspectD(player);
						System.out.println(scenario.question[5]);
			continue;
			case "5":
		        System.out.println(5 + suspect.information[4] + "\n열쇠사용하기 > 사용입력");
		        player = scanner.nextLine();
		        	inven(player);
		            System.out.println(room.rooms() + 5 + "번방 피해자의 방이다." + scenario.question[0]);
		            room.room5(player);
		            System.out.println(scenario.question[6]);
		            suspect.victim(player);
		            System.out.println(scenario.question[5]);

		            System.out.println("열쇠가 없습니다.");
		        continue;
			}
	}

	}

}