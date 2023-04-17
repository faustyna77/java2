public class Main {
    public static void main(String[] args)
    {

        Figura figura=new Figura(9);
        figura.pole(9);
        System.out.println(figura.pole(9));
        Kwadrat kwadrat=new Kwadrat(5,5);
       System.out.println(kwadrat.pole(5));
       Kolo kolo=new Kolo(7);
       System.out.println(kolo.pole(7));




    }
}