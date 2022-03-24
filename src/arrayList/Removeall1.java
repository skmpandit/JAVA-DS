package arrayList;

import java.util.ArrayList;

public class Removeall1 {
	public static void main(String[] args) {
		try
		{
			ArrayList<Integer> i=new ArrayList<>();
			i.add(1);
			i.add(2);
			i.add(3);
			i.add(4);
			i.add(5);
			System.out.println(i+" ");
			ArrayList<Integer> i1=null;
			System.out.println();
			System.out.println(i1);
			i.removeAll(i1);
			System.out.println(i1);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception thrown "+e);
		}
	}
}
