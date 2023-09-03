package GuessingGame;

import java.util.Scanner;

public class Inventory 
{
	Scenario scenario = new Scenario();
	Scanner scanner = new Scanner(System.in);
	protected String[] evidences = new String[5];			
	
	protected int inven(String player) {//인벤토리
	boolean key = false;
		player=scanner.nextLine();
		if(player.equals("v")) 
		{	
			for(int i=0; i <evidences.length; i++) 
			{
				
				if(evidences[i]!=null)
					{
					System.out.println(evidences[i]);
					};
			}		
		};
		for(String item : evidences) {
			if(item.equals("피해자 방 열쇠")) {
				key=true;
				break;
			}
		}
		return 0;
	}

	
 }