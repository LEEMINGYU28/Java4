package Calculator;

public interface CalcInterface extends AddInterface, MinusInterface, 
									MultiInterface,divisionInterface{
	 public default int add(int ...nums) 
	 {
	      int temp = 0;
	      for(int num : nums) 
	      {
	         temp = AddInterface.super.add(temp,num);
	      }
	      return temp;
	   }

	   public default int minus(int ...nums) 
	   {
	      int temp = nums[0];
	      for(int i = 1; i<nums.length; i++) 
	      {
	         temp = MinusInterface.super.minus(temp,nums[i]);
	      }
	      return temp;
	   }

	
	default int multi(int ...nums) 
	{
		
		int temp= nums[0];
		for(int i = 1; i<nums.length; i++) 
		{
		temp = MultiInterface.super.multi(nums[i],temp);
		}
		return temp;
	}
	default int division(int ...nums) 
	{
		
		int temp= nums[0];
		for(int i = 1; i < nums.length; i++) 
		{
		temp = divisionInterface.super.division(temp,nums[i]);
		}
		return temp;
	}
	
}
