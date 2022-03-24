package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample2 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("Sonu");
		s.add("Rajan");
		s.add("Tuhin");
		s.add("Ramu");
		s.add("Amol");
		System.out.println(s);
		s.add(4,"Ranjeet");
		System.out.println(s);
		s.remove(0);
		System.out.println(s);
		System.out.println(s.size());
		s.add(0,"Sonu");
		System.out.println(s);
		for(String a:s)
		{
			System.out.println(a);
		}
		Collections.sort(s);
		System.out.println(s);
		Collections.sort(s,Collections.reverseOrder());
		System.out.println(s);
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}
}
