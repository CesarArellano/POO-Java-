public class Dado
{
  int NumeroGenerado,Atinar=0;
  public void CalcularNumeroRandom()
  {
    NumeroGenerado = (int) (Math.random()*6)+1;
  }

  public int VerificarNum(int Num)
  {
    if(Num==NumeroGenerado)
    {
      Atinar++;
      System.out.println("Acertó");      
    }

    return Atinar;
  }
}
