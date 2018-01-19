
public class thing 
{
	public static void main(String[] args) 
	{
		//Tester
		int [] test1 = {1,4,4,5,2,4,3,17,0};
		double [] test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String [] test3 = {"zebra", "tortilla","abba", "foo", "bar", "aba"};
		
		
		
		
		bubble(test1);
		System.out.print(java.util.Arrays.toString(test1));
	}
	
	public static void bubble(int [] test) 
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
		
		/*
		 Saurav Sort
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
		*/	
	}
	
	public static void select() 
	{
		
	}
	
	public static void insert(int [] test) 
	{
		for(int i=0; i < test.length-1; i++) 
		{
			for(int j=i+1; i<test.length-1;j++)
				if(test[i] > test [j]) 
				{
			
				}	
		}
		
		
	}
	
	public static void swapper(int [] arr, int x, int y) 
	{
		int holder = arr[x];
		arr[x] = arr[y];
		arr[y] = holder;
		
	}
}
