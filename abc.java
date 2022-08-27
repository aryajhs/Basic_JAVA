class abc
{	
	void func()
	{
		System.out.println("fn working");
	}
}
class rndemo extends abc implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(j);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
	public static void main(String args[])
	{
		rndemo obj = new rndemo();
		Thread th = new Thread(obj);
		th.start();
	}
	
}