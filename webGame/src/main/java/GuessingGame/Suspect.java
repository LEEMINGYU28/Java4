package GuessingGame;

import java.util.Scanner;

public class Suspect{
	Scenario scenario = new Scenario();
	Evidence evidence = new Evidence();
	Inventory inventory = new Inventory();
	
	Scanner scanner = new Scanner(System.in);
	
	protected String[] information = new String[] //투숙객 설명
			{"1번방 남자는 피해자와 오래된 친구였으며, 어린시절"
			+ "많은 추억을 쌓았다고 한다.",//0
			"번방에 들어오자 2번방에는 밝은 미소를 띤 투숙객B가 있었다.",//1
			"번방 안에는 예술적인 분위기를 풍기는 투숙객 C가 있었다. ",//2
			"번방 안에는 구멍난듯한 옷을 입고 미소를 짓고있는 사업파트너 투숙객 D가 있었다.",//3
			"번방 피해자의 방이다. 잠겨있는것 같다. 피해자의 방열쇠를 사용해보자."};//4
	protected String[] reiationship =new String[] //피해자와의 관계
			{
			"저와 피해자는 어린 시절부터 친구였어요.\n같은 동네에서 자랐고, 항상 함께 노는 것을 좋아했어요.\n"
			+ "그래서 이 호텔에 같이 와서 함께 시간을 보려고 했어요.",//[0]
			"항상 운동을 같이하는 운동 메이트 였어요. ",//1
			"피해자는 저의 작품에 대한 소중한 비평가였어요.\n"
			+ "그래서 이번 호텔에서의 전시를 위해 모였는데...",//2
			"피해자는 저와 사업적으로 굉장히 가까웠어요. \r\n"
			+ "사업 파트너로서 함께 다양한 계획을 세우고 있었어요.\n"
			+ "하지만 그의 갑작스러운 사망으로 사업이 물거품이 되버렸죠~"//3
			};
	protected String[] alibi=new String[] //투숙객 알리바이
			{
				"그날 밤에는 혼자 호텔 내부를 돌아다니며\n"
				+ "구경하고 있었어요. 그러다가 좀 일찍 방에 돌아와서 쉬고 있었어요.",//0
				"저는 그날 밤에 호텔 주변을 산책하고 있었어요.\n"
				+ "오랜만에 여유로운 시간을 가지려고 했거든요.",//1
				"그날 밤에는 제 작품 전시가 계획되어 있어서 작품을 점검하고 있었어요.",//2
				"그날 밤에는 사업 계획을 몇 번 더 검토하고 있었어요.\n"
				+ "피해자와의 마지막 회의 후, 제 방으로 돌아와 계속해서 사업계획을 검토하고 있었어요."//3
			};
	protected void suspectA(String player) //투숙객A 1
	{
		while(true) 
		{
		player=scanner.nextLine();
			switch(player) 
			{
			case "y":System.out.println(scenario.story[2]);
			break;
			case "1":System.out.println("투숙객A:"+reiationship[0]+scenario.question[3]);
			break;
			case "2":System.out.println("투숙객A:"+alibi[0]+scenario.question[3]);
			break;
			case "n":System.out.println(1+scenario.question[4]);
			break;
			case "z":System.out.println(scenario.question[5]);
			return;
			case "v":
				for(int i=0; i<inventory.evidences.length; i++)
				{
					if(inventory.evidences[i]!=null)
					{
						System.out.println(inventory.evidences[i]);
					}
				}
				break;
			default: System.out.println("재입력하세요.");
			break;
			}
		}
	};
	protected void suspectB(String player) //투숙객B2
	{
		while(true) 
		{
		player=scanner.nextLine();
			switch(player) 
			{
			case "y":System.out.println(scenario.story[2]);
			break;
			case "1":System.out.println("투숙객B:"+reiationship[1]+scenario.question[3]);
			break;
			case "2":System.out.println("투숙객B:"+alibi[1]+scenario.question[3]);
			break;
			case "n":System.out.println(2+scenario.question[4]);
			break;
			case "z":System.out.println();
			return;
			case "v":
				for(int i=0; i<inventory.evidences.length; i++)
				{
					if(inventory.evidences[i]!=null)
					{
						System.out.println(inventory.evidences[i]);
					}
				}
				break;
			default: System.out.println("재입력하세요.");
			break;
			}
		}
	};
	protected void suspectC(String player) //투숙객C 3
	{
		while(true) 
		{
		player=scanner.nextLine();
			switch(player) 
			{
			case "y":System.out.println(scenario.story[2]);
			break;
			case "1":System.out.println("투숙객C:"+reiationship[2]+scenario.question[3]);
			break;
			case "2":System.out.println("투숙객C:"+alibi[2]+scenario.question[3]);
			break;
			case "n":System.out.println(3+scenario.question[4]);
			break;
			case "z":System.out.println();
			return;
			case "v":
				for(int i=0; i<inventory.evidences.length; i++)
				{
					if(inventory.evidences[i]!=null)
					{
						System.out.println(inventory.evidences[i]);
					}
				}
			default: System.out.println("재입력하세요.");
				break;
			}
		}
	};
	protected void suspectD(String player) //투숙객D
	{
		while(true) 
		{
		player=scanner.nextLine();
			switch(player) 
			{
			case "y":System.out.println(scenario.story[2]);
			break;
			case "1":System.out.println("투숙객D:"+reiationship[3]+scenario.question[3]);
			break;
			case "2":System.out.println("투숙객D:"+alibi[3]+scenario.question[3]);
			break;
			case "n":System.out.println(3+scenario.question[4]);
			break;
			case "z":System.out.println();
			return;
			case "v":
				for(int i=0; i<inventory.evidences.length; i++)
				{
					if(inventory.evidences[i]!=null)
					{
						System.out.println(inventory.evidences[i]);
					}
				}
				break;
			default: System.out.println("재입력하세요.");
			break;
			}
		}
	};
	protected void victim(String player) //피해자 
	{
		boolean ending = false;
		while(!ending) 
		{
			
		player=scanner.nextLine();
			switch(player) 
			{
			case "y":System.out.println("범인을 지목하겠다면 g입력 좀더 조사하고 싶다면 z입력");
					player=scanner.nextLine();
		
					switch(player)
					{
					case "z":System.out.println(scenario.question[5]);
					player=scanner.nextLine();				
					break;
					case "g":System.out.println("범인은 누구인가?\nA,B,C,D입력");
							player=scanner.nextLine();
							while(!ending) {
							if(player.equals("D")) {
								System.out.println(scenario.ending[0]+"\n추리성공\n게임종료");
								ending=true;
							}else if(player.equals("A") || player.equals("B") || player.equals("C")) {
								System.out.println(scenario.ending[1]+"\n범인잡기 실패 게임패배");
								ending=true;
							}else{
								System.out.println("재입력해주세요.");
								player=scanner.nextLine();
							}
							}
							
//							switch(player) 
//							{
//							case "A","B","C":System.out.println(scenario.ending[1]+"\n범인잡기 실패 게임패배");
//							ending = true;
//							break;
//							case "D":System.out.println(scenario.ending[0]+"\n추리성공\n게임종료");
//							ending = true;
//							break;
//							default:System.out.println("재입력해주세요.");
//							break;
//							}
						break;	
						}
						
			case "v":
				for(int i=0; i<inventory.evidences.length; i++)
				{
					if(inventory.evidences[i]!=null)
					{
						System.out.println(inventory.evidences[i]);
					}
				}
			break;
			default: System.out.println("재입력해주세요.");
			
			}
		}
	};
}
