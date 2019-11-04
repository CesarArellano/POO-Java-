public class CountDownClock extends Thread
{
	public void run()
	{
		for (int t = 30; t>=0; t--)
		{
			System.out.println("t menos "+t);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Error");
			}
		}
	}
}