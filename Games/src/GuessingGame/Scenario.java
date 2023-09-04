package GuessingGame;

public class Scenario {

	
	protected String[] story = new String[] //스토리
			{ "방이 5개가 있는 호텔에서 살인사건이 일어났다.\n"
			+ "당시 투숙객은 피해자까지 5명이 있었으며, 모두 투숙객의 친구이다.\n"
			+ "호텔 경비를 맡고있는 경비원 1명까지 호텔에는 총 6명이 있었다.\n"+
	"피해자는 5번방인 자기방에서 죽어있었다.\n"
	+ "플레이어는 방을 돌면서 각 방마다 단서를 랜덤으로 획득 할 수 있으며,\n"
	+ "단서는 총 5개 투숙객들과의 대화를 통해 용의자를 추려 낼 수 있다.\n"
	+ "단서는 인벤토리에 보관할 수 있으며, 투숙객들과의 대화내용도 저장이 가능하다.\n"
	+ "단서 5개를 모두 찾았으면 단서들을 조합하여 범인을 찾아낸다.",//[0]
	"호텔 입구에 도착했다. 경비원이 당시 상황을 얘기해주며,맞이 해준다.\n"
	+ "나는 호텔에 CCTV는 없었는지 가장먼저 물어보았다.\n"
	+ "경비원 :CCTV는 몇일전에 고장이 나서 수리중에 있었습니다.\n"
	+ "아쉬움을 뒤로하고 수사를 위해 1번방으로 들어간다. \n다음 '>>'입력",//[1]
	"투숙객에게는 2가지 질문을 할 수있다.\n"
	+ "1 입력시 피해자와의 관계를 질문한다."
	+ "2 입력시 사건 당시 알리바이를 질문한다."//[2]
	};
	protected String[] question = new String[] //질문
			{
				"\n단서가 있는지 조사해보자."
				+ "조사할곳 입력 침대,액자,책상",//[0]
				"인벤토리에 넣어두자. 'i'입력",//[1]
				"투숙객에게 말을 걸어보자. 'y'입력",//[2]
				"\n다음으로 넘어가기 'n'입력\n다음 질문하기 1or2 입력",//[3]
				"번방조사는 끝난거 같다. 다른방을 조사해보자."
				+ "\n복도로 이동='z'입력",//[4]
				"복도로 나왔다. 어떤 방으로 이동할까? 2,3,4,5 중 입력",//5
				"다음으로 'y'입력",//6
			};
	protected String[] search = new String[] 
			{
					"아무것도 안보인다. 다른곳을 조사해보자",//[0]
			};
	protected String[] find = new String[] //단서 발견 
			{
				"침대 밑에 무언가 보인다 꺼내본다.",//[0]
				"액자 뒤 공간이 보인다 액자를 내린다.",//[1]
				"책상 서랍안에 무언가 보인다 열어본다."//2
			};





}
