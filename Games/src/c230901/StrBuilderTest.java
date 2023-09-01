package c230901;

public class StrBuilderTest {

	public static void strBuilderTest() {
		
		String str1 = "abc";
		str1 = str1 + "defg"; // 기존 abc의 주소를 바꿔서 새로만든다.
		
		//string에 있어서 메모리 적으로 관리를 해준다.
		StringBuilder sb = new StringBuilder();
		str1 = str1.replace("b","z");
		String str2 = sb.append("글자를 추가한다.").toString(); //문자열로 변환을 시켜줘야함.
		System.out.println(str2);
		//0글1자2를3 (4추5가6)한7다8.9
		System.out.println(sb.delete(4, 6).toString());
							// 4번째부터 6번째까지 삭제한다.
		System.out.println(sb.replace(4, 4,"수정").toString());
							// 4번째부터 4번째 까지 수정으로 바꾼다.
		System.out.println(sb.replace(4, 6,"치환").toString());
							// 위치부터위치까지 잡아서 입력할 문자열을 수정 시킨다.
							// 메모리에 대해서 절약이 좀 가능하다.
		System.out.println(sb.append("글자를 추가한다.").toString());
							// 뒤에 글자를 추가한다.
		str1.substring(5);
	}
}
