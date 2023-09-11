package c230911.dataStream;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //자동으로 생성되는게 더 안전하게 만들어진다.
	int num;
	String name;
	double score;

	Student(int num, String name, double score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}
}
