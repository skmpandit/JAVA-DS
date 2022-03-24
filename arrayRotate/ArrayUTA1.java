package arrayRotate;
import java.util.Scanner;
public class ArrayUTA1 
{
	void leftRotate(int arr[],int d,int n)
	{
		int temp[]=new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++)
		{
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++)
		{
			arr[i+n-d]=temp[i];
		}
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
		int arr[],d,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the roatation elements:");
		d=sc.nextInt();
		sc.close();
		ArrayUTA1 rotate=new ArrayUTA1();
		rotate.leftRotate(arr,d,n);
		rotate.printArray(arr, n);
	}
}
