package C230829;

public non-sealed class YelloRace extends Person{
	//(상속봉인해제)	
	int[] skinColor;
	
	YelloRace()
	{
		skinColor = new int[] {251,206,177};  //살구색 / 
		String tempColor = "ffffff"; //16진수로 인해 위랑 같다.
	}


}
