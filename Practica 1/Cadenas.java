public class Cadenas{
  public void Tamanio(String Palabra){
    int Size = Palabra.length();
    System.out.println("Tamaño de la palabra: " + Size);
  }
  public void Ultimo(String Palabra){
    int Size = Palabra.length();
    char car=Palabra.charAt(Size-1);
    System.out.println("Último caracter de la palabra: " + car);
  }
  public void ContieneA(String Palabra){
    boolean Contain = Palabra.contains("a");
    System.out.println("La palabra impresa contiene a ? " + Contain);
  }
}
