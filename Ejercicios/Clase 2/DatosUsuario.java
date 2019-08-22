import java.util.Scanner;
public class DatosUsuario{
  static Scanner scan = new Scanner(System.in);
public static void main (String[] args){
  System.out.println("Ingresa un valor del entero: ");
  int x = scan.nextInt();
  System.out.println("Valor del entero ingresado " + x);
}
}
