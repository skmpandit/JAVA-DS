package arrayList;

import java.util.ArrayList;

public class ArrlistToArrToarray1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		Object[] objects=in.toArray();
		for(Object o:objects)
		{
			System.out.println(o);
		}
	}
}
