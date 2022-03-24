package arrayList;

import java.util.ArrayList;
import java.util.List;

public class SubListMethod 
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
			 List<String> list=arrlist.subList(2,4);
			 System.out.println("ArrayList : "+arrlist);
			 System.out.println("Sub List : "+list);
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
