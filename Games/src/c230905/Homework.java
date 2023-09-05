package c230905;

import java.util.ArrayList;
import java.util.List;

class Stack<T>{
	
	private ArrayList<T> stackList;

	public Stack() {
	stackList = new ArrayList<>();
	}
	public void push(T element) {
		stackList.add(element);
		
	}
	public T pop() {
		if(isEmpty()) {
			return null;			
		}
		return stackList.remove(stackList.size() - 1);
	
	}
	public boolean isEmpty(){
		return stackList.isEmpty();
	}
	public int size() {
		return stackList.size();
	}
	public T check() {
		if (isEmpty()) {
			return null;
		}
		return stackList.get(stackList.size() - 1);
	}
}




public class Homework {
	public static void main(String[]args) {
		Stack<String> stack = new Stack();
		
		stack.push("1번");
		stack.push("2번");
		stack.push("3번");
		stack.push("4번");
		
		stack.pop();
		System.out.println("스택길이:"+stack.size());
		System.out.println("스택의 맨위:"+stack.pop());
		
		int index=4;
		String element = stack.check();
		System.out.println("인덱스:"+index+"요소 :"+element);
		System.out.println("스택이 비어있는가?"+stack.isEmpty());
	}
}
