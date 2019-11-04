import java.util.Random;

public class ArregloSimple
{
	private final int Arreglo[];
	private int IndiceEscritura = 0;
	private final static Random Generador = new Random();

	public ArregloSimple(int tamanio)
	{
		Arreglo = new int[tamanio];
	}
	public synchronized void Agregar(int valor)
	{
		int Posicion = IndiceEscritura;
		try
		{
			Thread.sleep(Generador.nextInt(500));
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		Arreglo[Posicion] = valor;
		System.out.printf("%s escribió %2d en el elemento %d.\n",Thread.currentThread().getName(),valor,Posicion);
		++IndiceEscritura;
		System.out.printf("Siguiente indice de escritura: %d\n",IndiceEscritura);
	}
	public String toString()
	{
		String CadenaArreglo = "\nContenido de ArregloSimple:\n";
		for(int i = 0; i < Arreglo.length; i++)
			CadenaArreglo += Arreglo[i] + " ";
		return CadenaArreglo;
	}
}