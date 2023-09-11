package c230911;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void test() {
		// String path
		Path path = Paths.get("src/c230911/../c230908");// 자동으로 잡아준다 / 나 \를
		System.out.println(path.toAbsolutePath().normalize()); //toAbsolutePath 절대경로를 받아온다.
								//	normallize로 경로수정가능
		
		File file = new File(path.toString()+"\\Main2.java");
		System.out.println(file.exists());
		try {
//		file.createNewFile();//새로운 파일을 만든다.
		file.mkdir(); //디렉토리를 만든다.
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
