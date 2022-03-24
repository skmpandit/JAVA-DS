package arrayList;

import java.util.ArrayList;

public class EnsureCapacity 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			ArrayList<Integer> i=new ArrayList<>();
			i.add(20);
			i.add(10);
			i.add(40);
			i.add(60);
			System.out.println("ArrayList : "+i);
			for(Integer number:i)
			{
				System.out.println("Number : "+number);
			}
			i.ensureCapacity(2);
			System.out.println("ArrayList can now surely store upto 500 elements");
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception thrown : "+e);
		}
	}
}
