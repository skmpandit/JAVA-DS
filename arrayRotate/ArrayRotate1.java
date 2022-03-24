package arrayRotate;
import java.util.Scanner;

public class ArrayRotate1 
{
	void leftRotate(int arr[],int d,int n)
	{
		for(int i=0;i<d;i++)
		{
			leftRotateOne(arr,n);
		}
	}
	void leftRotateOne(int arr[],int n)
	{
		int i;
		int temp=arr[0];
		for(i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
	void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int n,arr[],d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the rotation number:");
		d=sc.nextInt();
		sc.close();
		ArrayRotate rotate=new ArrayRotate();
		rotate.leftRotate(arr, d, n);
		rotate.printArray(arr, n);
	}
}
