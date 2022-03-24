package vector;

import java.util.Vector;

public class ChangingElement 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		System.out.println(v);
		v.set(0, 20);
		v.set(3, 40);
		for(Integer i:v)
		{
			System.out.println(i);
		}
	}
}
