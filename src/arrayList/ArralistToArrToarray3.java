package arrayList;

import java.util.ArrayList;

public class ArralistToArrToarray3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		Integer[] arr=new Integer[in.size()];
		for(int i=0;i<in.size();i++)
		{
			 arr[i]=in.get(i);
		}
		for(Integer t:arr)
		{
			System.out.println(t);
		}
	}
}
