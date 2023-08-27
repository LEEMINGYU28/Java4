package GuessingGame;

import java.util.Scanner;

public class Room1 extends Scenario{
	
	protected void Room1() {
		
		Scenario scenario = new Scenario();
		Scanner scanner = new Scanner(System.in);
		String player;
		player = scanner.nextLine();
		
		switch (player) 
		{
		case "침대": System.out.println(scenario.search[0]);	
		break;
		case "액자": System.out.println(scenario.find[0]);
		break;
		case "책상": System.out.println(scenario.search[0]);
		break;
		}
		System.out.println("");
	}

	}
	
