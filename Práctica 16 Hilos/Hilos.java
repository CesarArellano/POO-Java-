public class Hilos 
{
	public static void main(String[] args)
	{
		LaunchEvent Verde = new LaunchEvent (20,"Semáforo Verde");
		LaunchEvent Amarillo = new LaunchEvent (5,"Semáforo Amarillo");
		LaunchEvent Rojo = new LaunchEvent (5,"Semáforo Rojo");

		Verde.run();
		Amarillo.run();
		Rojo.run();		
	}
}