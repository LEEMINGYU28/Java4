package GuessingGame;

public class Room {
	
	String[] test = new String[] {"침대","액자","책상"};
	int roomMap() {

		for (int i=0; i <3; i++) 
		{
		int k=(int)(Math.random()*3);
		
		String temp=test[i];
		test[i]=test[k];
		test[k]=temp;
		}
		System.out.println("---------------------\n"
				+  	"|"+test[0]+"\t\t "+test[1]+"|\n"
				+   "|         \t "+test[2]+"|\n"
				+   "---------문----------");
	return 0;
	}
	
}
