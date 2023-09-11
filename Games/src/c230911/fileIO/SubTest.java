package c230911.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SubTest {

	public static void test() {
		try {
			write("테스트중", "test.txt");

			String str = read("test.txt");
			System.out.println("str: " + str);
		} catch (Exception e) {
		}
	}

	// 같은 static이여야 호출이 가능해서 static을 붙여준다.
	private static void write(String str, String fileName) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Users\\KGA\\git\\Java4\\Games\\src\\c230911\\fileIO\\" + fileName);
		Writer writer = new OutputStreamWriter(os, "UTF-8"); // 유니코드를 설정 해줄 수있음/

		writer.write(str);
		writer.flush();
		writer.close();
	}

	private static String read(String fileName) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KGA\\git\\Java4\\Games\\src\\c230911\\fileIO\\" + fileName);
		Reader reader = new InputStreamReader(is);

		char[] arr = new char[100];
		int count = reader.read(arr);
		reader.close();
		return new String(arr, 0, count);
	}

}
