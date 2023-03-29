public class Pracownik extends Osoba{


     public  String nazwaFirmy;
   public  String stanowisko;


     Pracownik(String imie,String nazwisko,String nazwaFirmy)
    {
        super(imie,nazwisko);
        this.imie=imie;
        this.nazwisko=nazwisko;

    }
    @Override
    public void przedstawSie()
    {
        System.out.println("Jestem"+" "+imie+"pracuje w firmie "+" "+this.nazwaFirmy);
    }


}
