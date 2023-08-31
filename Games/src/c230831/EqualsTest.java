package c230831;

public class EqualsTest {
	String name;
	int num;
	EqualsTest(int num,String name) {
		this.num = num;
		this.name = name;
		
		
	}
	@Override
	public boolean equals(Object obj) {
		//강제 형변환 obj를 EqualsTest로 
		//String이 참조형이지만 오버라이딩 되어 있기때문에 비교가 가능하다.
		//들어온 오브젝트가 EqualsTest인지 확인 할 필요가 있다.
		
		//앞에 타입이 뒤에 타입을 가졌냐 물어보는 것.
//		if(obj instanceof EqualsTest) {
//			if(num == ((EqualsTest)obj).num &&
//					((EqualsTest)obj).name.equals(name)) {
//			return true;
//			}
//		}
//		
//		
//		if(obj instanceof EqualsTest &&
//			((EqualsTest)obj).name.equals(name)) {
//			return true;
//		}
//		
//		return false;
		if(!(obj instanceof EqualsTest)) return false;
		
		if(!((EqualsTest)obj).name.equals(name)) return false;
		
		if(num != ((EqualsTest)obj).num)return false;
		
		return true;
		}

	
				
	
	@Override
	public int hashCode() {
		return num + name.hashCode();
	}
	
	@Override
	//오버라이딩을 통해 원하는대로 출력을 바꿔줄 수 있다.
	//문자열로 바꿔주는걸 toString이라고 한다.
	public String toString() {
		return "제 이름은 " + name + "입니다. 나이는 "+num+"살 입니다.";
	}
}	

