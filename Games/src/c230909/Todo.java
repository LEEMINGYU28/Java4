package c230909;

public class Todo {

	private String title;
	private int priority;
	private String content;
	
	public Todo(String title, int priority, String content) {
		this.title=title;
		this.priority=priority;
		this.content=content;
	}
	public String getTitle() {
		return title;
	}
	public int priority() {
		return priority;
	}
	public String content() {
		return content;
	}
}
