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
	static JLabel Texto;
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
		EtiquetaEncabezado.setBounds(280,22,120,30);
	   
	    Texto = new JLabel("Ingrese ecuación",SwingConstants.CENTER);
	    Texto.setForeground(Color.white);
	    Texto.setBounds(55,60,120,30);

	    Entrada = new JTextField("",15);
	    Entrada.setBounds(212,60,160,30);

	    LimpiarCampo = new JButton("Borrar Campo");
	    LimpiarCampo.setBounds(390,60,160,30);

	    add(new JLabel(""));
	    add(EtiquetaEncabezado);
	    add(new JLabel(""));
	    add(Texto);
		add(Entrada);
		add(LimpiarCampo);
	}
}
