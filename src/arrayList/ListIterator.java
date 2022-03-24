package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			ArrayList<String> ar=new ArrayList<>();
			ar.add("A");
			ar.add("B");
			ar.add("C");
			ar.add("D");
			for(String string:ar)
			{
				System.out.print(string+" ");
			}
			System.out.println();
			Iterator<String> iterator=ar.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Exceptions is thrown "+e);
		}
	}
}
