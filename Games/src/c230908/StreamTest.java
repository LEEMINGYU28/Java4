package c230908;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void test() {
		Set<String> set = new HashSet<String>();
		set.add("권원준");
		set.add("이민규");
		set.add("김남균");
		set.add("송성민");
		set.add("박정완");
		set.add("한상윤");
		set.add("임주한");
		set.add("김동선");
		set.add("임현규");
		
		Stream<String> stream = set.stream();
		stream.forEach(item->System.out.println(item));
		
//		for(String temp : arr) {}
		
		List<String> list = new ArrayList<>();
		list.add("권원준");
		list.add("이민규");
		list.add("김남균");
		list.add("송성민");
		list.add("박정완");
		list.add("한상윤");
		list.add("임주한");
		list.add("김동선");
		list.add("임현규");
		
		Stream<String> stream1 = list.stream(); // 리스트 자체는 건들지 않는다.
		stream1.forEach(item->System.out.println(item));
		
		Set<Student> students = new HashSet<Student>();
		students.add(new Student("권원준", 85));
		students.add(new Student("이민규", 80));
		students.add(new Student("김남균", 90));
		students.add(new Student("송성민", 70));
		students.add(new Student("박정완", 75));
		students.add(new Student("한상윤", 100));
		students.add(new Student("임주한", 80));
		students.add(new Student("김동선", 90));
		students.add(new Student("임현규",98));
		
		Stream<Student> stream2 = students.stream();
		IntStream scores = stream2.mapToInt(item->item.getScore()).sorted();
//		stream2.forEach(item->System.out.println(item)); 2팀 스트림은 1번만 사용가능
//		scores.forEach(item->System.out.println(item));
		double avg = scores.average().getAsDouble();
		System.out.println("avg:" + avg);
		System.out.println();
		
		IntStream scoresDis = students.stream().mapToInt(item->item.getScore()).distinct();	
//		scoresDis.toArray(); // 배열로 뽑아낸다.
		scoresDis.forEach(item->System.out.println(item+","));
		System.out.println();
		
		Stream<Student> stream3 = students.stream().sorted(Comparator.reverseOrder());
		stream3.forEach(item->System.out.println(item));
		System.out.println();
		
		Stream<Student> stream4 = students.stream().filter(item->{
			return item.getScore() > avg;});	
		stream4.forEach(item->System.out.println(item));
	}
}
