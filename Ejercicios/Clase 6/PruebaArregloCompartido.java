import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class PruebaArregloCompartido
{
	public static void main(String[] arg)
	{
		ArregloSimple ArregloSimpleCompartidoM = new ArregloSimple(6);
		EscritorArreglo Escritor1 = new EscritorArreglo(1,ArregloSimpleCompartidoM);
		EscritorArreglo Escritor2 = new EscritorArreglo(11,ArregloSimpleCompartidoM);

		ExecutorService Ejecutor = Executors.newCachedThreadPool();
		Ejecutor.execute(Escritor1);
		Ejecutor.execute(Escritor2);

		Ejecutor.shutdown();

		try
		{
			Boolean TareasTerminaron = Ejecutor.awaitTermination(1,TimeUnit.MINUTES);
			if(TareasTerminaron)
				System.out.println(ArregloSimpleCompartidoM);
			else
				System.out.println("Se agotó el tiempo esperando a que las tareas terminarán");

		}
		catch(InterruptedException ex)
		{
			System.out.println("Hubo una interrupción mientras esperaba a que terminarán las tareas");
		}
	}
}