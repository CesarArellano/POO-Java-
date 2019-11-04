public class LaunchEvent implements Runnable
{
	private int start;
	private String message;

	public LaunchEvent(int start, String message)
	{
		this.start = start;
		this.message = message;
	}
	public void run()
	{
		System.out.println("Se está ejecutando: "+ message);
		for (int i = start; i>0; i--)
		{
			System.out.println("Tiempo restante: "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
		
	}
}