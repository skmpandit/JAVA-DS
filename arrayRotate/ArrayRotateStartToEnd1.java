package arrayRotate;
import java.util.*;
public class ArrayRotateStartToEnd1 
{
	public static void rotateArray(int arr[],int start,int end)
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
		int arr[],n;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		rotateArray(arr,0,n-1);
		print(arr);
	}
}
