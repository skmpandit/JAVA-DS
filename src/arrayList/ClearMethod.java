package arrayList;

import java.util.ArrayList;

public class ClearMethod 
{
	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<>();
		s.add(10);
		s.add(20);
		s.add(30);
		System.out.println(s);
		s.clear();
		System.out.println(s);
	}
}
