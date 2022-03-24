package arrayList;

import java.util.ArrayList;

public class TrimToSize 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr=new ArrayList<Integer>(9);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		//arr.trimToSize();
		for(Integer in:arr)
		{
			System.out.println(in);
		}
		
	}
}
