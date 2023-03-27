import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Produkt1 agd=new Produkt1(2345,"galaxy");
        System.out.println(agd.getCena());
        agd.setCena(-400);
        System.out.println(agd.getCena());*/
        int [] liczby3={1,2,3,4,9};
        System.out.println("Podaj liczby do tablicy ");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<liczby3.length;i++)
        {
            liczby3[i]=in.nextInt();
        }
        Tablica tab=new Tablica(liczby3);
        System.out.println("Średnia tablicy"+tab.srednia());
        System.out.println("Suma tablicy"+tab.suma());
        System.out.println("Największa wartość to"+tab.max());
        System.out.println("najmniejsza wartość to"+tab.min());




    }
}