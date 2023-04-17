public class Kolo extends Figura {

    protected float promien;


    public Kolo(float promien)
    {
        super(promien);

    }


    @Override
    public float pole(float promien)
    {
        return (promien*promien);
    }


}
