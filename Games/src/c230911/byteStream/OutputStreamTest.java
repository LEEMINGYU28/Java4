package c230911.byteStream;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {

	// 통신이란 뭘까?
	// - 데이터를 주고 받는것
	// - 언제 통신한다고 말할 수 있을까?
	// => 데이터를 보내리고 답신을 받을 때
	// 어디로 보낼까 > 서버,클라이언트 , DB
	// 위 내용은 일반적으로 생각할 수 있는 통신이다.
	// 키보드 입력 시 데이터가 메인보드를 통해 CPU에 전달된다.
	// i = input o = output
	public static void test() {

		// \\는 window 기준이고 / 는 나머지 운영체제 (Linux, Mac, Ubuntu, Abdroid)기준이다
		// 자바는 독립적이라 상관없다.

		// C:\Users\KGA\git\Java4\Games\src\c230911\byteStream
		String path = "C:\\Users\\KGA\\git\\Java4\\Games\\src\\c230911\\byteStream\\test.db";
		System.out.println();
		try {
			OutputStream os = new FileOutputStream(path); // 파일을 내보내는 stream

			os.write(10);
			os.write(20);
			os.write(30); // 파일에 적어준다.

			os.flush(); // 메모리가 가득 차지 않았어도 강제로 파일에 저장할때 사용
			os.close(); // stream이후엔 항상 close를 닫아주어야함.

			InputStream is = new FileInputStream(path);

			System.out.println(is.read()); // 위에 입력한 숫자가 순서대로 나옴
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read()); // 넘어가면 -1이 나옴

			while (true) {
				int data = is.read();
				if (data == -1)
					break;
				System.out.println("data :" + data);
			}

			is.close(); // 통신을 끝내라
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			OutputStream os = new FileOutputStream(path);

			byte[] arr = { 10, 20, 30 };
			os.write(arr);

			os.flush(); // 저장
			os.close();

			InputStream is = new FileInputStream(path);
			byte[] arr1 = new byte[100]; // 최대 몇 바이트까지 가져올지 배열로 생성한다. 100바이트까지 받아온다

			int count = is.read(arr1);

			for (int i = 0; i < count; i++) {
				System.out.println("arr1[" + i + "] : " + arr1[i]);
			}
//			가 << UTF-8 << 3byte << FF FF FF > AC 00
//			맨앞에 FF는 UTF-8이라는걸 알려줌
			is.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
