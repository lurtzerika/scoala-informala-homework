
/**
 * 2. Display the smallest number from a collection of numbers
 */

public class SmallestNumber {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;
        int c = 6;
        int d = 5;
        int temp = Integer.MAX_VALUE;

        if (a < temp) {
            temp = a;
        }

        if (b < temp) {
            temp = b;
        }
        if (c < temp) {
            temp = c;
        }
        if (d < temp) {
            temp = d;
        }
        System.out.println("The smallest number is: " + temp);
    }
}





/*public class SmallestNumber
{  
	public static int getSmallest(int[] a, int total)
	{  
		int temp;  
		for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[0];  
	}  

	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  

		System.out.println("Smallest: "+getSmallest(a,6));  
		System.out.println("Smallest: "+getSmallest(b,7));  
	}
}  
or
*/ 

/*import java.util.*;  

public class SmallestNumber
{  
	public static int getSmallest(Integer[] a, int total)
	{  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(0);  
		return element;  
	}  
	public static void main(String args[])
	{  
		Integer a[]={1,2,-5,6,3,2};  
		Integer b[]={44,-66,99,77,33,22,55};  
		
		System.out.println("Smallest: "+getSmallest(a,6));  
		System.out.println("Smallest: "+getSmallest(b,7));  
	}
}  
*/

/* or
import java.util.Scanner;

public class SmallestNumber 
{
	public static void main(final String[] args) 
	{
		int smallest = 0;
		int num;
		
		System.out.println("How many numbers do you want to enter? ");
		Scanner s = new Scanner(System.in);
				
		int n = s.nextInt();
		
		System.out.println("Start adding the numbers, please:");
		
		for (int i = 0; i < n; i++)
		{
			num = s.nextInt();
			
			if (i == 0 && num > 0)
			{
				smallest = num;
			}
			if (num < smallest)
			{
				smallest = num;
			}
			System.out.println(" The smallest number is: " + smallest);
		}
	}
}
*/