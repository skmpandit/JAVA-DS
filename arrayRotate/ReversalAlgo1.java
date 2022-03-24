package arrayRotate;
import java.util.*;
public class ReversalAlgo1 
{
	static void leftRotate(int arr[],int d)
	{
		if(d==0)
		{
			return;
		}
		int n=arr.length;
		d=d%n;
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
	}
	static void reverseArray(int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
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
		System.out.print("Enter the rotation size:");
		d=sc.nextInt();
		leftRotate(arr,d);
		print(arr);
	}
}
