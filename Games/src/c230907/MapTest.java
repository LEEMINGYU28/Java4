package c230907;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[]args) {
		
		Map<String,Integer> map =new HashMap();
	
		map.put("원준", 7);
		map.put("남균", 8);
		map.put("현규", 23);
		map.put("동선", 3);
		map.put("교수님", 7);
		
		System.out.println(map.size());
		
		System.out.println(map.get("교수님"));
		map.put("교수님", 13);
		System.out.println(map.size());
		System.out.println(map.get("교수님"));
	
		
		Set<String> keySet = map.keySet(); // key set으로 가져온다.
			
		System.out.println(keySet);
		
	}
}
