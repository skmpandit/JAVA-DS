package arrayRotate;
import java.util.Scanner;
public class ArrayRotateOBO1 
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
		arr[i]=temp;
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
		int n,d,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the rotation elements:");
		d=sc.nextInt();
		sc.close();
		ArrayRotateOBO1 rotate=new ArrayRotateOBO1();
		rotate.leftRotate(arr, d, n);
		rotate.printArray(arr, n);
	}
}
