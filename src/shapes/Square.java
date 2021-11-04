package shapes;

public class Square extends Quadrilateral {

    public Square(int side){
        super(side, side);
    }


    public double getPerimeter() {
        return length * 4;
    }


    public double getArea() {
        return length * width;
    }


    public int length() {
        return 0;
    }


    public int width() {
        return 0;
    } //before you quad you had 'Rectangle'


//    public Square(int side){
//        super(side, side);
        //super is calling parent constructor (Rectangle constructor)
//    }





//Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
}
