package c230901;

public class Main {

	public static void main(String[]args) throws Exception{
//	Week week = Week.FRIDAY;
//	week = Week.SUNDAY;
//	switch(week) {
//	case SUNDAY:
//		System.out.println("일요일이다");
//		break;
//	}
	
	int num = 1;
	int studentNum = 1;  // 카멜형 student number 
	int StudentNum = 1;  // 파스칼형 카멜형 + 첫문자 대문자
	int student_num = 1; // 스네이크형	
	System.out.println(num);
	
	StringTest stringTest = new StringTest();
	stringTest.stirngTest();
	
	StrBuilderTest.strBuilderTest();
	MathTest.test();
	Wrapper.test();
	DateTest.test();
	}
}
