import java.util.*;
public class Binary
{

	static void readar(int a[],int n)
	{	
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
	}
	static void printar(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	} 
	
	
	static void sort(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	static void search(int a[],int n)
	{
		int key,start=0,mid,end=n-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key to search : ");
		key=sc.nextInt();
		boolean found = false;
		while(start<end)
		{
			mid=(start+end)/2;
			if(key==a[mid])
			{
				System.out.println("the  key is found at index "+mid);
				 found =true;
				break;
			}
			else if(key<a[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		if(found!=true)
		System.out.println("the key not found!");
	}
	
	public static void main(String args[])
	{
		int n,key;
		int[] a = new int[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		n=sc.nextInt();
		System.out.println("enter the elements:");	
		readar(a,n);
		
		sort(a,n);
		System.out.println("the array after sorting:");
		printar(a,n);
		
		search(a,n);
	}
}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	
	
