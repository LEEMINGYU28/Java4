package c230905;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {

	public static void main(String[]args) {
		
		//컬렉션-자료구조
		//동일한 데이터 타입을 묶어 관리하는 자료구조
		//데이터 저장 공간의 크기가 동적으로 변한다.
		
		//1.List
		//배열이랑 비슷하다.
		//자바에서 인터페이스로 구현되어 있음.
		//arrayList =리스트 인터페이스를 구현한 클래스중에 하나이다
		//ArrayList, Vector,LinkedList 등과 같은 클래스가
		//List인터페이스를 구현한다.
		
		//1.1 ArrayList
		//List 인터페이스를 구현한 클래스중 하나.
		//동적배열로 구현되어 크기를 동적으로 조절가능
		//요소에 빠르게 접근가능, 데이터를 추가하거나 제거할때 자동으로 크기를 조절한다.
		
		//List는 인터페이스로써 리스트 동작을 정의
		//ArrayList는 List를 상속받고 있다.
		//ArrayList랑 Array 차이
		
		
		String[] arrStrings=new String[] {"가","나","다","라","마"};
	
		arrStrings[1]=null;
		arrStrings[2]=null;
		for(int i=0; i < arrStrings.length; i++) {
			System.out.println(arrStrings[i]);
		}
		
		List<String> arrList=new ArrayList<>();
	
		System.out.println(arrList.size()); //=0
		
		arrList.add("가");
		arrList.add("나");
		arrList.add("다");
		arrList.add("라");
		arrList.add("마");
		arrList.add("바");
		arrList.add("사");
		arrList.add("아");
		System.out.println("데이터추가후:"+arrList.size());
		
		for(String string : arrList) {
			System.out.println(string);
		}
		arrList.remove("바"); //지우기
		arrList.remove("다");
		for(String string : arrList) {
			System.out.println(string);
		}
		System.out.println("데이터삭제후:"+arrList.size());
	
		arrList.add("경일");
		for(String string : arrList) {
			System.out.println(string);
		}

		int index =2;
		
		String element = arrList.get(index);
		System.out.println("인덱스:"+index+"요소 :"+element);
		
		
		String target = "경일";
		boolean contains=arrList.contains(target);
		
		if(contains) {
			System.out.println(target+"을 찾았다.");
		}
		else {
			System.out.println("없음");
		}
		//add : 요소추가 > 뒤, 지정된 인덱스
		//remove : 삭제 > 인덱스,Object
		//clear : 모든 데이터 삭제
		
		//get : 인덱스의 데이터를 리턴
		//indexOf : 첫번째 위치 리턴
		//lastIndexOf : 마지막 위치 리턴
		//contains : 있는지 없는지

		//size : 길이
		//isEmpty : 비어있냐 없냐?
		//trimTosize : 
	
		//sort : 정렬
		//reverse : 반전 
		
//		List<String> myList = new ArrayList<>();
		List<String> myList = new LinkedList<>();
		//더 유연하고 일반적인 방법
		//나중에 바꿀일이 생긴다면 Linked를 사용
		//List 인터페이스가 정의한 메서드만 사용가능
		//인터페이스화 된것을 사용하는게 권장이 된다.
		ArrayList<String>MyList1 =new ArrayList<>();
		//구체적인 구현의 의존한 방식 리스트랑 똑같이 쓰면됨.	
		
		
	}
}
