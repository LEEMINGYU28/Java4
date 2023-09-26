package c230925;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[1];
		int count = 10;

		StartGame(number, count);
		for (int i = 0; i < number.length; i++) {
			int k = (int) (Math.random() * 999);
			number[i] = k;
		}
		System.out.println(number[0]);
		System.out.println("랜덤숫자 맞추기 0~999");
		System.out.println("숫자입력");

		while (count > 0) {

			int player = scanner.nextInt();
			if (player < number[0]) {
				--count;
				System.out.println("Up\n" + "남은횟수" + count);
				System.out.println("숫자입력");
			} else if (player > number[0]) {
				--count;
				System.out.println("Down\n" + "남은횟수" + count);
				System.out.println("숫자입력");
			} else {
				System.out.println("정답!! 게임승리");
				break;
			}

			if (count == 0) {
				System.out.println("카운트 아웃 게임을 재시작하기 yes/no 입력");
				String players;
				while (true) {
					players = scanner.nextLine();
					switch (players) {
					case "yes":
						StartGame(number, 10);
						count = 10; // Reset the count
						System.out.println("게임 재시작!");
						break;
					case "no":
						System.exit(0);
					default:
						System.out.println("올바른 선택을 입력하세요 (yes/no):");
					}
					if (players.equals("yes") || players.equals("no")) {
						break;
					}
				}
			}
		}
	}

	private static void StartGame(int[] number, int count) {

	}
}
