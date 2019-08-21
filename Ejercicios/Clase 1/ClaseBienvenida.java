public class ClaseBienvenida{

  static String Mensaje1;
  public static void main(String args[]){
    MensajeSaludo Objeto1 = new MensajeSaludo();
    MensajeSaludo Objeto2 = new MensajeSaludo();
      Objeto1.Saludos();
      Objeto2.Mensaje();
      Mensaje1 = "Hola César";
      System.out.println(Mensaje1);
  }
}
