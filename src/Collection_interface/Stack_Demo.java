package Collection_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
