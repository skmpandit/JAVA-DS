package vector;

import java.util.Vector;

public class RemoveElement 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		for(Integer in:v)
		{
			System.out.print(in+" ");
		}
		v.remove(0);
		v.remove(3);
		System.out.println();
		for(Integer in:v)
		{
			System.out.print(in+" ");
		}
	}
}
