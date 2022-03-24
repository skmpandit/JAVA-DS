package arrayRotate;
import java.util.*;
public class BlockSwapAlgo1 
{
	public static void leftRotate(int arr[],int d,int n)
	{
		leftRotateRee(arr,0,d,n);
	}
	public static void leftRotateRee(int arr[],int i,int d,int n)
	{
		if(d==0||d==n)
		{
			return;
		}
		if(n-d==d)
		{
			swap(arr,i,n-d+i,d);
			return;
		}
		if(d<n-d)
		{
			swap(arr,i,n-d+i,d);
			leftRotateRee(arr,i,d,n-d);
		}
		else
		{
			swap(arr,i,d,n-d);
			leftRotateRee(arr,n-d+i,2*d-n,d);
		}
	}
	public static void print(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void swap(int arr[],int fi,int si,int d)
	{
		int i,temp;
		for(i=0;i<d;i++)
		{
			temp=arr[fi+i];
			arr[fi+i]=arr[si+i];
			arr[si+i]=temp;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,d,arr[];
		System.out.print("Enter the size of array:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the rotation size:");
		d=sc.nextInt();
		leftRotate(arr,d,n);
		print(arr,n);
	}
}
