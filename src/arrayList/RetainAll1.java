package arrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class RetainAll1 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Pen");
		hs.add("Pepar");
		hs.add("ink");
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("Pen");
		s.add("Peper");
		s.add("Book");
		s.add("Rubber");
		s.add("Ink");
		for(String st:hs)
		{
			System.out.print( st+" ");
		}
		System.out.println();
		for(String st1:s)
		{
			System.out.print( st1+" ");
		}
		System.out.println();
		s.retainAll(hs);
		for(String st2:hs)
		{
			System.out.print( st2+" ");
		}
		System.out.println();
		for(String st3:s)
		{
			System.out.print( st3+" ");
		}
	}
}
