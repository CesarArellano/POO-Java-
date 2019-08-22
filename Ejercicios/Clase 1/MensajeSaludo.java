import javax.swing.JOptionPane;
public class MensajeSaludo{
  public void Saludos(){
    JOptionPane.showMessageDialog(null,"Saludos al grupo POO","Titulo Ventana",JOptionPane.INFORMATION_MESSAGE);
  }
  public void Mensaje(){
      System.out.println("Saludos soy un nuevo objeto");
  }
  public void Mensaje2(){
  String saludo = "saludos";
      System.out.println(saludo);
  }
}
