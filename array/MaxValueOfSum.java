package array;

				// find maximum value of sum(i*arr[i]) with only rotations on given array allowed
import java.util.Arrays;
public class MaxValueOfSum {
	static int arr[]=new int[] {10,1,2,3,4,5,6,7,8,9};
	static int maxSum()
	{
		int arrSum=0;
		int currSum=0;
		for(int i=0;i<arr.length;i++)
		{
			arrSum=arrSum+arr[i];
			currSum=currSum+(i*arr[i]);
		}
		int maxVal=currSum;
		for(int j=1;j<arr.length;j++)
		{
			currSum=currSum+arrSum-arr.length*arr[arr.length-j];
			if(currSum>maxVal)
			{
				maxVal=currSum;
			}
		}
		return maxVal;
	}
	public static void main(String[] args)
	{
		System.out.println("The max sum is "+maxSum());
	}
}
