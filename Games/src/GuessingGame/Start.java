package GuessingGame;

import java.util.Scanner;

public class Start {
	Scanner scanner = new Scanner(System.in);
	String player;
	Scenario scenario = new Scenario();
	Room room = new Room();
	Suspect suspect = new Suspect();
	Inventory inventory = new Inventory();
	Evidence evidence = new Evidence();
	protected int start() {
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
		}	else {
			}
		return 0;	
	}		
//		protected int input() {
//		boolean inputs = false;
//		player = scanner.nextLine();
//		while(!inputs) {
//			if(player.equals("i")) {
//				System.out.println("저장완료/인벤토리 확인=v입력");
//				inputs=true;
//				player = scanner.nextLine();
//				}else if(player.equals("v")) {
//					inventory.evidences[0]=evidence.name[0];
//					inventory.inven(player);
//					System.out.println(scenario.question[2]);
//				}
//				else {
//					System.out.println("재입력");
//					player = scanner.nextLine();
//				}
//			}
//		return 0;
//		}
//			
	}

