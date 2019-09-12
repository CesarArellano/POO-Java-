import java.util.Scanner;
public class Practica7
{
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
	int Cant;
	int ArregloNum[] = new int [20];
	System.out.println("Ingrese la cantidad de números a ingresar");
	Cant = scan.nextInt();
	for(int i =0; i<Cant; i++)
	    {
			System.out.println("Numero "+(i+1)+": ");
			ArregloNum[i]= scan.nextInt();
	    }
	Calcular Media = new Calcular(ArregloNum,Cant);
	Media.MediaAritmetica();	
	Cant = Media.ConteoFrecuencias();
	Media.MediaFrecuencias(Cant);
    }
}
