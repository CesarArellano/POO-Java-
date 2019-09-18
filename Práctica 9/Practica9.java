import java.util.Scanner;
public class Practica9
{
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
    int Num, Total=0,Aciertos=0;
    String Opcion;
    Dado Numero = new Dado();
    do
    {
      Numero.CalcularNumeroRandom();
      System.out.println("Advina el número del dado");
      System.out.println("Ingrese el número del dado que salió (1-6)");
      Num = scan.nextInt();
      if(Num>=1 && Num<=6)
      {
        Aciertos = Numero.VerificarNum(Num);
        Total++;
      }
      else
        System.out.println("Error se recibió un número fuera del rango.");
      System.out.println("¿Desea adivinar de nuevo?\nSi ó No");
      Opcion = scan.nextLine ();
      Opcion = scan.nextLine ();
    } while(Opcion.equals("Si") || Opcion.equals("si") );
    System.out.println("Usted acertó: "+Aciertos+"\nTotal de intentos: "+Total);
    }
}
