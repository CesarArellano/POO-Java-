public class Solver
{
  double a,Area;
  public double Funcion(double x)
  {
    return (Math.pow(x,4))+2;
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
