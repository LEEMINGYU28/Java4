package C230829;

interface Human {
	//인터페이스 = 추상화를 극한으로 다룬것. 다중상속 
	//API > Application Programmig Interface
	//프로그램과 프로그램 사이에 데이터를 전달해주는 녀석
	//web API / API 문서작성 = 어떻게 데이터를 주고받을건지
	//interface는 어더한 무언가와 어떠한 무언가를 연결하여 중간 과정에서 통신을 처리한다.
	//간단히 말하면 서로 간에 대화를 가능하게 해준다.
	void move(); //추상화만 가능
}	
//interface도 sealed 가능 permits도 가능
interface Animal
{ //interface == abstract class
	void eat();
}
	//(상수에 관한 봉인)
			public sealed class Person 
				implements Human,Animal
				permits YelloRace,WhiteRace{
				 //Animal에 intterface를 넣어주면서 여러가지 상속
	String species;
//	final int number; 
	
	Person()
	{
		species = "human";
	}
	@Override //추상화됐어도 정확히 적어줘야함 public
	public void move() 
	{
		System.out.println("사람이 이동한다.");
	}
	@Override //	
	public void eat()//상속하고 재정의 
	{
	}
}
