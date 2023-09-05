package GuessingGame;

import java.util.ArrayList;
import java.util.List;

class Player {

	private List<Item> intventory;
	String evidence;
	ArrayList<String> inventory;
	public Player(String evidence) {
		this.evidence = evidence;
		inventory = new ArrayList<>();
		
	}
	public void AddItem(String evidence1) {
	inventory.add(" ");
	inventory.add(" ");
	
	}
	public void listInventory() {
//	System.out.println("단서 목록 : "+inventory.get(inventory.size()-1));
		for(String item : inventory) {
			System.out.println(item);
		}

	}
	
}
