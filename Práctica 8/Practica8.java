import java.util.Scanner;
public class Practica8
{
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
		int Cant;
		int ArregloNum[] = new int [57];
		System.out.println("Ingrese la cantidad de números a ingresar");
		Cant = scan.nextInt();
		for(int i =0; i<Cant; i++)
		{
			System.out.println("Numero "+(i+1)+": ");
			ArregloNum[i]= scan.nextInt();
		}
		Calcular Object1 = new Calcular(ArregloNum,Cant);
		Object1.MediaAritmetica();
		Cant = Object1.ConteoFrecuencias();
		Object1.MediaFrecuencias(Cant);
	 	Object1.Mediana();
	 	Object1.Moda();
	 	Object1.Desviacion(Cant);
    }
}
