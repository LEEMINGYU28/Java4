package c230908;

@FunctionalInterface
public interface PrintTest {
	void print(String name);
				//타입으로 매개변수를 넣어줘야 사용가능

	public default int test() {
		return 1;
		//default 메서드는 넣어줄 수 있다.
	}
}
