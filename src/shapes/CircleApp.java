package shapes;

import util.Input;

public class CircleApp {
    //From curriculum 'class named CircleApp that prompts the user for the radius of the circle using your Input class'
    public static void main(String[] args){
        Input input = new Input();

        System.out.println("Enter a cirlces radius");
        double radius = input.getDouble(); //at first it highlights '.getDouble' cuz input double is not public. Therefore you had to go into your Input class and make 'double getDouble()' method 'public' like this: 'public double getDouble()' [line 54 in Input class]

        Circle circle = new Circle(radius);
        double circumference = circle.getCircumference();
        double area = circle.getArea();
        System.out.printf("Radius is %f:%n", radius);
        System.out.printf("The circumference is %f and area is %f.%n", circumference, area); //Shan did 'printf' cuz its 'easier'?






    }
}
