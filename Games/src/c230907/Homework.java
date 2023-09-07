package c230907;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;


class Task{
	private String todo;
	private int priority;

public Task(String todo,int priorty) {	
	this.todo=todo;
	this.priority=priority;
	}	
public String getTodo() {
	return todo;
}
public int getPriority() {
	return priority;
	}
}
class TodoListPriority{
		
	private ArrayList<Task> tasks;
	
public TodoListPriority() {
		tasks= new ArrayList<>();	
	}
public void addTask(String todo,int priority) {
	Task task=new Task(todo,priority);
	tasks.add(task);
}
public void lastTask() {
	if(tasks.isEmpty())	{
		System.out.println("할일이 없습니다.");
	}else {
		System.out.println("우선순위 순");
		for (Task task : tasks) {
			System.out.println("우선순위"+task.getPriority()+":"+task.getTodo());
		}
	}
	
}

}

	


public class Homework {
	
	public static void main(String[]args) {
		TodoListPriority todoList = new TodoListPriority();
		Scanner scanner = new Scanner(System.in);
		

		while(true) {
			System.out.println("할일 입력하기 1 리스트보기 2");
			String my= scanner.nextLine();
			switch(my) {					
			case "1" :
			System.out.println("할일입력");
			String todos = scanner.nextLine();
			System.out.println("우선순위 입력");
			int prioritys = scanner.nextInt();
			todoList.addTask(todos, prioritys);
			System.out.println("할일 추가 완료");
			case "2" :
			todoList.lastTask();
			}
		}
	
	}
}
