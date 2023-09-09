package c230909;

public class GenericTodoItem<T> implements TodoItem<T> {

	private T item;
	
	public GenericTodoItem(T item) {
		this.item = item;
	}
	
	@Override
	public T getItem() {
		return item;
	}

	@Override
	public void setItem(T item) {
		this.item= item;
		
	}
	
	
}
