package arrayList;

import java.util.ArrayList;

public class ForEachMethodString 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Mohan");
		s.add("Ankit");
		s.add("Rajan");
		s.forEach((n)->System.out.print(" "+n));
	}
}
