package NumberPuzzleOOP;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) 
	{
		Puzzle puzzle = new Puzzle();
		Player player = new Player();
		
		puzzle.setPlayer(player);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇짜리 퍼즐 맞출래 n * n");
		int count = scanner.nextInt();
		
		puzzle.setPuzzle(count,count);
		puzzle.print();
	
		while(true) 
		{
			if(puzzle.getIsEnd()) break;

			System.out.println("p를 옮겨서 1~"+(count * count - 1)+ "순서를 맞춰라");
			System.out.println("상 : 8 하 : 2 좌 : 4 우 : 6 / 0 : 종료 / S : 리셋");
			int direction = scanner.nextInt();
			if(direction == 0)break;
			if(direction == 5)puzzle.shuffle();
			puzzle.movePlayer(direction);
			puzzle.print();
		}
		System.out.println("끝");
	
	
	}
}
