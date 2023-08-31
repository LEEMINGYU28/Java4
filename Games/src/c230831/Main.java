package c230831;

public class Main {
	public static void main(String[]args)throws Exception{
		
//		Object obj = new Object();
//		Main main = new Main();

		EqualsTest et1 =new EqualsTest(1,"test");
		EqualsTest et2 =new EqualsTest(2,"test");
		EqualsTest et3 =et1;
//		EqualsTest et4 =new EqualsTest("test");
		System.out.println(et1.equals(et2));
		System.out.println(et1.equals(et3));

		
		System.out.println(et1.hashCode());
		System.out.println(et2.hashCode());
		//hashcode로 내용물이 같은지 아닌지 까지 나타낼 수 있다.

		

		System.out.println(et1.toString());
		System.out.println(et2.toString());

		RecordTest recordtest = new RecordTest(1,"test");
		RecordTest recordtest2 = new RecordTest(1,"test");
		
		System.out.println(recordtest.num());
		System.out.println(recordtest2.name());

		System.out.println(recordtest.toString());
		System.out.println(recordtest2.toString());
	
		System.out.println(recordtest.equals(recordtest2));
		
	
		System.out.print(""); //out은 콘솔창에 출력한다.
		System.out.println("");
		
//		System.in;
		int keyInput = 0;
		while(true) {
			keyInput=System.in.read();		
			System.out.println(keyInput);
			// 7 > 55, 13, 10
			// a > 97, 13, 10
			// 아스키코드 + \r \n 
			break;
		}
//		System.currentTimeMillis(); 현재 시간을 ms단위로 받아온다.
		System.nanoTime();// 나도 단위의 현재 시간을 받아온다.
		System.out.println(System.currentTimeMillis());
		// 1683449477.674 s
		// 28,224,157 m
		// 470,402 h + 37 m
		// 19,600 d + 2h
		// 53 y 255d
		// 2023y 8M 31d
		// 0년이 아니라 1970년을 기준으로 시간을 체크한다.
	  
	
	System.out.println("Java Version :"+ System.getProperty("java.specification.version"));
	System.out.println("JDK Directory :"+ System.getProperty("java.home"));
	System.out.println("OS :"+ System.getProperty("os.name"));
	System.out.println("user :"+ System.getProperty("user.name"));
	System.out.println("user Directory :"+ System.getProperty("user.home"));
	System.out.println(" directory "+ System.getProperty("user.dir "));
	
	
	}
}
