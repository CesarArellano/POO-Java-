import java.util.Scanner;
public class Practica2{
  static float X1,X2,Y1,Y2,Pendiente,Ordenada;
  static Scanner scan = new Scanner(System.in);
  public static void main (String[] args){
    Recta Ecuacion = new Recta();
    System.out.println("Ingresa X1: ");
    X1 = scan.nextFloat();
    System.out.println("Ingresa X2: ");
    X2 = scan.nextFloat();
    System.out.println("Ingresa Y1: ");
    Y1 = scan.nextFloat();
    System.out.println("Ingresa Y2: ");
    Y2 = scan.nextFloat();
    Ecuacion.CalcularRecta(X1,X2,Y1,Y2);
    Pendiente = Ecuacion.getPendiente();
    Ordenada = Ecuacion.getOrdenada();
    System.out.println("Ecuacion de la recta: y="+Pendiente+"x +"+Ordenada);
    System.out.println("Su pendiente es: "+Pendiente);
    System.out.println("Corta al eje 'y' en: "+Ordenada);
  }
}
