import java.util.Scanner;
public class Practica5
{
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
	double a,b,c,Raiz;
	Solver Ecuacion = new Solver();
	System.out.println("Ingrese el coeficiente de x²");
	a = scan.nextDouble();
	if(a!=0)
	    {
		System.out.println("Ingrese el coeficiente de x");
		b = scan.nextDouble();
		System.out.println("Ingrese el coeficiente número");
		c = scan.nextDouble();
		Raiz = (Math.pow(b,2))-4*a*c;
		if(Raiz>0)
		    {
			Ecuacion.PuntosDeCorteX(a,b,c,Raiz);
			Ecuacion.PuntosVerticeParabola(a,b,c);
			Ecuacion.DeterminarDireccion(a);
		    }
		else
		    System.out.println("La raíz es imaginaria, no se pueden realizar los cálculos correspondientes");
	    }
	else
	    System.out.println("El valor de A debe ser mayor o menor a 0");
    }
}
