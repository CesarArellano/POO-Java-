public class Calcular
{
  double Masa,EnergiaC,EnergiaP;
  static final double GRAVEDAD = 9.81;
  public Calcular(double m)
  {
    Masa = m;
  }
  public void CalcularEnergiaC(double v)
  {
    EnergiaC = (0.5*Masa)*(v*v);
  }
  public void CalcularEnergiaP(double h)
  {
    EnergiaP = Masa*GRAVEDAD*h;
  }
  public double getEnergiaC()
  {
    return EnergiaC;
  }
  public double getEnergiaP()
  {
    return EnergiaP;
  }
}
