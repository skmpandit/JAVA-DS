package arrayList;

import java.util.ArrayList;

public class Removeall 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
		ArrayList<Integer> in=new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		for(Integer inte:in)
		{
			System.out.print(inte+" ");
		}
		ArrayList<Integer> in1=new ArrayList<>();
		in1.add(1);
		in1.add(2);
		in1.add(3);
		System.out.println();
		in.removeAll(in1);
		for(Integer i:in)
		{
			System.out.print(i+" ");
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception thrown "+e);
		}
	}
}
