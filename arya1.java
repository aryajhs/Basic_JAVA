/* package codechef; // don't place package name! */
import java.util.Scanner;
class arya1
{
	public static  int ATM(int n, int m) 
	{
	    double TB;
	    if(m>=n)
	    {
	    if(n%5==0)
	    {
	        TB=(double)(m-n)-0.50;
	        System.out.println(TB);
	    }
	    else
	    {
	        System.out.println(m);
	    }
	    }
	    else
	    {
	        System.out.println(m);
	    }
return 0;
		
	}
                                 
		public static void main(String args[])
		{
		    int a,b;
		    Scanner sc= new Scanner(System.in);
		    a=sc.nextInt();
		    b=sc.nextInt();
		    arya1 obj= new arya1();
		    obj.ATM(a,b);
		    
		}
	
}
