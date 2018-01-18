
public class thing 
{
	public static void main(String[] args) 
	{
		int [] test = {3,10,4,5,7,6,8,1};
		
	bubble(test);
		System.out.print(java.util.Arrays.toString(test));
	}
	
	public static void bubble(int [] test) 
	{
		/* works
		{
			int counter = 5;
			while(counter > 0) 		
			{
				counter = 0;
				for(int j=0; j<test.length-1; j++) 
				{
					if(test[j]>test[j+1])
					{
						swapper(test, j, j+1);
						counter++;
					}
				
				}
			}		
		}
		*/ 
		//saurav Sort
		for(int i=test.length; i>0; i--)
		{
			for(int j=0; j<test.length-1-i; j++) 
			{
				if(test[j]>test[j+1])
				{
					swapper(test, j, j+1);
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
