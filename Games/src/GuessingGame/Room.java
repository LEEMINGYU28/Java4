package GuessingGame;


public class Room {

	protected String[] furniture = new String[] {"침대","액자","책상"};
		protected int rooms() {

		for (int i=0; i <3; i++) 
		{
		int k=(int)(Math.random()*3);
		
		String temp=furniture[i];
		furniture[i]=furniture[k];
		furniture[k]=temp;
		}
		System.out.println("---------------------\n"
				+  	"|"+furniture[0]+"\t\t "+furniture[1]+"|\n"
				+   "|         \t "+furniture[2]+"|\n"
				+   "---------문----------");
		return 0;
		}
		
}
	

