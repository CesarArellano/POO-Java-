public class Solver
{
  double Area;
  public double Funcion(double x)
  {
    return (Math.pow(x,4))+2;
  }
  public void Aproximacion(double a, double b, double Xi)
  {
    for(double i = a; i<=b; i+=Xi)
      Area += Xi*Funcion(i);
  }
  public double getArea()
  {
    return Area;
  }
}
