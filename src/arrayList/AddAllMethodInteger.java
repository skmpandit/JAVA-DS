package arrayList;

import java.util.ArrayList;

public class AddAllMethodInteger 
{
	public static void main(String[] args) {
		ArrayList<Integer> c=new ArrayList<Integer>();
		c.add(23);
		c.add(54);
		c.add(93);
		c.add(75);
		System.out.println("First arraylist : - ");
		for(Integer i:c)
		{
			System.out.println("Number "+i);
		}
		System.out.println("Second arraylist : -");
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(32);
		a.add(64);
		a.add(93);
		a.add(54);
		a.add(13);
		for(Integer j:a)
		{
			System.out.println("Number "+j);
		}
		System.out.println("Addition of arrayList : - ");
		c.addAll(a);
		for(Integer M:c)
		{
			System.out.println("Number "+M);
		}
		
	}
}
