package arrayList;

import java.util.ArrayList;
import java.util.List;

public class SubListMethod1 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			ArrayList<String> arrlist=new ArrayList<>();
			arrlist.add("A");
			arrlist.add("B");
			arrlist.add("C");
			arrlist.add("D");
			arrlist.add("E");
			System.out.println("The array list : "+arrlist);
			List<String> list=arrlist.subList(2,7);
			System.out.println("\nEnd index value not out of range :-\nThe sub array is "+list);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Exception throws "+e);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception throws "+e);
		}
	}
}
