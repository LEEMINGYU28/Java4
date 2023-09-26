package c230926.student;

public class StudentVO {

	private int ids;
	private String name;
	private String studentId;
	private String studentPw;
	private int age;
	private String gitAddress;
	//student_id < 스네이크 표기법
	//studentId < 카멜 표기법
	//student-id < 케밥형

	public StudentVO(
			int ids,
			String name,
			String studentId,
			String studentPw,
			int age,
			String gitAddress
			) {
		this.ids= ids;
		this.name = name;
		this.studentId = studentId;
		this.studentPw = studentPw;
		this.age = age;
		this.gitAddress = gitAddress;
	}
	public StudentVO(	
			String name,
			String studentId,
			String studentPw,
			int age,
			String gitAddress
			) {
		this.name = name;
		this.studentId = studentId;
		this.studentPw = studentPw;
		this.age = age;
		this.gitAddress = gitAddress;
	}
	
	public int getIds() {
		return ids;
		}
	public String getName() {
		return name;
		}
	public String getStudentId() {
		return studentId;
		}
	public String getStudentPw() {
		return studentPw;
		}
	public int getAge() {
		return age;
		}
	public String getGitAddress() {
		return gitAddress;
		}
}
