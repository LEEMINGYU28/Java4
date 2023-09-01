package c230901;

import java.util.Random;

public class MathTest {

	public static void test() {
		System.out.println(Math.abs(-5));
		//Math = 연산자로 끝나기 때문에 +,-,* 등 계산식은 없음
		System.out.println(Math.abs(-5.5));
		
		System.out.println(Math.ceil(5.1)); //ceil = 소수점이있으면 무조건 올린다.
	
		System.out.println(Math.floor(5.1)); //뒤에 소수점은 날려버림
		
		System.out.println(Math.max(4,7)); // 최대값
		System.out.println(Math.min(4,7)); // 최소값

		System.out.println(Math.round(5.1));
		System.out.println(Math.round(5.9)); //반올림
	
	
		Random rd = new Random(1); // 매개변수로 랜덤에 대한 참조값을 전달할 수 있다. 이런 참조값을 종자값(seed)이라고 말한다.
		System.out.println(rd.nextInt(9) + 1);
	
		Random rd1 = new Random(1);
		System.out.println(rd.nextInt(9) + 1);
	}
}
