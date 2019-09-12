public class Calcular
{
    int Array[],NewArray[],Frequency[];
    double Media,Md;
    public Calcular(int Numeros[],int N)
    {
      int i;
      Array = new int [N+1];
      NewArray = new int [N];
      Frequency = new int [N];
      for (i=0; i<N; i++)
        Array[i]=Numeros[i];
      Ordenar();
      Array[N]=0;
    }
    public void Ordenar()
    {
      int Temp;
      for(int i=0; i<Array.length-1; i++)
      {
        for(int j=0; j<Array.length-1; j++)
        {
          if(Array[i] < Array[j])
          {
            Temp = Array[i];
            Array[i] = Array[j];
            Array[j] = Temp;
          }
        }
      }
    }
    public void MediaAritmetica()
    {
	   for (int i=0; i<Array.length-1; i++)
	     Media += Array[i];
	   Media /= Array.length-1;
	   System.out.println("Media aritmética: "+ Media);
    }

    public int ConteoFrecuencias()
    {
      int Acum,k=0;
      for(int i=0; i<Array.length; i++)
      {
        Acum=0;
        for(int j=i; j<Array.length; j++)
        {
          if(Array[i] != Array[j])
          {
            NewArray[k] = Array[i];
            Frequency[k] = Acum;
            k++;
            i=j-1;
            j=Array.length;
          }
          else
            Acum++;
        }
      }
      return k;
    }

    public void MediaFrecuencias(int Cont)
    {
      double Sumatoria=0,Frecuencia=0;
      for(int i =0; i<Cont; i++)
      {
        System.out.println("Numero: "+NewArray[i]+" Frecuencia: "+Frequency[i]);
        Sumatoria += NewArray[i]*Frequency[i];
        Frecuencia += Frequency[i];
      }
      System.out.println("Media con frecuencias: "+(Sumatoria/Frecuencia));
    }
    public void Mediana()
    {
      int Pos,Pre,Tamanio;
      Tamanio = Array.length-1;
      Pos = Tamanio/2;
      if(Tamanio%2==0)
      {
        Pre = Pos-1;
        Md = (double)(Array[Pos]+Array[Pre])/2;
      }
      else
        Md = Array[Pos];
      System.out.println("Mediana: "+Md);
    }
}
