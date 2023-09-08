package c230908;

public class Student implements Comparable<Student> {
	private String name;
	private int score; 
	//평균
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}

	public String getName() {return name;}
	public int getScore() {return score;} //캡슐화

	@Override
	public int hashCode() {
		return name.hashCode();
		}
	
	@Override
	public String toString() {
		return name + " : " + score;
	}
	@Override
	public int compareTo(Student s) {
		return score - s.getScore(); //크면 위로올라간다.
	}
}
