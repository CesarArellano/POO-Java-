public class Calcular
{
  double Media;
  public void MediaAritmetica(int Numero[], int N)
  {
    for (int i=0; i<N; i++)
      Media += Numero[i];
    Media /= N;
    System.out.println("Media aritmética: "+ Media);
  }
  public void MediaFrecuencias(int Numero[],int NewArray[], int Frecuencias[], int N)
  {
    int Acum;
    for(int i =0; i < N; i++)
    {
      Acum = 1;
      for(int j =0; j < N; j++)
      {
        if(Numero[i]==Numero[j] && Acum!=0)
        {
          Acum += Numero[i];
          NewArray[i] = Numero[i];
          Numero[j]=0;
        }

      }

    }
  }
  public void get_Tabla(int NewArray[], int Frecuencias[])
  {
    for (int i=0; i<N; i++)
      System.out.println(NewArray[i]+" "+(Frecuencias[i]));
  }
}
