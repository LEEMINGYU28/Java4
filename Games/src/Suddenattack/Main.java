package Suddenattack;

public class Main {

	public static void main(String[]args) 
	{
		Level10 level10 = new Level10();
		
		level10.print();
		
		System.out.println("10레벨 효과\n"+"추가 경험치:"+level10.expUp+"\n"+level10.upGrade);
	}
}
