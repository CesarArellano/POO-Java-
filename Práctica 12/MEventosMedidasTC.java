import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MEventosMedidasTC implements ActionListener
{
	public void actionPerformed(ActionEvent Evento)
	{
		if(Evento.getSource() == PanelIngDatos.Imprimir)
		{
			//Remove all
			try
			{
				int Numero1 = Integer.parseInt(PanelIngDatos.NumValores.getText().substring(0,2));
				Frame.Datos = new String[Numero1][2];
				for(int Fila = 0; Fila < Frame.Datos.length; Fila++)
				{
					for(int Columna = 0; Columna < Frame.Datos[0].length; Columna++)
					{
						Frame.Datos[Fila][Columna] = String.valueOf(Fila+1);
					}
				}

			Frame.panelTable.updateUI();
			Frame.panelTable.repaint();
			Frame.Tabla = new JTable(Frame.Datos,Frame.NombreColumnas);

			// Importante para ver el encabezado

			JScrollPane tableContainer = new JScrollPane(Frame.Tabla);
			Frame.panelTable.add(tableContainer);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Introducir sólo números / Campo Vacío","Error de Entrada", JOptionPane.ERROR_MESSAGE);
	    	}
		}
		else if(Evento.getSource() == PanelCalcular.BotonCalcular)
		{
			try
			{
				double Res = 0;
				for(int Fila = 0; Fila < Frame.Datos.length; Fila++)
					Res += Double.parseDouble(String.valueOf(Frame.Tabla.getValueAt(Fila,1)));
				
				Res/=Frame.Datos.length;
				PanelCalcular.Resultado.setText("El valor de la media es: "+Double.toString(Res));

			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Introduzca valores en la tabla","Error de Entrada", JOptionPane.ERROR_MESSAGE);
			}
		}

	}
}