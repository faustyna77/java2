import java.util.Scanner;

/*Napisz program, który w nieskończoność pyta użytkownika o
liczby całkowite. Pętla nieskończona powinna się zakończyć gdy
użytkownik wprowadzi liczbę mniejszą od zera. Do opuszczenia pętli nieskończonej użyj instrukcji break. */

public class Main {
    public static void main(String[] args) {

        while (true)
        {
            Scanner in= new Scanner(System.in);
            System.out.println("Podaj liczbe całkowita ");
            int x=in.nextInt();
            if(x<0)
            {
                break;
            }
        }



    }
}