package Suddenattack;

public class Main {

	public static void main(String[]args) 
	{
		Level10 level10 = new Level10();
	      
	      level10.print();

	      System.out.println("10레벨 효과\n"+"추가 경험치:"+level10.expUp+"\n"+level10.upGrade+"\n");
	      level10.expUp ="30%";
	      System.out.println("20레벨 효과\n"+"추가 경험치:"+level10.expUp+"\n"+level10.upGrade+"\n");
	      level10.expUp ="50%";
	      System.out.println("30레벨 효과\n"+"추가 경험치:"+level10.expUp+"\n"+level10.upGrade+"\n");
	      
	      Level40 level40 = new Level40();
	      level40.expUp ="70%";
	      System.out.println("40레벨 효과\n"+"추가 경험치:"+level40.expUp+"\n"+level40.upGrade+","+
	                     level40.swapSpeedUp+","+level40.reLoadSpeedUp+"\n");
	   
	      Level50 level50 =new Level50();
	      level40.expUp="100%";
	      System.out.println("50레벨 효과\n"+"추가 경험치:"+level40.expUp+"\n"+level40.upGrade+","+
	            level50.swapSpeedUp+","+level50.reLoadSpeedUp+","+level50.gunTransLucent+"\n");
	   }
}
