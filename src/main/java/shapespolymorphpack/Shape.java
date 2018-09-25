package shapespolymorphpack ;

public class Shape
{
    private double sideLength ;

    Shape(double sideLength)
    {
        this.sideLength = sideLength ;
    }

    public double getSide() { return sideLength ; }

    public double calculateArea() { return sideLength * sideLength ; }
}