public class Solver
{
    public void PuntosDeCorteX(double a, double b, double c, double Raiz)
    {
	double X1,X2;
	X1 = (-b + Math.sqrt(Raiz))/(2*a);
	X2 = (-b - Math.sqrt(Raiz))/(2*a);
	System.out.println("Los puntos de corte en x:\nX1: "+X1+"\nX2: "+X2);
    }
    public void PuntosVerticeParabola(double a, double b, double c)
    {
	double PCX,PCY;
	PCX = -b / (2*a);
	PCY = a*(Math.pow(PCX,2))+b*PCX+c;
	System.out.println("Los puntos vértice de la parábola son:\nX: "+PCX+"\nY: "+PCY);
    }
    public void DeterminarDireccion(double a)
    {
	if (a>0)
	    System.out.println("La parábola es cóncava");
	else
	    System.out.println("La parábola es convexa");
    }
}
