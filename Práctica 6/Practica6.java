import java.util.Scanner;
public class Practica6
{
  static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
      double Xi;
      Solver Ecuacion = new Solver();
      System.out.println("Ingrese el incremento de la función");
      Xi = scan.nextDouble();
      Ecuacion.Aproximacion(Xi);
      System.out.println("El área bajo la curva es: "+Ecuacion.getArea()+"u²");
    }

}
