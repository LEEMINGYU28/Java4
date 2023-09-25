package c230829;

public final class WhiteRace extends Person {	
	//(이 이상에 상속은 불가능해진다)
	int[] skinColor;
	
	WhiteRace() //추상화된것
	{
		super(); // 상속을 했으면 기본으로 넣는것.
		//부모생성자는 무조건 자식생성자에 포함되어야 한다.
		skinColor = new int[] {255,255,255};  //RGB 3개에 하나씩 들어간다. 투명도까지 4개까지도 들어간다.
		String tempColor = "ffffff"; //16진수로 인해 위랑 같다.
		
		
		
	}
	
	
}
