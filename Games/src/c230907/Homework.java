package c230907;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


class Task{
	private String todo;
	private int priority;

public Task(String todo,int priority) {	
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
	for (Task task : tasks) {
        if (task.getTodo().equals(todo)) {
            System.out.println("이미 있는 할일입니다.");
            return;
        }
	}
	Task task=new Task(todo,priority);
	tasks.add(task);
	
}

public void lastTask() {
	if(tasks.isEmpty())	{
		System.out.println("할일이 없습니다.");
	}else {
		  PriorityQueue<Task> priorityQueue = new PriorityQueue<>((t1, t2) -> Integer.compare(t1.getPriority(), t2.getPriority()));
          priorityQueue.addAll(tasks);
		System.out.println("우선순위 순");

		 while (!priorityQueue.isEmpty()) {
             Task task = priorityQueue.poll();
             System.out.println("우선순위 " + task.getPriority() + ": " + task.getTodo());
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
			scanner.nextLine();
			todoList.addTask(todos, prioritys);
			System.out.println("할일 추가 완료");
			break;
			case "2" :
			System.out.println("★오늘의 할일★");
			todoList.lastTask();
			break;
			default:
			System.out.println("올바른 명령을 입력하세요.");
            break;
			}
		}
	
	}
}
