package arrayList;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorMethod1 
{
	public static void main(String[] args) 
	{
		ArrayList<user> arr=new ArrayList<user>();
		arr.add(new user("Sonu",2));
		arr.add(new user("Rajan",4));
		arr.add(new user("Mohan",6));
		arr.add(new user("Rakesh",3));
		arr.add(new user("Ramu",8));
		Spliterator<user> data=arr.spliterator();
		data.forEachRemaining((n)->print(n));
	}
	public static void print(user u)
	{
		System.out.println("User name "+u.name+" User roll "+u.roll);
	}
}
class user
{
	String name;
	int roll;
	user(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
}
