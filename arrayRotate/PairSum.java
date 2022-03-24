package arrayRotate;

public class PairSum 
{
	static boolean pairInSortedRotate(int arr[],int n,int x)
	{
		int i;
		for(i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				break;
			}
		}
		int l=(i+1)%n;
		int r=i;
		while(l!=r)
		{
			if(arr[l]+arr[r]==x)
			{
				return true;
			}
			if(arr[l]+arr[r]<x)
			{
				l=(i+1)%n;
			}
			else
			{
				r=(n+r-1)%n;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,5,7,3,9,4,8};
		int sum=10;
		int n=arr.length;
		if(pairInSortedRotate(arr,n,sum))
		{
			System.out.println("Array has two elements "+"with sum 16");
		}
		else
		{
			System.out.println("Array doesn't have two element with sum 16");
		}
	}
}
