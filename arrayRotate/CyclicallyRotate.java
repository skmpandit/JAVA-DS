package arrayRotate;

import java.util.Arrays;

public class CyclicallyRotate 
{
	static int arr[]= {1,2,3,4,5,6,7};
	static void rotate()
	{
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
	}
	public static void main(String[] args) 
	{
		System.out.println("Given array:");
		System.out.println(Arrays.toString(arr));
		rotate();
		System.out.println("The rotate array:");
		System.out.println(Arrays.toString(arr));
	}
}
