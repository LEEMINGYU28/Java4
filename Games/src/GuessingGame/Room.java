package GuessingGame;

import java.util.Scanner;

public class Room {
		Scenario scenario = new Scenario();
		Evidence evidence = new Evidence();
		Inventory inventory = new Inventory();
		Scanner scanner = new Scanner(System.in);		
		Suspect suspect = new Suspect();				
		String[] name = new String[] {"침대","책상","액자"};
		String[] _inventory = new String[] {};
		
	protected String[] furniture = new String[] {"침대","액자","책상"};
		protected int rooms() {//방 구조 생성
			for (int i=0; i <3; i++) {
				int k=(int)(Math.random()*3);
		
				String temp=furniture[i];
				furniture[i]=furniture[k];
				furniture[k]=temp;
			}
			System.out.println("---------------------\n"
					+  	"|"+furniture[0]+"\t\t "+furniture[1]+"|\n"
					+   "|         \t "+furniture[2]+"|\n"
					+   "---------문----------");
			return 0;
		}
		protected int room1(String player) {//1번방 단서		
			boolean evidences =false;
			player=scanner.nextLine();
			while(!evidences) {
				
				if(player.equals("액자")) {
					System.out.println(scenario.find[1]);
					System.out.println(evidence.name[0]+evidence.description[0]
										+scenario.question[1]);
					player=scanner.nextLine();
					System.out.println("저장완료/인벤토리 확인=v입력");
					inventory.evidences[0]=evidence.name[0];
					inventory.inven(player);
					_inventory = inventory.evidences.clone();
					System.out.println(scenario.question[2]);
					evidences=true;																		
				}	
				else if (player.equals("책상") || player.equals("침대")) {
	                System.out.println(scenario.search[0]);
	                player=scanner.nextLine();
	                continue;
				}
				else {
					System.out.println("재입력");
					player=scanner.nextLine();
				}
			}								
			return 0;	
		};
		protected int room2(String player) {//2번방 단서				
			boolean evidences =false;
			boolean number = false;
			player=scanner.nextLine();
			while(!evidences) {
				
				if(player.equals("책상")) {
					System.out.println(scenario.find[2]);
					System.out.println(evidence.name[1]+evidence.description[1]);
					player=scanner.nextLine();
					while(!number) {
						if(player.equals("0828")) {
							System.out.println("최근통화목록:투숙객D\n마지막통화는 투숙객D와 한거같다.\n다음 >n입력");
							inventory.evidences[1]=evidence.name[1];
							inventory.inven(player);
						number=true;
						}else {
							System.out.println("비밀번호가 틀렸습니다. 재입력해주세요.");
							player = scanner.nextLine();
						}
					}
					evidences=true;
				}
				else if (player.equals("액자") || player.equals("침대")) {
	                System.out.println(scenario.search[0]);
	                player=scanner.nextLine();
	                continue;
				}
				else {
					System.out.println("재입력");
					player=scanner.nextLine();
				}
			}								
			return 0;			
		};
		protected int room3(String player) {//3번방 단서					
			boolean evidences =false;
			player=scanner.nextLine();
			while(!evidences) {
				
				if(player.equals("책상")) {
					System.out.println(scenario.find[2]);
					System.out.println(evidence.name[2]+evidence.description[2]
									+scenario.question[1]);
					player=scanner.nextLine();
					System.out.println("저장완료/인벤토리 확인=v입력");
					inventory.evidences[2]=evidence.name[2];
					inventory.inven(player);
					System.out.println(scenario.question[2]);
					evidences=true;
				}
				else if (player.equals("액자") || player.equals("침대")) {
	                System.out.println(scenario.search[0]);
	                player=scanner.nextLine();
	                continue;
				}
				else {
					System.out.println("재입력");
					player=scanner.nextLine();
				}
			}								
			return 0;				
		};
		protected int room4(String player) {//4번방 단서				
			boolean evidences =false;
			player=scanner.nextLine();
			while(!evidences) {
				
				if(player.equals("침대")) {
					System.out.println(scenario.find[0]);
					System.out.println(evidence.name[3]+evidence.description[3]
									+scenario.question[1]);
					player=scanner.nextLine();
					System.out.println("저장완료/인벤토리 확인=v입력");
					inventory.evidences[3]=evidence.name[3];
					inventory.inven(player);
					System.out.println(scenario.question[2]);
					evidences=true;
				}
				else if (player.equals("액자") || player.equals("책상")) {
	                System.out.println(scenario.search[0]);
	                player=scanner.nextLine();
	                continue;
				}
				else {
					System.out.println("재입력");
					player=scanner.nextLine();
				}
			}								
			return 0;		
		};
		protected int room5(String player) {//5번방 단서
			boolean evidences =false;
			player=scanner.nextLine();
			while(!evidences) {
				
				if(player.equals("침대")) {
					System.out.println(scenario.find[0]);
					System.out.println(evidence.name[4]+evidence.description[4]
									+scenario.question[1]);
					player=scanner.nextLine();
					System.out.println("저장완료/ 인벤토리 확인= v입력");
					inventory.evidences[4]=evidence.name[4];
					inventory.inven(player);
					evidences=true;
				}
				else if (player.equals("액자") || player.equals("책상")) {
	                System.out.println(scenario.search[0]);
	                player=scanner.nextLine();
	                continue;
				}
				else {
					System.out.println("재입력");
					player=scanner.nextLine();
				}
			}								
			return 0;	
		};
}
	

