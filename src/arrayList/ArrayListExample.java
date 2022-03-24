package arrayList;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		int n=5;
		ArrayList<Integer> al=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.add(4,5);
		System.out.println(al);
		System.out.println(al.size());
		for(int i=0;i<n;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		al.remove(4);
		System.out.println(al);
	}
}
