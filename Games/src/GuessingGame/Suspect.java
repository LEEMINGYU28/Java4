package GuessingGame;

public class Suspect {

	protected String[] information = new String[] //투숙객 설명
			{"번방 남자는 피해자와 오래된 친구였으며, 어린시절"
			+ "많은 추억을 쌓았다고 한다."}; 
	protected String[] reiationship =new String[] //피해자와의 관계
			{
			"저와 피해자는 어린 시절부터 친구였어요.\n같은 동네에서 자랐고, 항상 함께 노는 것을 좋아했어요.\n"
			+ "그래서 이 호텔에 같이 와서 함께 시간을 보려고 했어요.",//[0]
			};
	protected String[] alibi=new String[] //투숙객 알리바이
			{
				"그날 밤에는 혼자 호텔 내부를 돌아다니며\n"
				+ "구경하고 있었어요. 그러다가 좀 일찍 방에 돌아와서 쉬고 있었어요."
			};
}
