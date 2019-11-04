import java.lang.Runnable;

public class EscritorArreglo implements Runnable
{
	private final ArregloSimple ArregloSimpleCompartido;
	private final int Limite;
	private int ValorInicial;

	public EscritorArreglo(int Valor, int Lim, ArregloSimple Arreglo)
	{
		ValorInicial = Valor;
		ArregloSimpleCompartido = Arreglo;
		Limite = Lim;
	}
	public void run()
	{
		for(int i = 0; i < Limite; i++)
		{
			ArregloSimpleCompartido.Agregar(ValorInicial);
			ValorInicial++;
		}
	}
}