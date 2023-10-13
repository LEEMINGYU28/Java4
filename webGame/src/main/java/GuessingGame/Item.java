package GuessingGame;

class Item {
	Room room = new Room();
	Scenario scenario = new Scenario();
	private String name;
	private boolean equipped;
	
	public Item(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public boolean isEquipped() {
		return equipped;
	}
	public void getKey() {
	
	equipped=true;
	System.out.println(room.rooms() + 5 + "번방 피해자의 방이다." + scenario.question[0]);
	}
	public void unkey() {
		equipped=false;
		System.out.println("열쇠가 없습니다.");
	}

}
