package shapes;

public class Circle {
    private double radius;//From the curriculum 'this class should have a private radius field'

    //constructor below this
    public Circle(double radius){ //THIS constructor was provided by curriculum
//       radius = radius;
       this.radius = radius; //
    }

    public double getArea(){
        return Math.PI * radius * radius;
        //area = pi x (radius ^ 2)
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;

    }


    //GIVEN IN CURRICULUM
    //circumference = 2 x pi x radius
    //area = pi x (radius ^ 2)
}
