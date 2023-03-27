public class Produkt1 {


    private int  cena;
    private String nazwa;

    public Produkt1 (int cena,String nazwa)
    {
        this.cena=cena;
        this.nazwa=nazwa;

    }
    public int getCena()
    {
        return cena;
    }

    public void setCena(int cena)
    {
        if(cena >0)
        {
            this.cena=cena;
        }
        else {
            this.cena=0;
        }

    }

    public String getNazwa()
    {
        return nazwa;
    }

    public void setNazwa(String nazwa)
    {
        if(nazwa!=null)
        {
            this.nazwa=nazwa;
        }else {
            this.nazwa="none";
        }
    }





}
