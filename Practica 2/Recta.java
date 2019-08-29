public class Recta{
  static float m,b;
  public void CalcularRecta(float X1,float X2, float Y1, float Y2){
    m = (Y2-Y1)/(X2-X1);
    b = Y1- m*X1;
  }
  public float getPendiente(){
    return m;
  }
  public float getOrdenada(){
    return b;
  }
}
