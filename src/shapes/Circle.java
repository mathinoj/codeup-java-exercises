package shapes;

public class Circle {
    private double radius;//From the curriculum 'this class should have a private radius field'

    //constructor below this
    public Circle(double radius){ //THIS constructor was provided by curriculum
//        radius = radius; //MIGHT BE ALSO ABLE TO DO LIKE THIS
       radius = radius;
       this.radius = radius; // the above doesn't work cuz when both have the same name it doesn't recognize. Therefore use 'this.'
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
