import java.util.*;
class listdemo
{
	void func()
	{
		List lst = new ArrayList();
		lst.add("Coke");
		lst.add("Dairy Milk");
		lst.add(500);
		lst.add(7.9);
		lst.add("Dairy Milk");

		System.out.println(lst);
		System.out.println("No of item's:"+lst.size());	
	}
	public static void main(String args[])
	{
		listdemo obj= new listdemo();
		obj.func();
	}
}