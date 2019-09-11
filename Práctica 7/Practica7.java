import java.util.Scanner;
public class Practica7
{
  static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
      int Cant;
      int ArregloNum[] = new int [20];
      int NewArray[] = new int [20];
      int Frecuencias[] = new int [20];
      Calcular Media = new Calcular();
      System.out.println("Ingrese la cantidad de números a ingresar");
      Cant = scan.nextInt();
      for(int i =0; i<Cant; i++)
      {
        System.out.println("Numero "+(i+1)+": ");
        ArregloNum[i] = scan.nextInt();
      }
      Media.MediaAritmetica(ArregloNum,Cant);
      Media.MediaFrecuencias(ArregloNum,NewArray,Frecuencias,Cant);
      Media.get_Tabla(NewArray,Frecuencias);
    }

}
