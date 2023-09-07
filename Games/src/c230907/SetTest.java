package c230907;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[]args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		System.out.println(set.size());
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		System.out.println(set.size());
		
		Iterator<Integer> iterator = set.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		set.clear();
	}
}
