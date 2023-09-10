package c230909;

public class TodoList<T> {
	private Object[] items;
	private int size;

	public TodoList() {
		items = new Object[10];
		size = 0;

	}

	public void addItem(TodoItem<T> item) {

		if (size == items.length) {
			Object[] newItems = new Object[items.length * 2];
			System.arraycopy(items, 0,newItems, 0, size);
			items=newItems;
		}
		
		items[size++] = item;
	}
}
