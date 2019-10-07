import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManejadorEventos implements ActionListener
{
	static int[] Coeficientes;
	static int[] Exponentes;
	static int Longitud,Error=0;
	static double Evaluacion;
	public void actionPerformed(ActionEvent Evento)
	{
		if(PanelButton.CalcularIntegral.isSelected())
		{
			try
			{
				double a,b,Xi,Area=0;

				Error = ExtraerFuncion();
				if(Error == 1)
				{
					a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Límite Inferior"));
					b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Límite Superior"));
					Xi = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el incremento de la función"));
					for(; a <= b; a += Xi)
					{
						EvaluarEnFuncion(a);
						Area += Xi * Evaluacion;				
					}
					JOptionPane.showMessageDialog(null,"Área bajo la curva: "+Area,"Resultado",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Ingrese exponentes no mayores de 2","Error de Entrada",JOptionPane.ERROR_MESSAGE);
				}

			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error en algún parámetro","Error de Entrada",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(PanelButton.EvaluarEnPunto.isSelected())
		{
			try
			{
				Frame.panelTable.removeAll();
				int Punto;
				Error = ExtraerFuncion();
				if(Error == 1)
				{
					Punto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el punto a evaluar la ecuación"));
					Frame.Datos = new String[1][2];
					EvaluarEnFuncion(Punto);
					Frame.Datos[0][0] = String.valueOf(Punto);
					Frame.Datos[0][1] = String.valueOf(Evaluacion);

					Frame.panelTable.updateUI();
					Frame.panelTable.repaint();
					Frame.panelTable.setBackground(Color.orange);
					Frame.Tabla = new JTable(Frame.Datos,Frame.NombreColumnas);

					// Importante para ver el encabezado

					JScrollPane tableContainer = new JScrollPane(Frame.Tabla);
					tableContainer.getViewport().setBackground(new Color(20, 102, 175));
					Frame.panelTable.add(tableContainer);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Ingrese exponentes no mayores de 2","Error de Entrada",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error en algún parámetro","Error de Entrada",JOptionPane.ERROR_MESSAGE);
			}
		}
    else if(PanelButton.EvaluarEnIntervalo.isSelected())
		{
			try
			{
				Frame.panelTable.removeAll();
				int PuntoA, PuntoB, Conteo=0;
				Error = ExtraerFuncion();
				if(Error == 1)
				{
					PuntoA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Primer Punto"));
					PuntoB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Último Punto"));
					for(int i = PuntoA; i <= PuntoB; i++)
					{
						Conteo++;
					}
					Frame.Datos = new String[Conteo][2];
					Conteo = 0; 
					for(; PuntoA <= PuntoB; PuntoA++)
					{
						Frame.Datos[Conteo][0] = String.valueOf(PuntoA);
						EvaluarEnFuncion(PuntoA);
						Frame.Datos[Conteo][1] = String.valueOf(Evaluacion);						
						Conteo++;
					}					
					
					Frame.panelTable.updateUI();
					Frame.panelTable.repaint();
					Frame.Tabla = new JTable(Frame.Datos,Frame.NombreColumnas);

					// Importante para ver el encabezado

					JScrollPane tableContainer = new JScrollPane(Frame.Tabla);
					tableContainer.getViewport().setBackground(new Color(20, 102, 175));
					Frame.panelTable.add(tableContainer);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Ingrese exponentes no mayores de 2","Error de Entrada",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error en algún parámetro","Error de Entrada",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(Evento.getSource() == PanelIngDatos.LimpiarCampo)
		{
			PanelIngDatos.Entrada.setText("");
		}
	}
  public int ExtraerFuncion()
  {
  	int TempLong,Flag=1;
	String Temp;
	String Ecuacion = PanelIngDatos.Entrada.getText().toString();	    
	String[] ArrayEcuacion = Ecuacion.split("(?=[-+])");
	Longitud = ArrayEcuacion.length;
	if(Longitud > 0 && Longitud <= 3)
	{
	  	Coeficientes = new int[Longitud];
	   	Exponentes = new int[Longitud-1];
		for (int i = 0; i < Longitud; i++)
		{
			Temp = ArrayEcuacion[i];
			TempLong = Temp.length()-2;
			if((Temp.charAt(TempLong)) == 'x')
			{
				Coeficientes[i] = Integer.parseInt(Temp.substring(0,TempLong));
				if((Temp.charAt(TempLong+1)) == '²')
					Exponentes[i] = 2;
				if((Temp.charAt(TempLong+1)) == '¹')
					Exponentes[i] = 1;
				if(Exponentes[i] == 2 || Exponentes[i] == 1)	
				{
					System.out.println("Exponente: "+Exponentes[i]);
				}
				else
					return 0;
			}
			else
				Coeficientes[i] = Integer.parseInt(Temp);
			System.out.println("Coeficiente: "+Coeficientes[i]);
		}

	}
	else
	{
		JOptionPane.showMessageDialog(null,"Solo se reciben ecuaciones de hasta segundo grado\nIntente de nuevo...","Error de Entrada",JOptionPane.ERROR_MESSAGE);
	}
	return Flag;
  }
  public void EvaluarEnFuncion(double x)
  {
  	Evaluacion = 0;
  	for(int i=0; i<Longitud;i++)
	{
		if(i == Longitud-1)
		{
			Evaluacion += Coeficientes[i];
		}
		else
		{
			Evaluacion += Coeficientes[i]*(Math.pow(x,Exponentes[i]));
		}
	}
  }
}
