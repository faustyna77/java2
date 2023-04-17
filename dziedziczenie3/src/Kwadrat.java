public class Kwadrat extends Figura {


    protected float bok1;
    protected float bok2;

    public Kwadrat(float bok1,float bok2)
    {
        super(bok1);
        this.bok2=bok2;
    }

    @Override
    public float pole(float bok1)
    {
        return (bok1*2);

    }

    public float obwod(float bok1)
    {
        return (4*bok1);
    }


}
