package shapespolymorphpack ;

public class Triangle extends Shape
{
    private double height ;

    Triangle(double sideLength, double height)
    {
        super(sideLength) ;
        this.height = height ;
    }

    @Override
    public double calculateArea()
    {
        return getSide() * height / 2;
    }
}
