package arrayList;

import java.util.ArrayList;

public class RetainAll 
{
	public static void main(String[] args) 
	{
		ArrayList<String> in=new ArrayList<String>();
		in.add("Pen");
		in.add("Pencil");
		in.add("Pepar");
		ArrayList<String> inr=new ArrayList<String>();
		inr.add("Pen");
		inr.add("Copi");
		inr.add("Pepar");
		inr.add("Book");
		inr.add("Rubber");
		for(String s:in)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		for(String s:inr)
		{
			System.out.print(s+" ");
		}
		inr.retainAll(in);
		System.out.println();
		for(String s:in)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		for(String s:inr)
		{
			System.out.print(s+" ");
		}
	}
}
