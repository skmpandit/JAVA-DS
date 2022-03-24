package arrayList;

import java.util.ArrayList;

public class EnsureCapacity1 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			ArrayList<String> s=new ArrayList<String>();
			s.add("A");
			s.add("B");
			s.add("C");
			s.add("D");
			for(String st:s)
			{
				System.out.println("String : "+st);
			}
			s.ensureCapacity(400);
			System.out.println("The arraylist can now surely store upto 400 elements");
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception thrown : "+e);
		}
	}
}
