package MyGun;

import java.util.Scanner;

public class MyGunAWP {
	
//	String myGuns="무기를 사용하여 일정 킬 수를 달성할 때마다 레벨업하고,\n "
//					+"특정 레벨 도달 시 업그레이드된 무기로 교체";
//	String gunName="nobleAWP";
//	int myGunLevel=0;
//	int myGunKill=0;
//	String expUp;
//	String damage="데미지:100% (실공격력)175%";  //데미지
//	String rateOfFire="연사력:0%"; //연사력
//	String hitRate="명중률:100%";  //명중률
//	String firearmRecoil="총기반동:85%"; //총기반동
//	String numberOfBullets ="장탄수:5/무한"; //장탄수
//	String swapSpeedUp="교체속도 증가";
//	static String reLoadSpeedUp="장전속도 증가";
//	String gunTransLucent ="총기 반투명";
//	String upGrade="외형 업그레이드";
	


//	public class Level20 extends Information
//	{
//		public Level20(String upGrade) 
//		{
//			System.out.println("20레벨 기능"+upGrade);
//		}				
//	}
//	public class Level30 extends Information
//	{
//		public Level30(String upGrade) 
//		{
//			System.out.println("30레벨 기능"+upGrade);
//		}
//		
//		
//	}
//	public class Level40 extends Level10
//	{		
//		private static String upGrade;
//
//		public Level40(String swapSpeedUp,String reLoadSpeedUp) {
//			swapSpeedUp="교체속도 증가";
//			reLoadSpeedUp="장전속도 증가";
//			System.out.println("40레벨 기능"+swapSpeedUp+reLoadSpeedUp);
//		}
//		
//	}
//	public class Level50 extends Level40
//	{
//		public Level50(String swapSpeedUp, String reLoadSpeedUp,
//				String gunTransLucent) {
//			super(swapSpeedUp, reLoadSpeedUp);
//			gunTransLucent="총기 반투명";
//			System.out.println("50레벨 기능"+swapSpeedUp+reLoadSpeedUp
//					+gunTransLucent);	
//		}
//
//		
//	}
	
	
	public static void main(String[]args) 
	{
//		Level10 level10 = new Level10();
//		
//			
//		System.out.println("myGun :");
//		level10.print();
		
//		Scanner scanner=new Scanner(System.in);					
//	
//
//		MyGunAWP AWP=new MyGunAWP();
//		
//		System.out.println("현재 누적Kill 입력");
//		AWP.myGunKill = scanner.nextInt();
//	
//		
//		for(int i=0; i<AWP.myGunKill; i++) 
//		{
//		
//			if(AWP.myGunKill==270) 
//			{
//			AWP.myGunLevel=10;
//			System.out.println("10레벨달성\n"+"현재 kill수:"+AWP.myGunKill
//								+"\n기능:"+AWP.upGrade);
//			break;
//			} 			
//			if(AWP.myGunKill==1270) 
//			{
//			AWP.myGunLevel=20;
//			System.out.println("20레벨달성\n"+"현재 kill수:"+AWP.myGunKill
//								+"\n기능:"+AWP.upGrade);	
//			break;
//			}
//			if(AWP.myGunKill==2470) 
//			{
//			AWP.myGunLevel=30;
//			System.out.println("30레벨달성\n"+"현재 kill수"+AWP.myGunKill
//								+"\n기능"+AWP.upGrade);	
//			break;	
//			}
//			if(AWP.myGunKill==3870) 
//			{
//			AWP.myGunLevel=40;
//			System.out.println("40레벨달성\n"+"현재 kill수"+AWP.myGunKill
//								+"\n기능:");	
//			break;
//			}
//			if(AWP.myGunKill==5470) 
//			{
//			AWP.myGunLevel=50;
//			System.out.println("50레벨달성"+"현재 kill수"+AWP.myGunKill
//								+"\n기능:");	
//			break;		
//		}
	}
		


/*		
		System.out.println(AWP.gunName+"정보\n"+AWP.myGuns);
		
		System.out.println("AWP 정보\n"+AWP.damage+"\n"+AWP.rateOfFire+"\n"
							+AWP.hitRate+"\n"+AWP.firearmRecoil+"\n"+AWP.numberOfBullets
							+"\n서든어택 TRG-21와 동일한 성능으로 출시된 볼트액션 저격총이며,\n"
							+ "기존에 있던 TRG-21가 실제 TRG-21 외관이 다르고 카운터스트라이크의\n"
							+ "AWP 한방 데미지나 모양새 등 표절 의심 때문에 항의가 빗발쳤는지\n"
							+ "진짜 AWP를 제작하여 2012년에 출시되었다.\n"
							+ "하지만 어차피 같은 성능에 이미 기존에 있는 TRG-21에 익숙해지고 출시 후\n"
							+ "별다른 홍보도 없어서 잘 사용하지 않는다.\n");
		System.out.println();
		
		System.out.println("AWP레벨:"+AWP.Level10(0)+"\nkill:"+AWP.myGunKill+
							"\n추가경험치:"+AWP.expUp+"\n기능:"+AWP.upGrade);
		
		System.out.println("AWP레벨:"+AWP.Level20(0)+"\nkill:"+AWP.myGunKill+
							"\n추가경험치:"+AWP.expUp+"\n기능:"+AWP.upGrade);
		
		System.out.println("AWP레벨:"+AWP.Level30(0)+"\nkill:"+AWP.myGunKill+
							"\n추가경험치:"+AWP.expUp+"\n기능:"+AWP.upGrade);
		
		System.out.println("AWP레벨:"+AWP.Level40(0)+"\nkill:"+AWP.myGunKill+
							"\n추가경험치:"+AWP.expUp+"\n기능:"+AWP.upGrade+","+
							AWP.swapSpeedUp+","+AWP.reLoadSpeedUp);
		
		System.out.println("AWP레벨:"+AWP.Level40(0)+"\nkill:"+AWP.myGunKill+
							"\n추가경험치:"+AWP.expUp+"\n기능:"+AWP.upGrade+","+
							AWP.swapSpeedUp+","+AWP.reLoadSpeedUp+","+AWP.gunTransLucent);
*/	
	}
	
	
	
//}	
			
		
			
	

