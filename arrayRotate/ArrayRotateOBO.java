package arrayRotate;

public class ArrayRotateOBO 
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
		ArrayRotateOBO rotate=new ArrayRotateOBO();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		rotate.leftRotate(arr, 5, arr.length);
		rotate.printArray(arr, arr.length);
	}
}
