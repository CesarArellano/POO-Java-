import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelIngDatos extends JPanel
{
	static JLabel Texto,Texto2;
	static JTextField Entrada;
	static JButton LimpiarCampo;

	PanelIngDatos()
	{
		setLayout(null);
       	setBackground(new Color(221, 24, 24));
       	JLabel EtiquetaEncabezado = new JLabel();
       	Icon Encabezado = new ImageIcon(getClass().getResource("encabezado2.png"));
	    EtiquetaEncabezado.setText("");
   		EtiquetaEncabezado.setIcon(Encabezado);
    	EtiquetaEncabezado.setHorizontalTextPosition(SwingConstants.CENTER);
    	EtiquetaEncabezado.setVerticalTextPosition(SwingConstants.CENTER);
	    //(x,y,width,height) -> esquina superior izquierda
		EtiquetaEncabezado.setBounds(85,30,120,30);
	   	
	    Texto = new JLabel("Ingrese ecuación",SwingConstants.CENTER);
	    Texto.setForeground(Color.white);
	    Texto.setBounds(40,80,120,30);
	    Texto2 = new JLabel("Ejemplo: +1x²-5x¹+12",SwingConstants.CENTER);
	    Texto2.setForeground(Color.white);
	    Texto2.setBounds(195,30,180,30);
	    Entrada = new JTextField("",15);
	    Entrada.setBounds(202,80,165,30);

	    LimpiarCampo = new JButton("Borrar Campo");
	    LimpiarCampo.setBounds(385,80,175,30);

	    add(EtiquetaEncabezado);
	    add(Texto2);	    
	    add(Texto);
		add(Entrada);
		add(LimpiarCampo);
	}
}
