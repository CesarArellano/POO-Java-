import java.lang.Runnable;

public class EscritorArreglo implements Runnable
{
	private final ArregloSimple ArregloSimpleCompartido;
	private final int ValorInicial;

	public EscritorArreglo(int valor, ArregloSimple Arreglo)
	{
		ValorInicial = valor;
		ArregloSimpleCompartido = Arreglo;
	}
	public void run()
	{
		for(int i = ValorInicial; i < ValorInicial + 3; i++)
		{
			ArregloSimpleCompartido.Agregar(i);
		}
	}
}