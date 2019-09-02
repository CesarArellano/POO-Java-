import java.lang.Math;
public class Recta{
  float m,b;
  public void CalcularRecta(float X1,float X2, float Y1, float Y2){
    m = (Y2-Y1)/(X2-X1);
    b = Y1- m*X1;
  }
  public void SaberPendiente(float M1,float B1, float M2, float B2){
    float Aux,Aux2,Px,Py;
    Double Angulo;
    Angulo = Math.atan((M2-M1)/(1+(M2*M1)));
    Angulo = Math.toDegrees(Angulo);
    if(M1==M2)
      System.out.println("Las rectas son paralelas");
    else
    {
      Aux=B2-B1;
      Aux2=M1-M2;
      Px=Aux/Aux2;
      Py=(M1*Px)+B1;
      System.out.println("Se intersectan en x en el punto:"+Px);
      System.out.println("Se intersectan en y en el punto:"+Py);
    }
    System.out.println("El ángulo entre ellas es:"+Angulo);
  }
  public float getPendiente(){
    return m;
  }
  public float getOrdenada(){
    return b;
  }
}
