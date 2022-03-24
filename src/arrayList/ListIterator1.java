package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator1 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			ArrayList<String> st=new ArrayList<String>();
			st.add("A");
			st.add("B");
			st.add("C");
			st.add("D");
			Iterator<String> it=st.listIterator(2);
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			Iterator<String> its=st.listIterator(7);
			while(its.hasNext())
			{
				System.out.println(its.next());
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown "+e);
		}
	}
}
