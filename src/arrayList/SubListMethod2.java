package arrayList;

import java.util.ArrayList;
import java.util.List;

public class SubListMethod2 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			ArrayList<String> arrlist=new ArrayList<String>();
			arrlist.add("A");
			arrlist.add("B");
			arrlist.add("C");
			arrlist.add("D");
			arrlist.add("E");
			System.out.println("The Original array: "+arrlist);
			List<String> list=arrlist.subList(7,2);
			System.out.println("Sub of list of array : "+list);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown "+e);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception thrown "+e);
		}
	}
}
