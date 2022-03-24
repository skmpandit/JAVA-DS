package arrayList;

import java.util.ArrayList;

public class AddAllMethodString 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Ramu");
		s.add("Ranjeet");
		s.add("Anup");
		System.out.println("First ArrayList : - ");
		for(String a:s)
		{
			System.out.println("String "+a);
		}
		ArrayList<String> k=new ArrayList<>();
		k.add("Mohan");
		k.add("Deepak");
		k.add("Ankeet");
		k.add("Rakesh");
		k.add("Manjesh");
		System.out.println("Second ArrayList : -");
		for(String b:k)
		{
			System.out.println("String "+b);
		}
		System.out.println("Addtion of String List :- ");
		s.addAll(k);
		for(String t:s)
		{
			System.out.println("String "+t);
		}
	}
}
