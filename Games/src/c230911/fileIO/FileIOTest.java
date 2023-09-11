package c230911.fileIO;

import java.io.Writer;
import java.io.Reader;
import java.io.FileWriter;
import java.io.FileReader;

public class FileIOTest {

	public static void test() {
		try {
			String path = "C:/Users/KGA/git/Java4/Games/src/c230911/fileIO/test.txt";
			Writer writer = new FileWriter(path);

			writer.write('a');
			writer.write('b');
			writer.write("cd");
			writer.write("가나다라");

			writer.flush();
			writer.close();

			Reader reader = new FileReader(path);

			System.out.println((char) reader.read());
			System.out.println((char) reader.read());

			char[] arr = new char[10];
			int count = reader.read(arr);
			System.out.println(count + " : " + new String(arr, 0, count));

			reader.close();
		} catch (Exception e) {

		}
	}
}
