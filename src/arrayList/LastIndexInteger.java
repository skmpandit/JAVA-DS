package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LastIndexInteger 
{
	public static void main(String[] args) {
		ArrayList<Integer> in=new ArrayList<>();
		in.add(10);
		in.add(40);
		in.add(50);
		in.add(70);
		in.add(20);
		in.add(10);
		in.add(60);
		in.add(10);
		in.add(80);
		Iterator<Integer> i=in.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		int li=in.lastIndexOf(10);
		System.out.println("\nThe last index of 10 is "+li);
		Collections.sort(in);
		for(Integer number:in)
		{
			System.out.print(number+" ");
		}
		System.out.println();
		Collections.sort(in,Collections.reverseOrder());
		for(int number:in)
		{
			System.out.print(number+" ");
		}
	}
}
