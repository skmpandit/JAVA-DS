package arrayList;

import java.util.ArrayList;

public class ArrlistToArrToarray4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arralist=new ArrayList<Integer>();
		arralist.add(10);
		arralist.add(20);
		arralist.add(30);
		arralist.add(40);
		int[] arr=arralist.stream().mapToInt(i->i).toArray();
		for(Integer ar:arr)
		{
			System.out.println(ar);
		}
	}
}
