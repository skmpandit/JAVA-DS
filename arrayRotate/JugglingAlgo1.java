package arrayRotate;
import java.util.*;
public class JugglingAlgo1 
{
	void leftRoate(int arr[],int d,int n)
	{
		int i,j,k,temp;
		d=d%n;
		int g_c_d=gcd(d,n);
		for(i=0;i<g_c_d;i++)
		{
			temp=arr[i];
			j=i;
			while(true)
			{
				k=j+d;
				if(k>=n)
				{
					k=k-n;
				}
				if(k==i)
				{
					break;
				}
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
		}
	}
	void printArray(int arr[],int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,d,arr[];
		System.out.print("Enter the size of array:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the rotation size:");
		d=sc.nextInt();
		JugglingAlgo rotate=new JugglingAlgo();
		rotate.leftRotate(arr, d, n);
		rotate.printArray(arr, n);
	}
}
