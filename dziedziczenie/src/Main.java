public class Main {
    public static void main(String[] args)
    {

        Osoba osoba=new Osoba("Jan","janiszewski");
        Pracownik pracownik=new Pracownik("Adam","derbich","firma");
        pracownik.przedstawSie();
        osoba.przedstawSie();

    }
}