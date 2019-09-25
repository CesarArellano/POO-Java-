import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame
{
  public Frame()
  {
    super("Cálculo de Áreas y Volúmenes");
    setSize(700,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);
    setLayout(new GridLayout(1,3));
    PanelCuadradoImg ImgCuadrado = new PanelCuadradoImg();
    PanelCuadradoDatos DatosCuadrado = new PanelCuadradoDatos();
    PanelCuadradoRes ResCuadrado = new PanelCuadradoRes();
    this.add(ImgCuadrado);
    this.add(DatosCuadrado);
    this.add(ResCuadrado);
    System.out.println("Cesar");
    ManejarEventos Eventos = new ManejarEventos();
    PanelCuadradoDatos.Area.addActionListener(Eventos);
    PanelCuadradoDatos.Volumen.addActionListener(Eventos);
    /*PanelTrianguloImg ImgTriangulo = new PanelTriangulo();
    PanelTrianguloDatos DatosTriangulo = new PanelTriangulo();
    PanelTrianguloRes ResTriangulo = new PanelTriangulo();
    PanelRectanguloImg ImgRectangulo = new PanelRectangulo();
    PanelRectanguloDatos DatosRectangulo = new PanelRectangulo();
    PanelRectanguloRes ResRectangulo = new PanelRectangulo();
    this.add(ImgTriangulo);
    this.add(DatosTriangulo);
    this.add(ResTriangulo);
    this.add(ImgRectangulo);
    this.add(DatosRectangulo);
    this.add(ResRectangulo);*/
  }
}
