package Iphone;

public class Main {

	public static void main(String[]args) 
	{
//		Phone myPhone = new Phone("이민규");
//		myPhone.number = "010-3921-8473";
//		System.out.println(myPhone.number);
		
		
//		System.out.println(myPhone.getOwner());
		
//		System.out.println(myPhone.operator);
		
//		System.out.println(Phone.model);
			//static은 클래스 자체에서 가져오게됨
		
		GalaxyPhone myPhone1 = new GalaxyPhone("이민규","010-3921-8473");
		//매개변수를 안넣어줘서 에러
		System.out.println(myPhone1.getOwner());
		//public 이기때문에 사용가능 
	
		System.out.println(GalaxyPhone.manufacturer);
		System.out.println(Iphone.manufacturer);
		
		Iphone myPhone2 = new Iphone("이민규","010-3921-8473");
		myPhone2.installApp("카카오톡");
		
		Phone[] myPhones = new Phone[] {myPhone1,myPhone2};
		
		myPhones[0].installApp("송성민");
		myPhones[1].installApp("송성민");
		
		short temp = 1;
		int temp1 = temp;
	}
}
