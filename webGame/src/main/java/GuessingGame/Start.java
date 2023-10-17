package GuessingGame;

import java.util.Scanner;

public class Start extends Room {
	Scanner scanner = new Scanner(System.in);
	String player;
	Scenario scenario = new Scenario();
	Room room = new Room();
	Suspect suspect = new Suspect();

	
	
	protected void start() {
		System.out.println("\n스토리\n" + scenario.story[0] + "\n 호텔 입장 >입력");

		while (true) {
			player = scanner.nextLine();
			switch (player) {
			case ">":
				System.out.println(scenario.story[1]);
				return;
			default:
				System.out.println(">입력");
				break;
			}
		}
//		while(!player.equals(">")) 
//		{
//			System.out.println("> 입력");
//			player = scanner.nextLine();
//		}
//		if(player.equals(">"))
//		{
//			System.out.println(scenario.story[1]);
//			player = scanner.nextLine();
//		}
//		while(!player.equals(">>")) 
//		{
//			System.out.println(">> 입력");
//			player = scanner.nextLine();
//		}
//		if(player.equals(">>"))
//		{
//			System.out.println(room.rooms()+1+suspect.information[0]+scenario.question[0]);					
//		}	else {
//			}
//		return 0;	
	}

	protected void start2() {
		while (true) {
			player = scanner.nextLine();
			switch (player) {
			case ">>":
				System.out.println(room.rooms() + 1 + suspect.information[0] + scenario.question[0]);
				return;
			default:
				System.out.println(">>입력");
				break;
			}
		}
	}

}
