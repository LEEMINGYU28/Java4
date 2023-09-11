package c230911.dataStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void test() {
		try {
			String path = DataStreamTest.class.getResource("").getPath() + "test.db";
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Student s1 = new Student(1, "권원준", 90.0);
			Student s2 = new Student(2, "임현규", 93.0);
			Student s3 = new Student(3, "김동선", 100.0);

			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);

			oos.flush();
			oos.close();
			fos.close();

			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student sr1 = (Student) ois.readObject();
			System.out.println(sr1.num);
			System.out.println(sr1.name);
			System.out.println(sr1.score);

			sr1 = (Student) ois.readObject();
			System.out.println(sr1.num);
			System.out.println(sr1.name);
			System.out.println(sr1.score);

			sr1 = (Student) ois.readObject();
			System.out.println(sr1.num);
			System.out.println(sr1.name);
			System.out.println(sr1.score);

			ois.close();
			fis.close();
//			데이터들끼리에 확실한 매칭을해주어야함. class한테 시리얼번호 붙여주는것.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
