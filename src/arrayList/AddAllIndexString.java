package arrayList;

import java.util.ArrayList;

public class AddAllIndexString 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Rajan");
		s.add("Gopal");
		System.out.println("First string list :- ");
		for(String string:s)
		{
			System.out.println("String : "+string);
		}
		ArrayList<String> a=new ArrayList<>();
		a.add("Ramu");
		a.add("Lakshuman");
		a.add("Ram");
		a.add("Rana");
		System.out.println("Second string list :- ");
		for(String string:a)
		{
			System.out.println("String : "+string);
		}
		a.addAll(1,s);
		System.out.println("Addition of string list :- ");
		for(String string:a)
		{
			System.out.println("String : "+string);
		}
	}
}
