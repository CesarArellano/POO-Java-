import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ManejarEventos implements ActionListener
{
  public void actionPerformed(ActionEvent Evento)
  {
    if(Evento.getSource() == PanelCuadradoDatos.Area)
    {
      try
      {
        int ResArea = Integer.parseInt(PanelCuadradoDatos.Lado.getText().substring(0,1));
        double ResFinalArea = Math.pow((double)ResArea,2);
        PanelCuadradoRes.Resultado.setText("El area es: "+Double.toString(ResFinalArea));
      }catch(Exception e)
      {
        JOptionPane.showMessageDialog(null,"Introducir sólo números: " +
        PanelCuadradoDatos.Lado.getText().toString(),"Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
    else if(Evento.getSource() == PanelCuadradoDatos.Volumen)
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
