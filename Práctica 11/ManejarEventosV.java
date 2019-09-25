import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ManejarEventosV implements ActionListener
{
  public void actionPerformed(ActionEvent Evento)
  {
    if(Evento.getSource() == PanelCuadradoDatos.Volumen)
    {
      try
      {
        int ResVolumen = Integer.parseInt(PanelCuadradoDatos.Lado.getText().substring(0,1));
        double ResFinalVolumen = Math.pow((double)ResVolumen,3);
        PanelCuadradoRes.Resultado.setText("El volumen es: "+Double.toString(ResFinalVolumen));
      }catch(Exception e)
      {
        JOptionPane.showMessageDialog(null,"Introducir sólo números: " +
        PanelCuadradoDatos.Lado.getText().toString(),"Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
