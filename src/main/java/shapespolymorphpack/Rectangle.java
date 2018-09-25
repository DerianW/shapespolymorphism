package shapespolymorphpack ;

public class Rectangle extends Shape
{
    private double width ;

    Rectangle(double sideLength, double width)
    {
        super(sideLength) ;
        this.width = width ;
    }

    @Override
    public double calculateArea()
    {
        return getSide() * width ;
    }
}