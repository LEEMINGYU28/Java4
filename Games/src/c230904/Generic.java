package c230904;


class Apple{}
//class Goods1{
//	private Apple apple = new Apple();
//	
//	public Apple GetApple() {
//		return apple;
//	}
//	public void SetApple(Apple apple) {
//		this.apple = apple;
//	}
//}
class Pencil{}
//class Goods2{
//	private Pencil pencil = new Pencil();
//	public Pencil GetPencil() { //접근자와
//		return pencil;
//	}
//	public void SetPencil(Pencil pencil) { //설정자
//		this.pencil = pencil;
//	}
//}

//위 코드를 봤을때 새로운 상품이 추가 될때마다 새롭게 클래스를 만들어야 하나?

//첫번째 해결 방법은 최상위 클래스인 Object타입으로 선언하는것.
//Object 객체를 저장하고 관리하는 클래스를 생성하면 과일이든, 학용품이든 저장하거나 읽어들일 수 있음.

//class Goods3{
//	private Object object = new Object();
//	public Object Get() {
//		return object;
//	}
//	public void Set(Object object) {
//		this.object=object;
//	}
//}

//모든타입에 데이터를 저장할 수 있고 잘못된 캐스팅을 했을때 사전에 오류를 차단할 수 있다.

// 제네릭 클래스와 제네릭 인터페이스 

//제네릭 클래스
/*
 접근 지정자 class 클래스명<T>{ 제네릭타입이 하나들어간것.
 
 }
 접근 지정자 class 클래스명<K,T>{ 두개가 들어간것.
 
 }
 접근 지정자 interface 클래스명<K,T>{ 
 
 }
 접근 지정자 interface 클래스명<K,T>{ 
 
 } 
 */

//제네릭 클래스의 객체생성
//객체 생성 과정은 일반 클래스의 객체 생성과 비슷
//단, 클래스명 다음에<실제 제네릭타입>을 삽입한다.
//즉, 객체를 생성할때 제네릭 타입 변수에 실제 타입을 대입한다.

//클래스명<실제 제네릭타입> 참조변수 명 = new 클래스명<실제 제네릭 타입>();
//클래스명<실제 제네릭타입> 참조변수 명 = new 클래스명<>(); 
//앞에 써준 실제 제네릭타입과 뒤 <>는 동일 하기 때문에 안써도 상관없다.


class MyClass<T>{
	private T t;
	public T Get() {
		return t;
	}
	public void Set(T t) {
		this.t =t;
	}
}
class KeyValue<K,T>{
	private K key;
	private T value;
	
	public K GetKey() {
		return key;
	}
	public void SetKey(K key) {
		this.key=key;
	}
	public T GetValue() {
		return value;
	}
	public void SetValue(T value) {
		this.value=value;
	}
}

class CharcterFactory<T>{
	
	private T character;
	
	public CharcterFactory(T character) {
		this.character =character;
	}
	public void Introduce() {
										//오브젝트에 소속된것 클래스의 간단한 이름을 문자열로 리턴하는것	
		System.out.println("나는"+character.getClass().getSimpleName()+"character");
		//getClass= 오브젝트에 소속된 내장메서드
		//getSimpleName = 클래스의 간단한 이름을 문자열로 리턴하는것
		//객체에 메서드를 여러번 호출해서 한줄로 표현하는것 
	}
	//문자열 앞뒤공백제거 > 대문자로 변환 > 처음 5글자만 추출
//	String reString=inputString.trim().toUpperCase().substring(0,5);
	public T getCharacter() {
		return character;
	}
}
class Knight{
	private String name;
	
	public Knight(String name) {
		this.name=name;
	}
	public void Attack() {
		System.out.println(name+"칼을 휘두룬다");
	}
}
class Wizard{
	private String name;
	public Wizard(String name) {
		this.name=name;
	}
	public void Skill() {
		System.out.println(name+"파이터 볼 발사");
	}
}
public class Generic {
//일반화 프로그래밍 비효율성을 한번에 해결해줄 수 있음.
	public static void main(String[]args) {
	
//	Goods3 goods3= new Goods3();
//	goods3.Set(new Apple());
	
	//단점은 Set을 했을때 다 형변환을 해줘야해서 불편함.
	//타입으로 꺼내오기 위해서는 저장된 형태로 타입 캐스팅을 해야한다.
	//필드자체가 Object 타입이라 Get으로 가져오는 타입 또한 Object타입 이기 때문이다.
	//이러한 형태를 띄우고 있다면 Get을 할때는 Set을 한 타입으로 형변환을 해야한다.
//	Apple apple = (Apple)goods3.Get(); 
	
	//제네릭 클래스인 MyClass
	//제네릭 클래스는 객체를 생성하는 시점에 타입을 만들어 주는것.
	//제네릭 클래스로 다양한 유형의 타입을 다 만들어줄 수있다.
	
	//String 타입을 저장하거나 꺼내 올수 있는 객체로 지정	
	MyClass<String> mc1 = new MyClass<String>();
	mc1.Set("안녕");
	System.out.println(mc1.Get());
	
//	Integer 타입을 저장하거나 꺼내 올수 있는 객체로 지정
	MyClass<Integer> mc2=new MyClass<Integer>();
	mc2.Set(12345);
	System.out.println(mc2.Get());
	
	//제네릭 타입 변수가 2개인 경우
	KeyValue<String,Integer> kv1 = new KeyValue<>();
	
	kv1.SetKey("원숭이");
	kv1.SetValue(12345);
	String key1=kv1.GetKey();
	int value1=kv1.GetValue();
	System.out.println("Key :"+key1+"value :"+value1);
	
	//Void = 해당타입을 사용하지 않겠다.
	KeyValue<String, Void> kv2=new KeyValue<>();
	
	kv2.SetKey("키값만 사용하겠음");
//	kv2.SetValue(1234);
	
	///////////////////////////////////////////
	CharcterFactory<Knight> knightFactory = new CharcterFactory<>(new Knight("홍길동"));
	CharcterFactory<Wizard> WizardFactory = new CharcterFactory<>(new Wizard("ㅇㅇㅇ"));
	
	knightFactory.Introduce();
	Knight knight=knightFactory.getCharacter();
	knight.Attack();
	
	}
}
