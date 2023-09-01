package c230901;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void test() {
		Date now = new Date();
		System.out.println(now); //현재 시간을 받아올 수 있다.	
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 HH:mm:ss");
	System.out.println(sdf.format(now));
	
//	Calender
	}
}
