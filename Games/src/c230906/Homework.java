package c230906;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

class Node<T>{
	
	Node<T> next;
	T data;
	public Node(T data) {
		this.data=data;
		this.next=null;
	}
}
class SLLStack<T>{
	private Node<T> head;
	
    public SLLStack() {
    	this.head=null;
    }
    public void stackLast(T data) {
    	Node<T> newNode=new Node<>(data);
    	
    }
}
class Stacks<T>{
	private List<T>stackList;
	private Node<T> head;	
	public Stacks(){
		LinkedList stackList = new LinkedList<>();
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int top=stackList.size()-1;
		
		T item=stackList.get(top);
		stackList.remove(top);
		return item;
	}
	public boolean isEmpty() {
		return stackList.isEmpty();
	}
	public int size() {
		return stackList.size();
	}
}

public class Homework {
	
	public static void main(String[]args) {

	}
}
