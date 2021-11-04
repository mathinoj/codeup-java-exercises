package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5

//        box1

//        declare a variable of the type Measurable named myShape.

        Measurable myShape = new Square(5);
        System.out.println("getArea of square = " + myShape.getArea());
        System.out.println("getPerimeter of square = " + myShape.getPerimeter());

         myShape = new Rectangle(5, 7);
        System.out.println("getArea of rectangle = " + myShape.getArea());
        System.out.println("getPerimeter of rectangle = " + myShape.getPerimeter());



        //Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.


//myShape.getLength(); it doesn't let you do, this is NUMBER 10


    }
}
