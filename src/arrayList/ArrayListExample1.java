package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 
{
	public static void main(String[] args) {
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(12);
		in.add(43);
		in.add(56);
		in.add(3,93);
		System.out.println(in);
		in.remove(3);
		System.out.println(in);
		for(int s:in)
		{
			System.out.print(s+" ");
		}
		Collections.sort(in);
		System.out.println("\n"+in);
		Collections.sort(in,Collections.reverseOrder());
		System.out.println(in);
		Iterator<Integer> it=in.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}
}
