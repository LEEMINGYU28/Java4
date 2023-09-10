package c230909;

public class Main {

	public static void main(String[]args) {
		TodoList<String> stringTodoList = new TodoList<>();
		
		Todo todo1= new Todo(" ",0,"설거리를해야한다.");
		
		GenericTodoItem<Todo> todoItem1 = new GenericTodoItem<>(todo1);
	}
}
