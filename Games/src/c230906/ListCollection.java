package c230906;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[]args) {
		
		
		//LinkedList
		//노드끼리의 주소 포인터를 서로 가리키고 있다.
		//하나의 노드에는 데이터와 다음 노드를 가르키는 포인터가 있다.
		//중간에 데이터를 insert,delete하기에 유용하다. 인덱스라는 개념이 없기 때문에
		//하지만 특정 위치에 빠르게 접근(액서스)하려면 순차적으로 탐색해야하는 단점이 있다.
		
		List<String> linkedList=new LinkedList<>();
		
		linkedList.add("사과");
		linkedList.add("바나나");
		linkedList.add("체리");
		
		System.out.println("링크드 리스트 순화");
		
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		linkedList.add(1,"오렌지"); // 특정위치에 넣기
		linkedList.remove("바나나");// 삭제 
		
		String elem=linkedList.get(2);
		System.out.println("2번째 :"+elem);
		
		System.out.println("사이즈 : "+linkedList.size());
		
		linkedList.clear();
		System.out.println("비어있는가 :"+linkedList.isEmpty());
		
		
		boolean isApple=linkedList.contains("사과");
		System.out.println(isApple);
		
		Object[] array=linkedList.toArray();
		for (Object object: array) {
			System.out.println(object.toString());
		}
		
	}
}


