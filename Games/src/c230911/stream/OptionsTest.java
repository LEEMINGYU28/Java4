package c230911.stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OptionsTest {

	public static void test() {
		int[] arr = { 1, 3, 5, 7 };
		int[] arr1 = { 2, 4, 6, 8 };

		System.out.println(Arrays.stream(arr).filter(item -> item % 3 == 0).count()); // 3의 배수만 내보내준다.
		System.out.println(Arrays.stream(arr).filter(item -> item % 3 == 0).count());

		System.out.println(Arrays.stream(arr).sum()); // 더해준다.
		System.out.println(Arrays.stream(arr1).sum());

		System.out.println(Arrays.stream(arr).average().getAsDouble()); // Double로 내보내준다.
		System.out.println(Arrays.stream(arr1).average().getAsDouble()); // 평균을 구해준다.

		System.out.println(Arrays.stream(arr).max().getAsInt()); // 최대값
		System.out.println(Arrays.stream(arr).min().getAsInt()); // 최소값

		int[] arr2 = {};
		try {
			System.out.println(Arrays.stream(arr).average().getAsDouble());
			// 쓸 수있는값(double)을 받아와달라 하지만 배열이 비어있다면 오류가 발생할 수 있음.

		} catch (Exception e) {
			e.printStackTrace();
		}
		OptionalDouble od = Arrays.stream(arr2).average();
		if (od.isPresent()) {
			System.out.println(od.getAsDouble());
		} else {
			System.out.println("없다"); // if문으로 문제가 있는지 없는지 체크하고 있다.
		}

		System.out.println(Arrays.stream(arr).average().orElse(0.0));
		System.out.println(Arrays.stream(arr2).average().orElse(0.0));
		// 문제가 있다면 0.0으로 출력해라 문제가 없다면 double로 그대로 출력

		Arrays.stream(arr).average().ifPresent(item -> System.out.println("예외 : " + item)); // 문제가 없다면 출력을 해준다.
		Arrays.stream(arr2).average().ifPresent(item -> System.out.println("예외 : " + item)); // 문제가 없다면 출력을 해준다.

		System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a + b / 2 + 1));
		// 앞에는 초기값 0 뒤에는 계산식 원하는 계산식을 실행해줌 1,3,5,7 = 16/2 = 8
		// 1 = 0.5 int 0 / 3 = 1.5 int 1 5 = 2.5 int 2 / 7 = 3.5 int 3 > 0 1 2 3 4
	}

}
