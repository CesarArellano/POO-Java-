public class Pescadores{
    static int Total;
    public int Repartir(int Pesc, int Peces){
  	Total = Peces/Pesc;
    return Total;
    }
    public int Sobran(int Pesc, int Peces){
    Total = Peces%Pesc;
    return Total;
    }
}
