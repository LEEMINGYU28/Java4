package c230925;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);

	public static void check() { // 주어진 문자열에서 특정 문자의 개수를 세는 프로그램

		System.out.println("문자열을 입력하세요: ");
		String inputString = scanner.nextLine();

		System.out.println("찾을 문자를 입력하세요: ");
		char targetChar = scanner.nextLine().charAt(0);

		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == targetChar) {
				count++;
			}
		}

		System.out.println("입력한 문자열에서 '" + targetChar + "'의 개수는 " + count + "개입니다.");

	}

	public static void reverse() {// 주어진 문자열 거꾸로 출력

		System.out.println("문자열 입력");
		String str = scanner.nextLine();

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);

		System.out.close();
	}

	public static void blank() { // 공백제거
		System.out.println("입력(공백제거)");
		String yourString = scanner.nextLine();

		System.out.println(yourString.replaceAll(" ", ""));
	}

	public static void change() { // 대소문자 바꿔서 출력하기
		String str = "hello world";
		str = str.toUpperCase();
		System.out.println("대문자로 출력 :" + str);

		String str1 = "HELLO WORLD";
		str1 = str1.toLowerCase();
		System.out.println("소문자로 바꿔서 출력 :" + str1);
	}

	public static void findCharIndex() {// 문자열에서 문자 찾기
		System.out.println("문자열 입력");
		String str = scanner.nextLine();
		System.out.println("찾을문자 입력");
		String targetChar = scanner.nextLine();
		System.out.println(str.lastIndexOf(targetChar));
	}

	public static int countWords(String str) { // 문자열의 단어갯수 구하기

		System.out.println("문자열 입력");
		str = scanner.nextLine();
		String[] words = str.split(" ");
		int wordCount = countWords(str);
		System.out.println("문자열의 단어 갯수:" + wordCount);
		return wordCount;

	}

	public static boolean isPrime(int num) { // 소수점인지 아닌지
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
			System.out.println("소수인가? : " + isPrime(5));
		}
		return true;
	}

	public static int calculateDigitSum(int num) { // 양의 정수의 각 자릿수의 합
		if (num <= 0) {
			System.out.println("양의 정수를 입력");
			num = scanner.nextInt();
		}
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}

		System.out.println("자릿수의 합 : " + sum);
		return sum;

	}

	public static void FindCommonItems() { // 정렬된 배열에서 공통항목 찾기
		int[] arr1 ={1,5,5,10};
		int[] arr2 = {3,4,5,5,10};
		int[] arr3 = {5,5,10,20};
	}
}
