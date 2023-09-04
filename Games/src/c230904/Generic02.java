package c230904;

//class Apple{}
//class Pencil{}
//
//class Goods<T extends Fruit>{ 	//Fruit으로 제한을 걸었으면 Apple이나 Pencil은 들어올 수 없다.
//	상속한다는 의미가 아니라 최상위클래스나 인터페이스로 지정을 해주는것이다. 여기까지다.
//	
//}

//class A{}
class B extends A{}
class C extends B{}
class D<T extends B> {//최상위클래스를 B로 지정
	
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}

//제네릭 클래스의 타입제한
//접근 지정자 class 클래스명<T extends 최상위클래스 / 인터페이스명>{}

//제네릭 메서드 타입제한 
//접근 지정자<T extends 최상위 클래스 / 인터페이스> T 메서드(T t){}

class GenericMethod1{
	public<T> void test(T t) {
//		char c=t.charAt(0);
	}
	//최상위클래스가 String이다 라는걸 알려준다.
	public <T extends String>void method2(T t) {
		char c=t.charAt(0);
		
	}
}

class GenericMethod01{
	public<T extends Number>void method1(T t){
		System.out.println(t.intValue());
	}
}
interface MyInterface{
	public abstract void print();
}
class B1{
	public <T extends MyInterface> void Metod01(T t) {
		t.print();
	}
}
public class Generic02 {

	public static void main(String[]args) {
		
	//	D<A> d1=new D<>(); B로 최상위클래스로 잡아둔 상태 이기때문에 A로 접근할 수없다.
		D<B> d2=new D<>();
		D<C> d3=new D<>();
		
		GenericMethod01 g =new GenericMethod01();
		g.method1(5.5);
		
		
		B1 b=new B1();
		b.Metod01(new MyInterface() {

			@Override
			public void print() {
				System.out.println("print() 구현");
			}
		});
	}
}
