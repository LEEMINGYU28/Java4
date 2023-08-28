package NumberPuzzleOOP;

public class Puzzle extends Moving {

	private int[][] puzzle;
	
	public void setPuzzle(int x,int y) //준비하다
	{
		puzzle = new int[y][x];
		 for(int i=0; i<y; i++) 
	      {
	         for(int j=0; j<x; j++) 
	         {
	            puzzle[i][j]= i * x + j + 1;
	         }         
	      }
		 puzzle[y - 1][x - 1]=0;
		 player.setPosition(x - 1, y - 1);	 
		 
		 shuffle();
	}
	
	
	
	public void shuffle() 
	{
		for(int i=0; i <1;) 
		{
			 int temp= ((int) (Math.random()*4)+1)*2; 
			if(movePlayer(puzzle,temp)) i++;
		}
	}
	
	public boolean getIsEnd() 
	{
		  for(int i=0; i<puzzle.length; i++) 
	      {		
	            for(int j=0; j<puzzle.length; j++) 
	            {
	            	
	            	if(puzzle[i][j] != i * puzzle[0].length + j + 1 ) 
	            	{
	            		return false;
	            	}
	            }			        
	      }
		return true;       	
	}
	
	public void movePlayer(int direction) 
	{
		super.movePlayer(puzzle, direction);
	}
	
	public void print() 
	{
		for(int i=0; i <puzzle.length; i++) 
		{
			{for(int j = 0; j<puzzle[0].length; j++)
		if(puzzle[i][j] == 0)
			System.out.print("p\t");
			else
			System.out.print(puzzle[i][j] + "\t");
		}
			System.out.print("\n");
		}
	}
}
