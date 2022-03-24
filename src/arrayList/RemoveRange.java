package arrayList;

import java.util.ArrayList;

 
public class RemoveRange extends ArrayList<Integer>
{
	public static void main(String[] args) 
	{
		RemoveRange in=new RemoveRange();
		in.add(12);
		in.add(45);
		in.add(74);
		in.add(73);
		in.add(23);
		in.add(02);
		for(Integer a:in)
		{
			System.out.println(a);
		}
		in.removeRange(0,2);
		for(Integer a:in)
		{
			System.out.println(a);
		}
	}
}
