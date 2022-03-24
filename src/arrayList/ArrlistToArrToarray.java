package arrayList;

import java.util.ArrayList;

public class ArrlistToArrToarray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");
		arrlist.add("D");
		arrlist.add("E");
		Object[] object=arrlist.toArray();
		for(Object O:object)
		{
			System.out.println(O);
		}
	}
}
