
public class thing 
{
	public static void main(String[] args) 
	{
		//Testers
		int [] test1 = {1,4,4,5,2,4,3,17,0};
		double [] test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String [] test3 = {"zebra", "tortilla","abba", "foo", "bar", "aba"};
		
		//Bubble Sort Test			
		long start = System.nanoTime();
		bubble(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test 1 Bubble Sort Time: " + time + " nanoseconds" + "\n	Result: " + java.util.Arrays.toString(test1));

		start = System.nanoTime();
		bubbles(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test 3 Bubble Sort Time: "+ time +" nanoseconds" + "\n	Result: " + java.util.Arrays.toString(test3));

		
		
	}
	
		//Uses Bubble sort for an array of integers
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
						swapperi(test, j, j+1);
						counter++;
					}
				}
			}	
		}	
		
		//Uses Bubble sort for an array of String
		public static void bubbles(String [] test) 
		{			
			int counter = 5;
			while(counter > 0) 		
			{
				counter = 0;
				for(int j=0; j<test.length-1; j++) 
				{
					if(test[j].compareTo(test[j+1])>0)
					{
						swappers(test, j, j+1);
						counter++;
					}			
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
	
		public static void select() 
		{
		
		}
	
		public static void insert(int [] test) 
		{
			for(int i=0; i < test.length-1; i++) 
			{
				for(int j=i+1; i<test.length-1;j++) 
				{
					if(test[i] > test [j]) 
					{
			
					}	
				}
			}
		}
	
	//Swaps two items in an array of integers
	public static void swapperi(int [] arr, int x, int y) 
	{
		int holder = arr[x];
		arr[x] = arr[y];
		arr[y] = holder;	
	}
	
	//Swaps two items in an array of Strings
	public static void swappers(String[] test, int x, int y) 
	{
		String holder = test[x];
		test[x] = test[y];
		test[y] = holder;
	}
}
