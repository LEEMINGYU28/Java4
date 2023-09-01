package c230901;

public class StringTest {

	public void stirngTest() throws Exception{
//		String > 문자열, 문장 > 문자(char)의 배열
		char[] tempstr = new char[10];
		// 
		tempstr[0]= '가';
		tempstr[1]= '나';
		tempstr[2]= '다';
		tempstr[3]= '라';
		tempstr[4]= '마';
		tempstr[5]= '바';
		tempstr[6]= '사';
		tempstr[7]= '아';
		tempstr[8]= '자';
		tempstr[9]= '차';
		for(char temp : tempstr) {
			System.out.println(temp);
		}
		String str1 = "test";
		String str2 = new String("test");
		byte[] bytes = new byte[] {'t','e','s','t'};
		String str3 = new String(bytes);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		byte[] strBytes = str1.getBytes();	
		for(byte temp : strBytes) {
			System.out.println((char)temp);
		}
	
		byte[] arrEUCKR = str1.getBytes("EUC-KR");
		String strEUCKR = new String(arrEUCKR, "EUC-KR");
	}
}
