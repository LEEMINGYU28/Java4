package C230829;

interface InterfaceTest
{
	/*final*/int NUMBER = 1;
	//다중 상속이 왜 가능할까? 
	//내용이 없는애들은 하나로 취급해주기 위해서이다. > 이름만 있는 것들
	//interface에서 static을 사용하는게 맞다.
	//기본적인 내용들을 넣을때는 인터페이스에서 private를 사용함.
	/*public abstract가 포함되어 있다. */ void nethodTest();
	
	void defaultMethodTest();

	void methodTest();

	static void staticMethodTest() 
	{
		System.out.println("정적 메서드 가능");
		//private 메서드 호출 불가능 static을 붙이면 가능하다
	}
	
	private void privateStaticMethodTest() 
	{
		System.out.println("private 정적 정적메서드 가능");
	}
	
	private void privateMethodTest() 
	{
		System.out.println("private 메서드 가능");
	}
	
	default void defaulMethodTest() 
	{
		privateMethodTest();
	}
}

class ClassTest implements InterfaceTest
{
	@Override
	public void methodTest() {}
	
	@Override
	public void defaultMethodTest() 
	{
//		InterfaceTest.super.defaultMethodTest();
	}

	@Override
	public void nethodTest() {
		// TODO Auto-generated method stub
		
	}
}


public class Main {

	public static void main(String[]args) 
	{
		InterfaceTest.staticMethodTest();
//		Person human = new Person(); 추상화한거라 new불가 하지만 타입으로는 사용가능
		YelloRace JKH = new YelloRace();
		JKH.move();
//		JKH.skinColor							업 캐스팅 
		Person[] people = new Person[] {JKH, new WhiteRace()}; //여러개를 담을 수 있게 부모를 타입으로 지정 / 변수는 추상화 불가능
//		people[0].skin	Person 이라는 타입을 갖게돼서 오류
//		people[0].move
	}
}
