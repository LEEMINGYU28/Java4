package c230909;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TodoList<String> stringTodoList = new TodoList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("할일 추가하기 1 종료하기 2");
		String input = scanner.nextLine();
		
		while (true) {
			System.out.println("제목: ");
			String title = scanner.nextLine();

			if (title.equals("2")) {
				break;
			}

			System.out.println("우선순위: ");
			int priority = Integer.parseInt(scanner.nextLine());

			System.out.println("할일: ");
			String content = scanner.nextLine();
			 
			Todo todo = new Todo(title, priority, content);
			System.out.println("제목 :"+title+"\n우선순위 :"+priority+"\n할일 :"+content);
		}

	}
}
