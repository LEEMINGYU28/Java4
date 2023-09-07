package c230907;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOFILO {
	
	// First In First Out > Queue
	// First In Last Out > Stack
	// 재기호출 - 자기 스스로를 계속 불러온다.
	public static void main(String[]args) {
	Stack<Integer> s = new Stack<>(); 
	//Array,LinkedList,ArrayList 중 무엇을 쓸것인가
	
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	
	System.out.println(s);
	s.pop(); //하나를 빼낸다. 빼낸게를 리턴해준다.
	//빼낸게 뭔지 데이터를 받아 올 수 있음.
	System.out.println(s);
	}
}
