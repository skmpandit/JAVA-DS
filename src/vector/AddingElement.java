package vector;

import java.util.Vector;

public class AddingElement 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(12);
		v1.add(2);
		v1.add("Sonu Kumar Mahto");
		v1.add("3");
		System.out.println(v1);
		Vector<Integer> v2=new Vector<Integer>();
		v2.add(10);
		v2.add(20);
		v2.add(30);
		v2.add(40);
		System.out.println(v2);
	}
}
