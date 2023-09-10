package c230909;

import java.util.Arrays;

public class TodoList<T> {
	private TodoItem<T>[] items; // TodoItem을 담는 배열
	private int size; // 현재 항목 개수

	public TodoList() {
		items = (TodoItem<T>[]) new TodoItem<?>[5];
		size = 0;
	}

	public void addItem(TodoItem<T> item) {

		if (size == items.length) {
			TodoItem<T>[] newItems = Arrays.copyOf(items, items.length * 2);
			items = newItems;
		}

		items[size++] = item;
	}
}
