import java.util.Scanner;
public class Practica6
{
  static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
      double Li,Ls,Xi;
      Solver Ecuacion = new Solver();
      System.out.println("Ingrese el incremento de la función");
      Xi = scan.nextDouble();
      System.out.println("Ingrese el límite inferior de la función");
      Li = scan.nextDouble();
      System.out.println("Ingrese el límite superior de la función");
      Ls = scan.nextDouble();
      Ecuacion.Aproximacion(Li,Ls,Xi);
      System.out.println("El área bajo la curva es: "+Ecuacion.getArea()+"u²");
    }

}
