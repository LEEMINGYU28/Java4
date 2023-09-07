package c230907;

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetTest {

	public static void main(String[]args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
	treeSet.add(6);
	treeSet.add(7);
	treeSet.add(12);
	treeSet.add(1);
	System.out.println(treeSet.size());
	
	for(Integer i : treeSet) {
		System.out.println(i);
	}
	
	System.out.println("처음은"+ treeSet.first());
	System.out.println("마지막은"+ treeSet.last());
	System.out.println("7미만은"+ treeSet.lower(7));
	System.out.println("7미만은"+ treeSet.higher(7));
	
	
	NavigableSet<Integer> descendingTreeSet = treeSet.descendingSet();
	//오름차 순으로 바꿔준다.
		for(Integer i : descendingTreeSet) {
		System.out.println("==========");
			System.out.println(i);
		System.out.println("===========");
		}												//현재 값을 초과처리할거면 false 아니면 true
		NavigableSet<Integer> rangeTreeSet = treeSet.tailSet(7, false);
		for(Integer i : rangeTreeSet) {
			System.out.println(i);
		}
		NavigableSet<Integer> rangeTreeSet2 = treeSet.headSet(7, true);
		for(Integer i : rangeTreeSet2) {
			System.out.println(i);
		}
		NavigableSet<Integer>	 rangeTreeSet3 = treeSet.subSet(1,true,12,true);
		for(Integer i : rangeTreeSet3) {
			System.out.println(i);
		}
		System.out.println(":"+rangeTreeSet3);
	}
}
