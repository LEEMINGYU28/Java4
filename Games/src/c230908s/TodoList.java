package c230908s;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TodoList {
	// 아이템 목록 출력 방법 : " 제목 = 우선도" 
	TodoItem[] temp;
	// 중복처리 > Set > 제목을 기준으로 중복처리 <<Set은 값만 있다.
	// 2개로 데이터를 다룬다 > Map > 키와 값 > 키 : 제목, 값 : Item
	private Map<String,TodoItem> hashList = new HashMap<>(); 
	// 순서를 만들 수 있는, 정렬할 수 있는 > 정렬해주는 Tree
	private Map<Integer, List<TodoItem>> treeList =new TreeMap<Integer,List<TodoItem>>(Comparator.reverseOrder());

	public void add(int priority, String title, String content){//throws Exception{
		if(hashList.get(title) != null) {
			System.out.println("있는 제목");
//			throw new Exception("제목있음");
			return;
		}
	
		List<TodoItem> list = treeList.get(priority);
		if(list == null) {
			list = new ArrayList<TodoItem>();
			treeList.put(priority,list);
		}
		TodoItem temp =new TodoItem(priority,title,content);
		hashList.put(title, temp);
		list.add(temp);
	}
	
	public TodoItem getItem(String title) {
		return hashList.get(title);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new  StringBuilder();
		int count =0;
		Iterator<Integer> treeIt = treeList.keySet().iterator();
		while(treeIt.hasNext()) {
			List<TodoItem> tempList = treeList.get(treeIt.next());
			for(TodoItem item : tempList) {
				sb.append("\n");
				sb.append(item.toList());
			}
		}
		
		return sb.toString();
		}
	
	public void test() {
		add(1,"1번째","as");
		add(2,"2번째","ㅘㅓ호ㅓㅏ");
		add(3,"3번째","as");
		add(4,"4번째","as");
		System.out.println("------------------");
		System.out.println(hashList);
		System.out.println("------------------");
		System.out.println(treeList);
		System.out.println("------------------");
		
		System.out.println(this);
		
		System.out.println("2번째");
	}
	
	
	
	
	
	
	
	
}
