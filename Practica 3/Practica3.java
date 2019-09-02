import java.util.Scanner;
public class Practica3{
  static float X1,X2,Y1,Y2,Pendiente,Ordenada,Pendiente2,Ordenada2;
  static Scanner scan = new Scanner(System.in);
  public static void main (String[] args){
    Recta Ecuacion = new Recta();
    Recta Ecuacion2 = new Recta();
    System.out.println("Recta 1");
    System.out.println("Ingresa X1: ");
    X1 = scan.nextFloat();
    System.out.println("Ingresa X2: ");
    X2 = scan.nextFloat();
    System.out.println("Ingresa Y1: ");
    Y1 = scan.nextFloat();
    System.out.println("Ingresa Y2: ");
    Y2 = scan.nextFloat();
    Ecuacion.CalcularRecta(X1,X2,Y1,Y2);
    System.out.println("Recta 2");
    System.out.println("Ingresa X1: ");
    X1 = scan.nextFloat();
    System.out.println("Ingresa X2: ");
    X2 = scan.nextFloat();
    System.out.println("Ingresa Y1: ");
    Y1 = scan.nextFloat();
    System.out.println("Ingresa Y2: ");
    Y2 = scan.nextFloat();
    Ecuacion2.CalcularRecta(X1,X2,Y1,Y2);
    Pendiente = Ecuacion.getPendiente();
    Ordenada = Ecuacion.getOrdenada();
    Pendiente2 = Ecuacion2.getPendiente();
    Ordenada2 = Ecuacion2.getOrdenada();
    System.out.printf("Ecuacion de la recta 1: y=%fx%+f\n",Pendiente,Ordenada);
    System.out.printf("Ecuacion de la recta 2: y=%fx%+f\n",Pendiente2,Ordenada2);
    Ecuacion.SaberPendiente(Pendiente,Ordenada,Pendiente2,Ordenada2);
  }
}
