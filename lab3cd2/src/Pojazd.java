public class Pojazd {
   private double przebieg;
    private String marka;
   private int cena;

    public Pojazd()
    {

    }
    public double getPrzebieg()
    {
        return przebieg;
    }

    public String getMarka()
    {
        return marka;
    }

    public int getCena()
    {
        return cena;
    }


    public void setCena(int cena)
    {
        if(cena!=0)
        {
            this.cena=cena;
        }
           else {
               System.out.println("0");
        }
    }


}
