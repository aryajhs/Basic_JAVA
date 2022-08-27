import java.util.*;

class setdemo
{
	void func()
	{
		Set st= new HashSet();
		st.add("Coke");
		st.add("Perk");
		st.add(2000);
		st.add(6.5);
		
		if(st.contains("josdkjo"))
		{
		System.out.println("found");
		System.out.println(st);
		}
		else
		{
		
		System.out.println("Not found");
		}		
	}
	public static void main(String args[])
	{
		setdemo obj= new setdemo();
		obj.func();
	}
}