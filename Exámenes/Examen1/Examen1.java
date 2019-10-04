import java.util.Scanner;
public class Examen1
{
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
		double Percentil;
		int[] Arreglo = {88, 45, 53, 86, 33, 86, 85, 30, 89, 53, 41, 96, 56, 38, 62, 71, 51, 86, 68, 29, 28, 47, 33, 37, 25, 36, 33, 94, 73, 46, 42, 34, 79, 72, 88, 99, 82, 62, 57, 42, 28, 55, 67, 62, 60, 96, 61, 57, 75, 93, 34, 75, 53, 32, 28, 73, 51, 69, 91, 35};
		int[] NumOrdenados = new int[60];
		Calcular Object1 = new Calcular();
		NumOrdenados = Object1.Ordenar(Arreglo);
		System.out.println("Ingrese el percentil");
		Percentil = scan.nextInt();
		System.out.println("El resultado del percentil: "+Percentil+" es: "+Object1.ObtenerResultado(NumOrdenados,Percentil));		
    }
}
