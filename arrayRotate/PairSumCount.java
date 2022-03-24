package arrayRotate;

public class PairSumCount 
{
	static int pairInSortedRotate(int arr[],int n,int x)
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
		int cnt=0;
		while(l!=r)
		{
			if(arr[l]+arr[r]==x)
			{
				cnt++;
				if(l==(r-1+n)%n)
				{
					return cnt;
				}
				l=(l+1)%n;
				r=(r-1+n)%n;
			}
			else if(arr[l]+arr[r]<x)
			{
				l=(l+1)%n;
			}
			else
			{
				r=(n+r-1)%n;
			}
		}
		return cnt;
	}
	public static void main(String[] args) 
	{
		int arr[]= {11,34,65,98,93,12};
		int sum=23;
		int n=arr.length;
		System.out.println(pairInSortedRotate(arr,n,sum));
	}
}
