public class Calcular
{
  double Resultado;
  public int[] Ordenar(int Array[])
  {
    int Temp;
    for(int i=0; i<Array.length; i++)
    {
      for(int j=0; j<Array.length; j++)
      {
        if(Array[i] < Array[j])
        {
          Temp = Array[i];
          Array[i] = Array[j];
          Array[j] = Temp;
        }
      }
    }
    return Array;
  }
  public double ObtenerResultado(int NumOrdenados[], double Percentil)
  {
    double Posicion;
    Posicion = (double) ((60*Percentil)/100);
    System.out.println(Posicion);
    if(Posicion%1==0)
    {
      Resultado = NumOrdenados[(int)Posicion-1] + NumOrdenados[(int)Posicion];
      Resultado /= 2;
    }
    else
    {
      Resultado = NumOrdenados[(int)Posicion];
    }
    return Resultado;

  }  
}