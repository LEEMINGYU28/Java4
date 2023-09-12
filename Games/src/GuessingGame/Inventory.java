package GuessingGame;

import java.util.Scanner;

public class Inventory {
	Scanner scanner = new Scanner(System.in);
	protected String[] evidences = new String[5];
	
		Inventory() {
			for (int i=0;i<5;i++) {
			evidences[i]="";
			}			
		}

	protected int inven(String player) {//인벤토리
		if(player.equals("v")) 
		{	
			for(int i=0; i <evidences.length; i++) 
			{
				
				if(evidences[i]!="")
					{
					System.out.println(evidences[i]);
					};
			}		
		};
		return 0;	
	}
	

}