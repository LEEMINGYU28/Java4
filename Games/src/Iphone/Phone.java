package Iphone;

interface InterfacePhone
//추상 메서드만 넣을 수 있다.
//변수도 넣을 수 있다.
//기본적으로 public static final 설정되고 바꾸지 못함.
//추상화된건 값을 가질 수 없다고 판단.
//리소스를 생성 할 수 없음.
{	
	String SIMNUMBER = "ㅇ";
	
	public void installApp(String appName);//앱설치 메서드
	void insstallApp(String appName);
	void call(String otnerOwner); //전화를 건다
}

public abstract class Phone implements InterfacePhone{
	//abstract는 추상
	//값이 없어야된다.
	//변수는 추상화가 안됨. 메서드 가능

	public String number;
	//public 변수는 잘 사용하지 않는다.
	//static(정적) 변수 이외에 쓰는 걸 본적이 거의 없음.
	//캡슐화,추상화,다형성,상속
	//외부에서 마음대로 건드릴수 있으면 안됨.
	//캡슐화를 하기 위해서 사용하지않음
	//

	private String owner;	
	//공유 할 수 없음 사용하려면 메서드로 리턴받아야함.
	//class Phone에 묶여있는 상태

	protected String operator ="LG";
	//(같은패키지 내에서만 사용가능)
//	public static String model = "아이폰14pro";
	//클래스 자체가 갖고있는 변수
//	public final String manufacturer = "애플";

	public static final double PI = 3.14;
	//수학으로 따졋을땐 상수 변하지 않는 변수를 쓸때 쓰는것
	
	//super = 부모클래스를 참조하는 변수
	//private는 사용불가 class를 수정하는것이 때문이다.
	
	// 의미없는 주석
	/*사용하기에 따라서 코딩할 때 의미를 갖는다.
	*/
	public Phone(String owner) 
	{
		this.owner = owner;
	}
	
	public void setOwner(String owner) 
	{//setter
		this.owner = owner;
	}
	
	public String getOwner() 
	{
		return owner;
	}
	
	
	
	public void takeAPicture() 
	{
		System.out.println("사진을 찍었습니다.");
	}
	@Override
	public void call(String otherOwner) 
	{
		System.out.println(owner+"가 "+otherOwner+"에게 전화를 건다");
	}
	
	public abstract void intstallapp(String appName);
	//추상메서드 
	
}

class GalaxyPhone extends Phone
{
	public static final String manufacturer = "갤럭시";
	public GalaxyPhone(String owner,String number) 
	{
		super(owner);
		this.number=number;
		this.operator="LG";
	}
	@Override
	public void insstallApp(String appName) 
	{
		System.out.println("구글 스토어에서"+appName+"을 다운받는다");
	}
	@Override
	public void installApp(String appName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void intstallapp(String appName) {
		// TODO Auto-generated method stub
		
	}
	
}


class Iphone extends Phone
{
	public static final String manufacturer = "애플";
	public Iphone(String owner,String number) 
	{
		super(owner);
		this.number=number;
		this.operator="LG";
	}
	@Override
	//Override 했으므로 부모한테 해당 메서드가 있어야 함.
	public void insstallApp(String appName) 
	{
		System.out.println("앱 스토어에서"+appName+"을 다운받는다");
	}
	@Override
	public void installApp(String appName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void intstallapp(String appName) {
		// TODO Auto-generated method stub
		
	}

	
}

class Player
{	private String nickName;
	public Player(String nickeName) 
	{
		this.nickName = nickeName;
	}

	public String geNickName() 
	{
		return nickName;
	}
}

