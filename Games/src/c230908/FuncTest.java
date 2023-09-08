package c230908;

public class FuncTest {

	public static void test() {
//		PrintTest t = new PrintTest() {
//			@Override
//			public void print() {
//				System.out.println("인터페이스를 클래스를 바로 생성한다");
//			}
//		};
//	
//		t.print();
//	
		//public 형식에 메서드는 하나밖에 들어갈 수 없다.

//		action(new FuncTest() :: print);
		
		action((name)->{
			System.out.println("임현규");
		});
		
//		action((name)->{
//			System.out.println(name+"람다 테스트");
//		});
	}
	
	private static void action(PrintTest printTest) {
		printTest.print("권원준");
	}
	private static void print(String name) {
		System.out.println(name + "람다 테스트");
	}
}
