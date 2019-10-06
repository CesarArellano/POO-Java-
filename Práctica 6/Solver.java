public class Solver
{
  double a,Area;
  public double Funcion(double x)
  {
    return 3*(Math.pow(x,2))+4*(Math.pow(x,1))+3;
  }
  public void Aproximacion(double Xi)
  {
    for(a=-1; a<=2; a+=Xi)
      Area += Xi*Funcion(a);
  }
  public double getArea()
  {
    return Area;
  }
}
