package arrayRotate;
import java.util.*;
public class CyclicallyRotate1 
{
	static void rotate(int arr[])
	{
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
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
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int arr[];
		arr=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		rotate(arr);
		print(arr);
	}
}
