import java.util.Scanner;
public class Energia
{
  static Scanner scan = new Scanner(System.in);
  public static void main (String[] args)
  {
    double m,v,h;
    System.out.println("Ingresa la masa (kg)");
    m =  scan.nextDouble();
    Calcular E = new Calcular(m);
    System.out.println("Ingresa la velocidad (m/s)");
    v =  scan.nextDouble();
    System.out.println("Ingresa la altura (m)");
    h =  scan.nextDouble();
    E.CalcularEnergiaC(v);
    E.CalcularEnergiaP(h);
    System.out.println("La energia cinética es: "+E.getEnergiaC());
    System.out.println("La energia cinética es: "+E.getEnergiaP());
  }
}
