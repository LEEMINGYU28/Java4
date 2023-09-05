package c230905;

import java.util.Scanner;

enum SELECT{
	INVENTORY,
	EQUIP_ITEM,
	UNEQUIP_ITEM,
	EXIT,
	INBALID
}

public class App {

	public static void main(String[]args) {
		
		Player player = new Player(0,0);
		
		Item item1=new Item("집행검",0,10);
		Item item2=new Item("누더기 갑옷",5,0);
		
		player.AddItem(item1);
		player.AddItem(item2);
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while(true) {
			
			System.out.println("1.인벤토리 보기");
			System.out.println("2.아이템 장착");
			System.out.println("3.아이템 탈착");
			System.out.println("4.종료");
			System.out.println("메뉴선택 : ");
		choice=scanner.nextInt();	
		SELECT userSelect = select(choice);  // 메인 루프
		
			switch(userSelect) {
				case INVENTORY:
						player.listInventory();
					break;
				case EQUIP_ITEM:
					System.out.println("장착할 아이템 번호 입력 : ");
					int idx=scanner.nextInt();
					player.equipItem(idx);
					break;
				case UNEQUIP_ITEM:
					System.out.println("장착할 아이템 번호 입력 : ");
					int unidx=scanner.nextInt();
					player.equipItem(unidx);
					break;
			}
		}
	}
	private static SELECT select(int select) {
		switch (select) {
		case 1:return SELECT.INVENTORY;
		case 2:return SELECT.EQUIP_ITEM;
		case 3:return SELECT.UNEQUIP_ITEM;
		case 4:return SELECT.EXIT;
		default : return SELECT.INBALID;
		}
	}
	//ArrayList를활용해서 stack 구현
	//
}
