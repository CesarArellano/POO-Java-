import java.util.Scanner;
public class p1{
    static String Palabra;
    static Scanner scan = new Scanner(System.in);
public static void main (String[] args){
  Cadenas Word = new Cadenas();
  System.out.println("Ingresa un valor: ");
  Palabra = scan.nextLine();
  System.out.println("Valor de la palabra ingresada: " + Palabra);
  Word.Tamanio(Palabra);
  Word.Ultimo(Palabra);
  Word.ContieneA(Palabra);
}
}
