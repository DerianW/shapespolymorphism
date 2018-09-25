package shapespolymorphpack ;

public class Main
{
    public static void main(String[] args)
    {
        Shape recty = new Rectangle(12, 13) ;
        Shape triang = new Triangle(8, 7) ;

        System.out.println( recty.calculateArea() ) ;
        System.out.println( triang.calculateArea() ) ;

        Shape[] shapesies = {new Rectangle(5, 16), new Triangle(7, 3)} ;

        for (Shape q : shapesies)
        {
            System.out.println( q.calculateArea() );
        }
    }
}