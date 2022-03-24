package arrayRotate;
import java.util.*;
public class ArrayRotateStartToEnd3 
{
	public static void rotateArray(int arr[],int start,int end)
	{
		int temp;
		if(start>=end)
		{
			return;
		}
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,arr[],i;
		System.out.print("Enter the size of array:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elments of array:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		rotateArray(arr,0,arr.length-1);
		print(arr);
	}
}
