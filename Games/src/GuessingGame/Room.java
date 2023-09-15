package GuessingGame;

import java.util.Scanner;

public class Room {

	Scenario scenario = new Scenario();
	Evidence evidence = new Evidence();
	Inventory inventory = new Inventory();
	Scanner scanner = new Scanner(System.in);
	Suspect suspect = new Suspect();
	Player players = new Player(null);

	protected String[] furniture = new String[] { "침대", "액자", "책상" };

	protected int rooms() {// 방 구조 생성 
		for (int i = 0; i < 3; i++) {
			int k = (int) (Math.random() * 3);

			String temp = furniture[i];
			furniture[i] = furniture[k];
			furniture[k] = temp;
		}
		System.out.println("---------------------\n" + "|" + furniture[0] + "\t\t " + furniture[1] + "|\n"
				+ "|         \t " + furniture[2] + "|\n" + "---------문----------");
		return 0;
	}

	protected void room1(String player) {// 1번방 단서 2
		boolean evidences = false;
		player = scanner.nextLine();

		while (!evidences) {
			switch (player) {
			case "액자":
				System.out.println(scenario.find[1]);
				System.out.println(evidence.name[0] + evidence.description[0] + scenario.question[1]);
				while (true) {

					player = scanner.nextLine();
					switch (player) {
					case "i":
						System.out.println("저장완료 인벤토리 확인='v'입력");
						while (true) {
							player = scanner.nextLine();
							switch (player) {
							case "v":
								inventory.evidences[0] = evidence.name[0];
								inventory.inven(player);
								System.out.println(scenario.question[2]);
								evidences = true;
								return;
							default:
								System.out.println("v재입력");
								break;
							}
						}
					default:
						System.out.println("i 재입력");
						break;
					}
				}
			default:
				System.out.println("아무것도 안보인다. 다른곳을 조사해보자.");
				player = scanner.nextLine();
				break;
			}

		}

	};

//		while (!evidences) {
//			if (player.equals("액자")) {
//				System.out.println(scenario.find[1]);
//				System.out.println(evidence.name[0] + evidence.description[0] + scenario.question[1]);
//				player = scanner.nextLine();
//				players.AddItem("핸드폰");
//				players.listInventory();
//				inventory.evidences[0] = evidence.name[0];
//				inventory.evidences[0] = "피해자 핸드폰";
//				inventory.inven(player);
//				System.out.println(scenario.question[2]);
//				evidences = true;
//			} else if (player.equals("책상") || player.equals("침대")) {
//				System.out.println(scenario.search[0]);
//				player = scanner.nextLine();
//				continue;
//			} else {
//				System.out.println("재입력");
//				player = scanner.nextLine();
//			}
//			break;
//		}

	protected void room2(String player) {// 2번방 단서
		boolean evidences = false;
		boolean number = false;
		player = scanner.nextLine();

		while (!evidences) {
			switch (player) {
			case "책상":
				System.out.println(scenario.find[2]);
				System.out.println(evidence.name[1] + evidence.description[1]);
				while (true) {

					player = scanner.nextLine();
					switch (player) {
					case "0828":
						System.out.println("최근통화목록:투숙객D\n마지막통화는 투숙객D와 한거같다.\n다음 'n'입력");
						inventory.evidences[1] = evidence.name[1];
						inventory.evidences[1] = "피해자 비밀번호:0828";
						inventory.inven(player);
						while (true) {
							player = scanner.nextLine();
							switch (player) {
							case "n":
								inventory.evidences[0] = evidence.name[0];
								inventory.inven(player);
//								System.out.println(scenario.question[2]);
								evidences = true;
								return;
							default:
								System.out.println("n재입력");
								break;
							}
						}
					default:
						System.out.println("비밀번호가 틀렸습니다. 재입력");
						break;
					}
				}
			default:
				System.out.println("아무것도 안보인다. 다른곳을 조사해보자.");
				player = scanner.nextLine();
				break;
			}

		}
	};

//			if (player.equals("책상")) {
//				System.out.println(scenario.find[2]);
//				System.out.println(evidence.name[1] + evidence.description[1]);
//				player = scanner.nextLine();
//				while (!number) {
//					if (player.equals("0828")) {
//						System.out.println("최근통화목록:투숙객D\n마지막통화는 투숙객D와 한거같다.\n다음 'n'입력");
//						inventory.evidences[1] = evidence.name[1];
//						inventory.evidences[1] = "피해자 비밀번호:0828";
//						inventory.inven(player);
//						number = true;
//					} else {
//						System.out.println("비밀번호가 틀렸습니다. 재입력해주세요.");
//						player = scanner.nextLine();
//					}
//				}
//				evidences = true;
//			} else if (player.equals("액자") || player.equals("침대")) {
//				System.out.println(scenario.search[0]);
//				player = scanner.nextLine();
//				continue;
//			} else {
//				System.out.println("재입력");
//				player = scanner.nextLine();
//			}
//		}

	protected void room3(String player) {// 3번방 단서
		boolean evidences = false;
		player = scanner.nextLine();
		while (!evidences) {

			switch (player) {
			case "액자":
				System.out.println(scenario.find[1]);
				System.out.println(evidence.name[2] + evidence.description[2] + scenario.question[1]);
				while (true) {

					player = scanner.nextLine();
					switch (player) {
					case "i":
						System.out.println("저장완료 인벤토리 확인='v'입력");
						while (true) {
							player = scanner.nextLine();
							switch (player) {
							case "v":
								inventory.evidences[2] = evidence.name[2];
								inventory.inven(player);
								evidences = true;
								return;
							default:
								System.out.println("v재입력");
								break;
							}
						}
					default:
						System.out.println("i 재입력");
						break;
					}
				}
			default:
				System.out.println("아무것도 안보인다. 다른곳을 조사해보자.");
				player = scanner.nextLine();
				break;
			}
		}
	};

//			if (player.equals("책상")) {
//				System.out.println(scenario.find[2]);
//				System.out.println(evidence.name[2] + evidence.description[2] + scenario.question[1]);
//				player = scanner.nextLine();
//				System.out.println("저장완료/인벤토리 확인='v'입력");
//				players.AddItem("피해자 방 열쇠");
//				players.listInventory();
//				players.AddItem(evidence.name[2]);
//				inventory.evidences[2] = evidence.name[2];
//				inventory.evidences[2] = "피해자 방 열쇠";
//				inventory.inven(player);
//				System.out.println(scenario.question[2]);
//				evidences = true;
//			} else if (player.equals("액자") || player.equals("침대")) {
//				System.out.println(scenario.search[0]);
//				player = scanner.nextLine();
//				continue;
//			} else {
//				System.out.println("재입력");
//				player = scanner.nextLine();
//			}

	protected void room4(String player) {// 4번방 단서
		boolean evidences = false;
		player = scanner.nextLine();
		while (!evidences) {

			switch (player) {
			case "침대":
				System.out.println(scenario.find[0]);
				System.out.println(evidence.name[3] + evidence.description[3] + scenario.question[1]);
				while (true) {

					player = scanner.nextLine();
					switch (player) {
					case "i":
						System.out.println("저장완료 인벤토리 확인='v'입력");
						while (true) {
							player = scanner.nextLine();
							switch (player) {
							case "v":
								inventory.evidences[3] = evidence.name[3];
								inventory.inven(player);
								evidences = true;
								return;
							default:
								System.out.println("v재입력");
								break;
							}
						}
					default:
						System.out.println("i 재입력");
						break;
					}
				}
			default:
				System.out.println("아무것도 안보인다. 다른곳을 조사해보자.");
				player = scanner.nextLine();
				break;
			}
		}
	};
//			if (player.equals("침대")) {
//				System.out.println(scenario.find[0]);
//				System.out.println(evidence.name[3] + evidence.description[3] + scenario.question[1]);
//				player = scanner.nextLine();
//				System.out.println("저장완료/인벤토리 확인='v'입력");
//				inventory.evidences[3] = evidence.name[3];
//				inventory.evidences[3] = "찢어진 옷 조각";
//				inventory.inven(player);
//				System.out.println(scenario.question[2]);
//				evidences = true;
//			} else if (player.equals("액자") || player.equals("책상")) {
//				System.out.println(scenario.search[0]);
//				player = scanner.nextLine();
//				continue;
//			} else {
//				System.out.println("재입력");
//				player = scanner.nextLine();
//			}

	protected void room5(String player) {// 5번방 단서
		boolean evidences = false;
		player = scanner.nextLine();
		while (!evidences) {

			switch (player) {
			case "책상":
				System.out.println(scenario.find[2]);
				System.out.println(evidence.name[4] + evidence.description[4] + scenario.question[1]);
				while (true) {

					player = scanner.nextLine();
					switch (player) {
					case "i":
						System.out.println("저장완료 인벤토리 확인='v'입력");
						while (true) {
							player = scanner.nextLine();
							switch (player) {
							case "v":
								inventory.evidences[4] = evidence.name[4];
								inventory.inven(player);
								evidences = true;
								return;
							default:
								System.out.println("v재입력");
								break;
							}
						}
					default:
						System.out.println("i 재입력");
						break;
					}
				}
			default:
				System.out.println("아무것도 안보인다. 다른곳을 조사해보자.");
				player = scanner.nextLine();
				break;

			}
		}
	};
//			if (player.equals("침대")) {
//				System.out.println(scenario.find[0]);
//				System.out.println(evidence.name[4] + evidence.description[4] + scenario.question[1]);
//				player = scanner.nextLine();
//				System.out.println("저장완료/ 인벤토리 확인='v'입력");
//				inventory.evidences[4] = evidence.name[4];
//				inventory.evidences[4] = "피해자의 일기";
//				inventory.inven(player);
//				evidences = true;
//			} else if (player.equals("액자") || player.equals("책상")) {
//				System.out.println(scenario.search[0]);
//				player = scanner.nextLine();
//				continue;
//			} else {
//				System.out.println("재입력");
//				player = scanner.nextLine();
//			}

}
