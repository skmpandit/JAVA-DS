package arrayList;

import java.util.ArrayList;

public class ArrlistToArrToarray2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		//Integer[] objects=in.toArray();  Objects[] can no be converted to integer[]
		Integer[] arr=new Integer[in.size()];
		arr=in.toArray(arr);
		for(Integer i:arr)
		{
			System.out.println(i);
		}
	}
}
