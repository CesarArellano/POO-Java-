import javax.swing.JOptionPane;
public class p2{
    public static void main (String[] args){
       Pescadores Pescador = new Pescadores();
       String DatoEntrada;
       int Pesc,Peces,Total,Faltan;
       DatoEntrada = JOptionPane.showInputDialog("Ingrese número de pescadores");
       Pesc = Integer.parseInt(DatoEntrada);
       DatoEntrada = JOptionPane.showInputDialog("Ingrese el número de peces capturados");
       Peces = Integer.parseInt(DatoEntrada);
       Total = Pescador.Repartir(Pesc,Peces);
       Faltan = Pescador.Sobran(Pesc,Peces);
       JOptionPane.showMessageDialog(null,"A cada pescador le tocan: "+Total+" Peces\n"+"Sobran:"+Faltan,"",JOptionPane.INFORMATION_MESSAGE);
      }
}
