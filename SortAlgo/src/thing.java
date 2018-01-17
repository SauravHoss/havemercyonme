
public class thing 
{

	public static void main(String[] args) 
	{
		int [] test = {3,10,4,5,7,6,8,1};
		System.out.println(bubble(test));
	}

	
	public static void bubble(int [] test) 
	{
		int swaps = 0;
		while(swaps!=0)
		{
			for(int i=1; i<test.length; i++) 
			{
				if(test[0]>test[i])
				{
					swapper(test, , i);
				}
			
			}
	
		}
		
	}
	
	public static void select() 
	{
		
	}
	
	public static void insert() 
	{
		
	}
	
	public static void swapper(int [] arr, int x, int y) 
	{
		int holder = arr[x];
		arr[x] = arr[y];
		arr[y] = holder;
		
	}
}
