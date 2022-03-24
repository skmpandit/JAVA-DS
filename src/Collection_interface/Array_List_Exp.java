package Collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class Array_List_Exp 
{
	public static void main(String[] args)
	{
		Vector<String> a=new Vector<String>();
		a.add("Hii");
		a.add("Hello");
		a.add("Bye");
		a.add("Bye");
		//System.out.println(a);
		//a.add(3,"Sonu");
		//System.out.println(a);
		//a.remove("Hii");
		//System.out.println(a);
		//a.remove(0);
		//System.out.println(a);
		//System.out.println(a.size());
		//for(String str:a) 
		//{
	//		System.out.println(str);
	//	}
		//Collections.sort(a);
		//System.out.println(a);
		//Collections.sort(a,Collections.reverseOrder());
	Iterator<String> itr=a.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
