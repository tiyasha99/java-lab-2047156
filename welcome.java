package hello;
public class welcome extends Thread
{
	public void run()
	{	
		try
		{
			System.out.println("Thread " + Thread.currentThread().getId() + "is running");
			//System.out.println("Welcome to Indigo Airlines");
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
	}
}