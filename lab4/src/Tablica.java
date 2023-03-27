public class Tablica {


   public int [] liczby;
   int [] liczby2;

    public Tablica(int[] liczby)
    {
          this.liczby=liczby;

    }
    public int suma()
    {
        int suma=0;
        for(int i=0;i<liczby.length;i++)
        {
            suma=liczby[i]+suma;

        }
        return suma;

    }

    public int srednia()
    {

       int srednia2=suma()/(liczby.length);
       return srednia2;


    }

    public int min()
    {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<liczby.length;i++)
        {
            if(liczby[i]<min)
            {
                min=liczby[i];
            }
        }
        return min;
    }

    public int max()
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<liczby.length;i++)
        {
            max=liczby[i];
        }
        return max;
    }




}
