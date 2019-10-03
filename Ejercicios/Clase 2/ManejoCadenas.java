public class ManejoCadenas{
  public void manejarCadenas(){
    String palabra = "uno";
    String palabrados = "dos";
    String palabratres = "tres";
    System.out.println(palabra+" "+palabrados+" "+palabratres);
    int numero =13;
    int numerodos = 14;
    System.out.println("El valor de numero es: " + numero);
    System.out.println("El valor de numero es: " + Integer.toString(numero)); // Convertir entero a cadena
    String numerotres = "15";
    int numerotresint = Integer.parseInt(numerotres); // Convertir cadena a entero
    int suma = 15 + numerotresint;
    System.out.println("El valor de la suma es: "+suma);
  }
}
